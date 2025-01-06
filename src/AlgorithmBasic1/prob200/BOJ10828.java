package AlgorithmBasic1.prob200;

import java.io.*;
import java.util.*;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>(); //스택 선언


        //명령어
        String[] inputs;
        String cmd;
        for(int i = 0; i<N; i++){
            inputs = br.readLine().split(" ");
            cmd = inputs[0];
            if(cmd.contentEquals("push")){
                stack.push(Integer.parseInt(inputs[1]));

            }else if(cmd.contentEquals("pop")){
                if(!stack.isEmpty()) {
                    Integer pop = stack.pop();
                    System.out.println(pop);
                } else
                    System.out.println(-1);

            }else if(cmd.contentEquals("size")){
                System.out.println(stack.size());

            }else if(cmd.contentEquals("empty")){
                if(stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);

            }else{
                //"top"
                if(stack.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }
    }
}


/**
 * 1. 스택도 Deque을 사용하자. (push, pop, peek, isEmpty, size, search)
 * 2. pop과 peek는 원소 없으면 EmptyStackException 발생
 * 3. if - else 말고 switch case도 사용하자.
 */
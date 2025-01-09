package AlgorithmBasic1.prob200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] inputs;
        String cmd;
        int value;

        Deque<Integer> queue = new ArrayDeque<>();

        while(n-- > 0){
            inputs = br.readLine().split(" ");
            cmd = inputs[0];
            switch (cmd){
                case "push":
                    value = Integer.parseInt(inputs[1]);
                    queue.offer(value);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.peekFirst());
                    break;
                case "back":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.peekLast());
                    break;
            }

        }


    }
}

/**
 * java queue 자료구조 : deque 사용하기
 * 1. offer, poll
 * 2. peek, peekFirst, peekLast
 * 3. size, isEmpty
 */
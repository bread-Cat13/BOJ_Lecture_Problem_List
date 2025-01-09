package AlgorithmBasic1.prob200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ10866 {
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
                case "push_front":
                    value = Integer.parseInt(inputs[1]);
                    queue.addFirst(value);
                    break;
                case "push_back":
                    value = Integer.parseInt(inputs[1]);
                    queue.addLast(value);
                    break;
                case "pop_front":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.pollFirst());
                    break;
                case "pop_back":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.pollLast());
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
 * deque 자료구조 (양방향 가능)
 * 1. 조회: peekFirst, peekLast
 * 2. 추가: addFirst, addLast
 * 3. 삭제: pollFirst, pollLast
 */
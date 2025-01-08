package AlgorithmBasic1.prob200;

import java.util.*;
import java.io.*;

public class BOJ1874_memoryExceed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> stackA = new ArrayDeque<Integer>();
        Deque<Integer> stackB = new ArrayDeque<Integer>();

        int[] arr = new int[n];

        int target, idx = 0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            stackA.push((n-i));
        }

        int top;
        boolean success = true;
        while(!stackA.isEmpty() && idx<n){

            //단계 시작 - B에 필요한 만큼 수 넣기
            target = arr[idx]; //필요한 수
            top = stackA.peek();
            while(top<=target){
                stackB.push(stackA.pop());
                sb.append("+").append("\n");
                if(!stackA.isEmpty())
                    top = stackA.peek();
                else break;
            }

            if(idx==n-1 && !stackB.isEmpty()){
                if(stackB.peek() == target){
                    stackB.pop();
                    sb.append("-").append("\n");
                    idx++;
                }else{
                    success = false;
                }
                break;
            }

            while ((idx+1) < n){
                if(arr[idx] == (arr[idx+1] + 1)){
                    stackB.pop();
                    sb.append("-").append("\n");
                    idx++;
                }else if(arr[idx] < arr[idx+1]){
                    stackB.pop();
                    sb.append("-").append("\n");
                    idx++;
                    break;
                }
                else{
                    for (Integer integer : stackB) {
                        if (integer == arr[idx]) {
                            stackB.pop();
                            sb.append("-").append("\n");
                            idx++;

                        } else {
                            success = false;
                            break;
                        }
                    }
                }
            }

            if(!success || idx == n)
                break;
        }

        if(success){
            while(idx<n && !stackB.isEmpty()){
                if(stackB.peek() == arr[idx]){
                    stackB.pop();
                    sb.append("-").append("\n");
                    idx++;
                }else{
                    success = false;
                    break;
                }
            }
        }
        if(!success || idx!=n){
            System.out.println("NO");
            return;
        }

        System.out.println(sb);


    }
}

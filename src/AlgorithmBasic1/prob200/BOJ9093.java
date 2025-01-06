package AlgorithmBasic1.prob200;

import java.io.*;

public class BOJ9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            printReverse(br.readLine().split(" "));
        }
    }

    static void printReverse(String[] inputs){
        int wordCount = inputs.length;
        String string;
        int len;

        for(int j = 0; j<wordCount; j++){
            string = inputs[j];
            len = string.length();
            String ans = "";

            for(int i = 0; i<(len/2); i++){
                ans = string.substring(0, i)
                        + string.charAt(len-1-i)  //len-1-i
                        + string.substring(i+1, (len-1-i))
                        + string.charAt(i) // i
                        + string.substring((len-i));
                string = ans;
            }
            System.out.print(string + " ");
        }
        System.out.println();


    }
}

/**
 * 단순히 각 단어를 문자열로 보고 뒤집는 방법도 있지만
 * 문장 전체를 char로 쪼개서 빈칸이 나오면 그 전까지 뒤집어 출력하는 방식도 존재 (단어 순서는 같아야 하기에 가능)
 */

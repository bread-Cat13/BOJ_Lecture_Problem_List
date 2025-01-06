package AlgorithmBasic1.prob200;

import java.io.*;
import java.util.*;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] line;
        int len;
        String ans;
        Deque<Character> stack;
        for(int i = 0; i < n; i++){
            stack = new ArrayDeque<>();
            line = br.readLine().toCharArray();
            len = line.length;
            ans = "YES";

            for(int j = 0; j < len; j++){
                if((len%2)!=0){
                    ans = "NO";
                    break;
                }

                if(line[j] == '('){
                    stack.push('(');
                }else{
                    if(!stack.isEmpty())
                        stack.pop();
                    else{
                        ans = "NO";
                        break;
                    }
                }

            }
            if(!stack.isEmpty()){
                ans = "NO";
            }
            System.out.println(ans);
        }
    }
}

/**
 * 참고할 코드
 * import java.util.*;
 *
 * class Main {
 * 	public static void main(String[]V) {
 * 		Scanner S = new Scanner(System.in);
 * 		for(int T = S.nextInt(); T > 0; T--) {
 * 			String s = S.next();
 * 			int a = 0, i = 0;
 * 			for(; i < s.length();) {
 * 				a+=s.charAt(i++)=='('?1:-1;
 * 				if(a<0)break;
 * 			            }
 * 			System.out.println(a==0?"YES":"NO");
 * 		}
 * 	}
 * }
 *
 * => push 대신 +1을 pop 대신 -1로 간주 + 음수면 쌍이 안 맞기에 NO로 처리
 * => 최종적으로 합이 0이면 쌍이 맞는 것.
 */

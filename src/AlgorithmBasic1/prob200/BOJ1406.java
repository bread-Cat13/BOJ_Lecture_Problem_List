package AlgorithmBasic1.prob200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        LinkedList<Character> ll = new LinkedList<>();

        for(int i = 0; i<input.length(); i++){
            ll.add(input.charAt(i));
        }
        int n = Integer.parseInt(br.readLine());

        ListIterator<Character> iter = ll.listIterator(ll.size());


        String fullCmd;
        char cmd;
        char add;

        while(n-- > 0){
            fullCmd = br.readLine();
            cmd = fullCmd.charAt(0);

            switch (cmd){
                case 'L':
                    if(iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if(iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    add = fullCmd.charAt(2);
                    iter.add(add);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ll) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}


/**
 * 커서는 요소와 요소 사이에 있으며, cursor가 이동한 후, 지나온 요소를 반환
 */

/**
 * 추가의 경우.. iterator.add(e)
 * Inserts the specified element into the list (optional operation).
 * The element is inserted immediately before the element that would be returned by next, if any, and after the element that would be returned by previous, if any.
 * (If the list contains no elements, the new element becomes the sole element on the list.)
 * The new element is inserted before the implicit cursor: a subsequent call to next would be unaffected, and a subsequent call to previous would return the new element.
 * (This call increases by one the value that would be returned by a call to nextIndex or previousIndex.)
 * 즉, 커서 위치에 요소가 추가되며, 추가된 요소 뒤에 커서가 위치됨. -> previous로 조회가능
 */
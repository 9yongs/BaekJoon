/* 23.09.26 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder(s);

		
		/* 1. 출력하면서 검사
		System.out.println(s.equals(sb.reverse().toString()) ? 1 : 0);
		*/

		/* 2. 앞뒤 바꾼 문자를 만든 후 검사
		String reverse = sb.reverse().toString();
		System.out.println( s.equals(reverse) ? 1 : 0);
		*/
	}
}

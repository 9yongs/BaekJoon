/* 23.09.25작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // StringBuilder 에 있는 문자열을 뒤집는 메소드 reverse()
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 뒤집은 문자열을 Integer.parseInt로 int값으로 변경

		System.out.println(A>B ? A:B); // (조건식 ? 참 값 : 거짓 값)
	}
}

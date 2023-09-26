/* 23.09.26 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder(s);

		System.out.println(s.equals(sb.reverse().toString()) ? 1 : 0);
	}
}

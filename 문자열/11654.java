/* 23.09.22 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
		
		String s = br.readLine();
		int a = s.charAt(0);

		System.out.println(a);
	}
}

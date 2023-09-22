/* 23.09.22 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += br.read() - '0';
		}
		System.out.println(sum);
	}
}

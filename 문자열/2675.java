/* 23.09.25작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			
			String [] str =br.readLine().split(" ");

			int R = Integer.parseInt(str[0]); // 0번째 반복횟수 int 형으로 변경
			String S = str[1];                // 1번째 문자

			for (int j = 0; j < S.length(); j++) {  // 문자길이만큼 반복
				for (int k = 0; k < R; k++) {         
					System.out.print(S.charAt(j));      // K번째 위치한 문장 j, R만큼반복입력
				}
			}
			System.out.println();
		}
	}
}

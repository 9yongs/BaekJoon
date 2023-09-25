/* 23.09.25작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          

		int [] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch-'a'] == -1) {       // arr의 원소값 이 -1 일때 초기화
 				arr[ch-'a'] = i;             // 아스키코드로 변환하기 때문에 0~26번째 순서를 맞추기 위해 'a' 또는 97을 빼준다.
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

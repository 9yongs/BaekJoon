/* 23.09.20 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 없는값을 찾기위해 부울 배열 사용
		boolean [] arr = new boolean[31];

    // 과제 낸 사람 체크
		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = true;
		}

    // 1 ~ 30의 배열중에 없는 값(false) 출력
		for (int i = 1; i < 31; i++) {
			if (!arr[i]) System.out.println(i);
		}
	}
}

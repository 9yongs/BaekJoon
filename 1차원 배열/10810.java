/* 23.09.20 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 바구니 갯수 N, 던지는 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int [] arr = new int[N];
		int M = Integer.parseInt(st.nextToken());

    // I번 바구니 ~ J번 바구니, K번이 적힌 공
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

      // 배열 인덱스는 0부터 시작하므로 I-1을 해준다.
			for (int j = I-1 ; j < J; j++) {
				arr[j] = K;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

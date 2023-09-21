/* 23.09.21 작성 */
/* 배열 사용 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));              
        
		double [] arr = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		double sum = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i]/arr[arr.length-1])*100;
		}
		System.out.println(sum/arr.length);
	}
}

/* 23.09.21 작성 */
/* 배열 사용X */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));              
        
		int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int max = -1;
		double sum = 0.0;

		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());

			if(a > max){
				max = a;
			}

			sum += a;
		}
		System.out.println(((sum/max)*100)/N);
	}
}

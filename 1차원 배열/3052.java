/* 23.09.20 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean 배열을 사용한 경우
public class Main {
	public static void main(String[] args) throws IOException{
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean [] arr = new boolean[42];

    // 입력받은 수에서 42를 나누었을때 나온값을 true로 바꿈
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine())%42] = true;
		}
		int count = 0;
    
    // true의 값을 세아림, 같은수가 여러번 나왔어도 ture의 값은 하나이기 때문에 자동으로 중복값이 없어짐
		for (int i = 0; i < arr.length; i++) {
			boolean value = arr[i];
			if(value){
				count ++;
			}
		}
		System.out.println(count);
	}
}

/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/

// HashSet을 사용한 경우 (HashSet : 배열에서 중복된 값을 제거)
public class Main {
	public static void main(String[] args) throws IOException{
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer>h = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(h.size()); // h 배열의 값 갯수를 나타냄
	}
}

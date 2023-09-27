/* 23.09.27 작성 */
// if문 사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int len = str.length();
		int count = 0;

		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);

			if(ch == 'c' && i < len - 1) {                  // 길이 -1 만큼 해줘야 참조 할 수 있다
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;		
				}
				
			}
		    
			else if(ch == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == '-') {
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {       // dz= 경우 2개가 더 붙기때문에 -2만큼 길이를 줄인다.
					
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
		    
			else if((ch == 'l' || ch == 'n') && i < len - 1) {
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
		    
			else if((ch == 's' || ch == 'z') && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}
		    }
			count++;
		}
		System.out.println(count);
	}
}

// contains, replace method 사용
/* 23.09.27 작성 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c-","c=","dz=","d-","lj","nj","s=","z="};

        for(int i = 0; i < arr.length ; i++){
            if(str.contains(arr[i])){          // 단어가 배열에 포함되었을 경우 0으로 변환
                str = str.replace(arr[i],"0");
            }
        }
        System.out.println(str.length()); // 단어의 총 길이를 출력. 크로아티아언어는 0으로 변환되어서 한개로 인식 ( "c-" => "0" )
    }
}

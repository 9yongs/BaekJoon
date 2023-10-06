/* 23.10.05 작성 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());       // 진법
        int total = 0;
        int temp = 1;       // 몇번째 위치인지

        for (int i = str.length()-1; i >= 0; i--) {    // 끝에서 시작해야 한다
            char ch = str.charAt(i);
            if('A' <= ch && ch <='Z'){
                total += (ch-'A'+10) * temp;  // A는 10 
            }
            else{
                total += (ch-'0') * temp; 
            }
            temp *= N;
        }
        System.out.println(total);
    }    
}

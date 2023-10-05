/* 23.10.05 작성 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char [][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            if(str.length()> max) max = str.length();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') continue;       // char 의 초기값은 '\0' 이다
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }    
}

/* 23.09.18 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int N, X값 토큰으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();

        // 배열 값 토큰으로 분리
        st = new StringTokenizer(br.readLine()," ");
        
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < X) {
                sb.append(value).append(' ');
            }   
        }
        System.out.println(sb);
    }
}

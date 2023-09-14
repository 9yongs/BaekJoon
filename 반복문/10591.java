/* 23.09.14 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

      // 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
        while ( (str=br.readLine())!=null) {

            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append((A+B)).append("\n");
            
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.09.14 작성

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int result = num1 + num2;

            sb.append("Case #").append(i+1).append(": ").append(num1).append(" + ")
            .append(num2).append(" = ").append(result).append('\n');
            
        }
        
        br.close();

        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.09.12 작성

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        // BufferedReader 는 문자열을 한 줄로 읽기 때문에 A와 B을 구분하기 위해 공백을 기준으로 문자열을 분리해주어야 하므로 StringTokenizer 사용
        // 두번째 줄에 출력해야하는 변수 하나는 StringTokenizer가 아닌 기본 입력을 사용
        int C = Integer.parseInt(br.readLine());

        int min = 60 * A + B;
        min += C;

        int hour = (min/60)%24;
        int minute = min%60;
        System.out.println(hour + " " + minute);
    }
}


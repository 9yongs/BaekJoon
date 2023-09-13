import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.09.13 작성

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        
        // for문에서 중괄호 생략가능 -> why? : 첫번째 문장은 루프에 속해져서 가능, 두 개 이상의 문장 작성시 첫번째 문장만 루프에 인식됨.
        // for (int i = 1; i <= a; i++)sum+=i;
        
        // 가독성을 위해서 중괄호 사용.
        
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

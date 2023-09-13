import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.09.11 작성

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M<45){
            if(H==0){
                H=23;
            }
            else{
                H--;
            }
            M = 60-(45-M); 
            System.out.println(H + " " + M);
        }
        else{
            System.out.println(H +" "+ (M-45));
        }
    }
}

/* 
BufferedReader 을 쓰는 방식이다.
readLine() 을 통해 입력 받아 연산하는 방법 두 가지를 설명할 것이다.
앞서 말했듯이 readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.

그리고 반드시 자료형 타입을 잘 보아야 한다.
st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
*/

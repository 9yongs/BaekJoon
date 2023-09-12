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
        int C = Integer.parseInt(st.nextToken());
        
        // 세개 다 다를경우
        if( A!=B && B!=C && A!=C){
            int max;
            if (A>B) {
                if(C>A){
                    max = C;
                }
                else{
                    max = A;
                }
            }
            else{
                if(B>C){
                    max = B;
                }
                else{
                    max = C;
                }
            }

            System.out.println(max*100);
        }

        // 세개 다 같을경우
        else{
            if(A==B && B==C){
                System.out.println(10000 + 1000*A);
            }

            // A가 B 또는 C랑 같을경우
            else{
                if(A==B || A==C){
                    System.out.println(1000 + 100*A);
                }

                // B랑 C가 같을경우
                else{
                    System.out.println(1000 + 100*B);
                }
            }
        }    
    }
}


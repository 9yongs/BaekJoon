/* 23.10.05 작성 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean [][] arr = new boolean[100][100];
        
        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            for (int j = X; j < X+10; j++) {
                for (int k = Y; k < Y+10; k++) {
                    if(!arr[j][k]){
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }    
}

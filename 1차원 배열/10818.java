/* 23.09.18 작성 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        
        /* for문 
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        */

        /* while 문
        int index = 0;
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index ++; 
        }
        */
      
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[N-1]);
    }
}

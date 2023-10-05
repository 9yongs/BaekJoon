/* 23.10.05 작성 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;      // 여기서 new StringTokenizer(br.readline()," ")으로 하니깐 NullPointer 런타임 오류가 떴다.
        
        int N = 0;
        int M = 0;
        int Max = 0;

        int [][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                    if(Max < arr[i][j]){
                        Max = arr[i][j];
                        N = i;
                        M = j;
                    }
                }
            }
        System.out.println(Max);
        System.out.println((N+1)+" "+(M+1));
    }    
}

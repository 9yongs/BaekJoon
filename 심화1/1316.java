/* 23.10.04 작성 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());
        int Count = N;
        
        for (int i = 0; i < N; i++) {
            boolean [] check = new boolean[26];
            String str = br.readLine();
            int len = str.length();
            int prev = 0;

            for (int j = 0; j < len; j++) {
                int now = str.charAt(j);
                    if (prev != now) {
                        if (!check[now - 'a']) {
                            check[now - 'a'] = true;
                            prev = now;
                        }
                        else{
                            Count--;
                            break;
                        }
                    }
                continue;
            }
        }
        System.out.println(Count);
    }
}

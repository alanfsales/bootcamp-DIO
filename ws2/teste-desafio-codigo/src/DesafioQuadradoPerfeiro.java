import java.util.*;

public class DesafioQuadradoPerfeiro {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];
        
        d[0] = 0;
        for (int i = 1; i <= n; i++) {
            d[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                d[i] = Math.min(d[i], d[i - j * j] + 1);
            }
        }
        System.out.println(d[n]);
        
       
    }
    
}
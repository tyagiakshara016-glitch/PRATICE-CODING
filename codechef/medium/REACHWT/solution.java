import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();

            int cost = (N / 2) * 30;

            if (N % 2 == 1) {
                cost += 20;  // one 1 kg weight
            }

            System.out.println(cost);
        }
        
        sc.close();
    }
}
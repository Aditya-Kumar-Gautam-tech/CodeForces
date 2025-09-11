import java.util.*;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
    }
}

import java.util.*;

public class Hallomiboxes{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       
       while( t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] arr2 = Arrays.copyOf(arr, n);
            Arrays.sort(arr2);
            if(Arrays.equals(arr,arr2)){
                System.out.println("YES");
            }else{
                if(k <= 1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }

       }
    }
}
import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i = 0;i<n;i++){
                arr.add(sc.nextLong());
            }
            arr.add(0,(long)0);
            arr.add(x);
            n = arr.size();
            // System.out.println(arr.toString());
            long minVol = Long.MIN_VALUE;
            for(int i = 1;i<n;i++){
                if(i == (n-1)){
                    minVol = Math.max(minVol,(arr.get(i)-arr.get(i-1))*2);
                }else{
                    minVol = Math.max(minVol,(arr.get(i)-arr.get(i-1)));
                }
                
            }
            System.out.println(minVol);

        }
    }
    
}

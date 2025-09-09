import java.util.*;

public class DoremyPaint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                int a = s.nextInt();
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a,1);
                }
            }
            if(map.size() == 2 ){
                int[] arr = new int[2];
                int i = 0;
                for(Integer k : map.keySet()){
                    arr[i++] = map.get(k);
                }
                if(arr[0] == arr[1] ||arr[0] == arr[1]-1 || arr[1] == arr[0]-1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else if(map.size() == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    
}


/*
 * a1+a2 = a2+a3 = a3+a4 = a4+a5 = a5+a6 = a6+a7 = a7+a8
 * a1 = a3 = a5 = a7
 * a2 = a4 = a6 = a8
 * 
 * 
 * 1 1 4 4
 * 1 4 1 4
 * 
 * 
 * 2 3 3 3 3
 * 2 2 2 2 3 3 3 3
 * 3 2 3 2 3 2 3 2
 */
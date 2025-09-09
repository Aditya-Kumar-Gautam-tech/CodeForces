import java.util.*;
public class CoverWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            int spower = 0;
            long one = 0;
            for(int i = 0;i<n;i++){
                
                if(ch[i] == '#' || spower == 3){
                    if(spower == 3){
                        break;
                    }else{
                        spower = 0;
                        continue;
                    }

                }
                else{
                    spower++;
                    one++;
                }
            }
            if(spower==3){
                System.out.println(2);
            }else{
                System.out.println(one);
            }
        }
    }
}

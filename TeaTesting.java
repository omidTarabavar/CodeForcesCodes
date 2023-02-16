import java.util.ArrayList;
import java.util.Scanner;

public class TeaTesting {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t ;i++){
            int n = keyboard.nextInt();
            ArrayList<Long> teaAmount = new ArrayList<>();
            ArrayList<Long> testerLimit = new ArrayList<>();
            ArrayList<Long> testerDrinkAmount = new ArrayList<>();
            for(int j = 0 ; j< n ;j++){
                teaAmount.add((long) keyboard.nextInt());
            }
            for(int k = 0; k < n;k++){
                testerLimit.add((long) keyboard.nextInt());
            }
            for(int z = 0 ; z < n ; z++){
                testerDrinkAmount.add(0L);
            }
            for(int m = 0 ; m < n ;m++){
                for(int f = n-1;f >= m;f--){
                    int amount = (int) Math.min(testerLimit.get(f),teaAmount.get(f-m));
                    teaAmount.set(f-m,teaAmount.get(f-m)-amount);
                    testerDrinkAmount.set(f,testerDrinkAmount.get(f)+amount);
                }
            }
            for(int l = 0 ;l<n;l++){
                System.out.print(l != n-1 ? ""+testerDrinkAmount.get(l)+" ":""+testerDrinkAmount.get(l));
            }
            System.out.println();
        }

    }
}

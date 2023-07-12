import java.util.Arrays;
import java.util.Scanner;

public class MochaArray2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t ; i++) {
            int n = keyboard.nextInt();

//            ArrayList<Integer> numArrs = new ArrayList<>();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = keyboard.nextInt();
            }
            boolean done = false;
//            Collections.sort(numArrs);
            Arrays.sort(nums);
                for(int j = 0 ; j < n ; j++){
                    if(!done) {
                        for (int k = j + 1; k < n; k++) {
                            if (isGood(nums[j], nums[k])) {
                                System.out.println("Yes");
                                done = true;
                                break;
                            }
                        }
                    }else {
                        break;
                    }
                }
                for(int j = 0 ; j < n-1;j++){
                    int a = nums[j];
                    int b = nums[j+1];
                    if(!isGood(a,b)){
                        System.out.println("Yes");
                        break;
                    }
                }
                if(!done)
                    System.out.println("No");
            }
    }

    static boolean isGood(int a, int b){
        int bmm = 0;
        return shomarande(a,b) <= 2;
    }
    static int shomarande(int a ,int b){
        int bmm= 0;
        for(int i = 1 ; i <=Math.min(a,b);i++){
            if(a % i == 0 && b % i == 0){
                bmm = i;
            }
        }
        return bmm;
    }
}

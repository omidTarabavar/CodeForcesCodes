import java.util.Arrays;
import java.util.Scanner;

public class AirportManagment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t,n,a,d;
        t = keyboard.nextInt();
        for(int i = 0; i < t; i++)
        {
            n = keyboard.nextInt();
            int[] nums = new int[2*n];
            for(int j = 0; j < 2*n; j++)
            {
                nums[j] = keyboard.nextInt();
            }
            int cnt = 1;
            Arrays.sort(nums);
            for(int k = 0; k < 2*n; k++){
                int tmp = 1;
                for(int l = k+1; l < 2*n; l++){
                    if(nums[k] == nums[l])
                        tmp += 1;
                    else
                        break;
                }
                cnt = Math.max(cnt,tmp);
            }
            System.out.println(cnt);
        }

    }

}

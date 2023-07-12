import java.util.Arrays;
import java.util.Scanner;

public class RadebandiAsatid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = keyboard.nextInt();
        }
        Arrays.sort(numbers);
        int result = 1;
        for(int i = n-1; i >= 0; i--){
            if(numbers[i] >= result)
                result++;
            else
                break;
        }
        System.out.println(result-1);
    }
}

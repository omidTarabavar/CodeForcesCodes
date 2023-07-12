import java.util.ArrayList;
import java.util.Scanner;

public class EjtemaeBazeHa {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        ArrayList<Integer> bazeha = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String baze = keyboard.next();
            for(int j = 0; j < bazeha.size(); j++){
                int avalBaze,akharBaze;
                if(baze.charAt(1) != '-') {
                    if (baze.charAt(0) == '[')
                        avalBaze = baze.charAt(1) - '0';
                    else
                        avalBaze = baze.charAt(1) - '0' - 1;
                }else {
                    avalBaze = -2147483648;
                }
                if(baze.charAt(baze.length()-1) != 'f'){

                }
            }
        }
    }
}

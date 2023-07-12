import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CodeShokolat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int k=keyboard.nextInt(),v = keyboard.nextInt(),n = keyboard.nextInt(),result =0;
        ArrayList<Integer> cakes = new ArrayList<>();
        ArrayList<Integer> costs = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int cake = keyboard.nextInt();
            if(cake % (k+1) == 1 && cake > (k+1))
            {
                cakes.add(cake);
                index.add(i);
            }
        }
        int temp = 0;
        for(int i = 0; i < n; i++){
            int cost = keyboard.nextInt();
            if(temp < index.size() && i == index.get(temp)){
                costs.add(cost);
                temp += 1;
            }
        }
        Collections.sort(costs);
        for(Integer i : costs)
        {
            if(i <= v){
                v -= i;
                result += 1;
            }
        }
        System.out.println(result);

    }
}

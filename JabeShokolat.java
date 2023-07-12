import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JabeShokolat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, k, v;
        k = keyboard.nextInt();
        v = keyboard.nextInt();
        n = keyboard.nextInt();
        ArrayList<Integer> cakes = new ArrayList<>(n);
        ArrayList<Integer> prices = new ArrayList<>(n);
        for(int i = 0; i < n; i++)
            cakes.add(keyboard.nextInt());
        for(int i = 0; i < n; i++)
            prices.add(keyboard.nextInt());
        int result = 0;
        for(int i = 0; i < n; i++){
            if(v > 0 && i < cakes.size())
            {
                int index = prices.indexOf(Collections.min(prices));
                if(cakes.get(i) >= (k+2) && prices.get(index) <= v  && cakes.get(index) % (k+1) == 1)
                {
                    result += 1;
                    v -= prices.get(index);
                }
                cakes.remove(i);
                prices.remove(i);
            }else
                break;
        }
        System.out.println(result);

    }
    static int findMin(ArrayList<Integer> arr)
    {
        int min = 2100000;
        int index = 0;
        for(int i = 0; i < arr.size();i++)
        {
            int item = arr.get(i);
            if(item < min)
            {
                index = i;
                min = item;
            }
        }
        return index;
    }
}

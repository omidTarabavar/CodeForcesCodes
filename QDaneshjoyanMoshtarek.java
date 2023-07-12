import java.util.ArrayList;
import java.util.Scanner;

public class QDaneshjoyanMoshtarek {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n,k,q;
        n = keyboard.nextInt();
        k = keyboard.nextInt();
        q = keyboard.nextInt();

        ArrayList<ArrayList<Integer>> classes = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            int m = keyboard.nextInt();
            ArrayList<Integer> classi = new ArrayList<>(m);
            for(int j = 0; j < m; j++)
                classi.add(keyboard.nextInt());
            classes.add(classi);
        }
        for(int i = 0; i < q; i++)
        {
            ArrayList<Integer> reqClass = new ArrayList<>();
            int l = keyboard.nextInt();
            for(int j = 0; j < l; j++)
            {
                reqClass.add(keyboard.nextInt()-1);
            }
            int result = 0;
            for(int o = 0; o < classes.get(reqClass.get(0)).size();o++)
            {
                int item = classes.get(reqClass.get(0)).get(o);

                boolean flag = true;
                for(Integer reqClasses: reqClass)
                {
                    if(!classes.get(reqClasses).contains(item))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    result += 1;
            }
            System.out.println(result);
        }
    }
}

import java.util.*;

public class MochaArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = keyboard.nextInt();

            ArrayList<Integer> numArrs = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                numArrs.add(keyboard.nextInt());
            }
            if(n >= 3) {
                if(isGood(numArrs)) {
                    if(!isBeautifull(numArrs)) {
                        Collections.sort(numArrs);
                        if (isBeautifull(numArrs))
                            System.out.println("Yes");
                        else
                            System.out.println("No");
                    }else {
                        System.out.println("Yes");
                    }
                }else {
                    System.out.println("No");
                }
            }else {
                System.out.println("No");
            }

        }
    }
    static boolean isBeautifull(ArrayList<Integer> list){
        ArrayList<Integer> tempList = new ArrayList<>();
        if(isGood(list)) {
            for (int i = 0; i < list.size(); i++) {
                tempList.add(list.get(i));
                if (tempList.size() >= 2) {
                    if (!isGood(tempList))
                        return false;
                }
            }
        }
        return true;
    }
    static boolean isGood(ArrayList<Integer> list){
        int bmm=0;
        for(int i = 1 ; i  <= findMin(list);i++){
            if(shomarande(list,i)){
                bmm = i;
            }
        }
        return bmm <= list.size();
    }
    static int findMin(ArrayList<Integer> list){
        int min = 999999999;
        for(Integer integer:list){
            if(integer < min)
                min = integer;
        }
        return min;
    }
    static boolean shomarande(ArrayList<Integer> list,int a){
        for (Integer integer:list){
            if(integer % a != 0)
                return false;
        }
        return true;
    }
}

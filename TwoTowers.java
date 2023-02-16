import java.util.ArrayList;
import java.util.Scanner;

public class TwoTowers {
    public static void main(String[] args) {
        ArrayList<Character> tower1;
        ArrayList<Character> tower2;
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t ;i++){
            tower1 = new ArrayList<>();
            tower2 = new ArrayList<>();
            int n = keyboard.nextInt();
            int m = keyboard.nextInt();
            String t1 = keyboard.next();
            for(int j = 0; j < n ;j++){
                tower1.add(t1.charAt(j));
            }
            String t2 = keyboard.next();
            for(int k = 0 ; k < m ;k++){
                tower2.add(t2.charAt(k));
            }
            boolean chTower1 = checkTower(tower1);
            boolean chTower2 = checkTower(tower2);
            if(!chTower1 && chTower2){
                while (tower1.size() >= 1 && !checkTower(tower1)){
                    removeTop(tower1,tower2);
                }
                if(checkTower(tower1) && checkTower(tower2)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else if (chTower1 && !chTower2){
                while (tower2.size() >= 1 && !checkTower(tower2)){
                    removeTop(tower2,tower1);
                }
                if(checkTower(tower2) && checkTower(tower1)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else if (!checkTower(tower1) && !checkTower(tower2)){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
    static boolean checkTower(ArrayList<Character> tower){
        for(int i = 1 ; i < tower.size();i++){
            if(tower.get(i) == tower.get(i-1))
                return false;
        }
        return true;
    }
    static void removeTop(ArrayList<Character> tower1,ArrayList<Character> tower2){
        tower2.add(tower1.remove(tower1.size()-1));
    }
}

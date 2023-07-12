import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int n = keyboard.nextInt();
//        Set<String> pos = new HashSet<>();
        Map<String,Integer> pos = new HashMap<>();
        int x = 0;
        int y = 0;
        pos.put("00",0);
        String moves = keyboard.next();
        for(int i =0 ; i < n ; i++){
            switch (moves.charAt(i)){
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
            }
            String temp = ""+x+""+y;
            if(pos.containsKey(temp)){
                System.out.println("Yes");
                return;
            }else {
                pos.put(temp,0);
            }
        }
        System.out.println("No");

    }
}

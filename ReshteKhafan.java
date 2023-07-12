import java.util.Scanner;

public class ReshteKhafan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for (int i = 0; i < t; i++) {
            int n = keyboard.nextInt();
            int q = keyboard.nextInt();
            String temp = keyboard.next();
            for (int j = 0; j < q; j++) {
                int l = keyboard.nextInt() - 1;
                int r = keyboard.nextInt() - 1;
                boolean flag = false;
                for (int k = l; k <= r; k++) {
                    int amnt = 0;
                    for (int m = k; m <= r; m++) {
                        if (temp.charAt(m) == temp.charAt(k))
                            amnt++;
                        if (m >= k + 2 && amnt > ((m - k) + 1) / 2) {
                            System.out.println("YES");
                            flag = true;
                            break;
                        }
                    }
                    if (flag)
                        break;
                }

                if (!flag) {
                    System.out.println("NO");
                }
            }
        }
    }
}

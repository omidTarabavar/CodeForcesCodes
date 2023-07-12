import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BallDistribution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] boxes;
        int t, n, m;
        t = keyboard.nextInt();
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            n = keyboard.nextInt();
            m = keyboard.nextInt();
            boxes = new int[n];
            int sIndex = -1;
            for (int z = 0; z < m; z++) {
                int ball = keyboard.nextInt();
                int rep = n - (n % (ball));
                for (int j = 0; j < rep; j++) {
                    if (ball != 0) {
                        sIndex = sIndex + 1;
                        if (sIndex >= n)
                            sIndex = 0;
                        boxes[sIndex] += 1;
                        if (boxes[sIndex] == m)
                            cnt += 1;
                        ball -= 1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}

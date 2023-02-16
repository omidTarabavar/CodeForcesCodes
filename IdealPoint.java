import java.util.ArrayList;
import java.util.Scanner;

public class IdealPoint {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<int[]> segments;
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t ;i++){
            int n = keyboard.nextInt();
            int k = keyboard.nextInt();
            segments = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                int[] segment = {keyboard.nextInt(),keyboard.nextInt()};
                segments.add(segment);
            }
            removeSegments(segments,k);
            if(segments.size() > 0) {
                int min = findMin(segments);
                int max = findMax(segments);
                int resultk = 0;
                int maxResult = 0;
                boolean flag = false;
                for (int j = min; j <= max; j++) {
                    int temp = coveringSegments(segments, j);
                    if (j == k) {

                        resultk = temp;
                    }
                    if (temp > maxResult) {
                        if (j == k) {
                            flag = true;
                        } else {
                            flag = false;
                        }
                        maxResult = temp;
                    }else if(temp == maxResult && j != k){
                        flag = false;
                    }
                }
                if (resultk >= maxResult && flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("NO");
            }
        }
    }
    static int coveringSegments(ArrayList<int[]> segments,int x){
        int result = 0;
        for(int[] segment:segments){
            if(x >= segment[0] && x <= segment[1])
                result += 1;
        }
        return result;
    }
    static int findMin(ArrayList<int[]> segments){
        int min = segments.get(0)[0];
        for(int[] segment:segments){
            if(segment[0] < min)
                min = segment[0];
        }
        return min;
    }
    static int findMax(ArrayList<int[]> segments){
        int max = segments.get(0)[1];
        for(int[] segment:segments){
            if(segment[1] > max)
                max = segment[1];
        }
        return max;
    }
    static void removeSegments(ArrayList<int[]> segments,int k){
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = segments.size()-1; i >= 0;i--){
            if(!(segments.get(i)[0] <= k && segments.get(i)[1] >= k))
                indexes.add(i);
        }
        for(int index:indexes){
            segments.remove(index);
        }
    }

}

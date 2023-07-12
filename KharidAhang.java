import java.util.ArrayList;
import java.util.Scanner;

public class KharidAhang {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        int p = keyboard.nextInt();
        int[] albumPrice = new int[m];
        int[] indexOfAlbum = new int[m];
        ArrayList<int[]> songs = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a =keyboard.nextInt();
            if(indexOfAlbum[a-1] == 0){
                a = i+1;
            }
            int priceSong = keyboard.nextInt();
            int v = keyboard.nextInt();
            int[] song = {a,priceSong,v};
            songs.add(song);
        }
        for(int i = 0;i < m; i++){
            albumPrice[i] = keyboard.nextInt();
        }

    }
//    int findMax(int[] albumPrice,int[] indexOfAlbum,ArrayList<int[]> songs,int[] max,int money){
//
//    }
}

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int n = keyboard.nextInt();
        int k =keyboard.nextInt();
//        int max
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = keyboard.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            for(int j = i+1 ; j < n ; j++){
                for(int z = j+1; z < n; z++){
                    int first = arr[i];
                    int second = arr[j];
                    int third = arr[z];
                    int num = 0;
                    while (num > first && num > second && num > third && !contrain(arr,num)){
                        num += 1;
                    }
                }
            }
        }
    }
    static boolean contrain(int[] arr,int x){
        for(int i = 0 ;i  < arr.length;i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
}

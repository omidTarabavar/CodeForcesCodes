import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String a = keyboard.next();
        rec(a.toCharArray(),0);
    }
    static void rec(char[] a,int index){
        boolean flag = true;
        for(int i = index; i < a.length;i++){
            if(a[i] == '?'){
                flag = false;
                a[i] = '1';
                rec(a,i);
                a[i] = '0';
                rec(a,i);
                a[i] = '?';
                break;
            }
        }

        if(flag) {
            typeCharArr(a);
        }
    }
    static void typeCharArr(char[] arr){
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

}

import java.util.Scanner;

public class AbiatGhabelGhabol {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int n = keyboard.nextInt();
        char[] chars = new char[n];
        int result = 0;
        String inp = keyboard.next();
        for(int i = 0; i < n; i++)
        {
            char cur = inp.charAt(i);
            if(i == 0 || i == 1)
                chars[i] = cur;
            else if(cur == '0')
            {
                if(!checkArr(chars,cur))
                {
                    chars[i] = '1';
                    result += 1;
                }else {
                    chars[i] = cur;
                }
            }else{
                if(!checkArr(chars,cur)){
                    chars[i] = '0';
                    result += 1;
                }else {
                    chars[i] = cur;
                }
            }
        }
        System.out.println(result);
    }
    static boolean checkArr(char[] a,char b)
    {
        String check;
        int index = 0;
        if(b == '0')
            check = "01";
        else
            check = "10";
        for(int i = 0 ;i < a.length; i++)
        {
            if(a[i] == check.charAt(index))
            {
                index += 1;
            }
            if(index == 2)
                break;
        }
        return index != 2;
    }

}

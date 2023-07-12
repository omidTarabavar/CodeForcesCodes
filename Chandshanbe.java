import java.util.Scanner;

public class Chandshanbe {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int i = 0 ; i < t; i++){
            int day1,month1,dayOfWeek1,day2,month2;
            day1 = keyboard.nextInt();
            month1 = convertMonth(keyboard.next());
            dayOfWeek1 = convertDayOfWeek(keyboard.next());
            day2 = keyboard.nextInt();
            month2 = convertMonth(keyboard.next());

            for(int j = month1; j <= month2; j++){
                if(j <= 6){
                    dayOfWeek1 = ((dayOfWeek1 + 3) % 7) + 1;
                }
                else if(j <= 11){
                    dayOfWeek1 = (dayOfWeek1 + 2) % 7 + 1;
                }
                else {
                    dayOfWeek1 = (dayOfWeek1 + 1) % 7 + 1;
                }
            }
            dayOfWeek1 = (dayOfWeek1 + Math.abs(day1 - day2)) % 7 + 1;
            System.out.println(convertWeekToDay(dayOfWeek1));


        }
    }
    static String convertWeekToDay(int a){
        switch (a){
            case 1:{
                return "shanbe";
            }
            case 2:{
                return "1shanbe";
            }
            case 3:{
                return "2shanbe";
            }
            case 4:{
                return "3shanbe";
            }
            case 5:{
                return "4shanbe";
            }
            case 6:{
                return "5shanbe";
            }
            case 7:{
                return "jome";
            }
        }
        return "";
    }
    static int convertDayOfWeek(String day){
        switch (day){
            case "shanbe":{
                return 1;
            }
            case "1shanbe":{
                return 2;
            }
            case "2shanbe":{
                return 3;
            }
            case "3shanbe":{
                return 4;
            }
            case "4shanbe":{
                return 5;
            }
            case "5shanbe":{
                return 6;
            }
            case "jome":{
                return 7;
            }
        }
        return 0;
    }
    static int convertMonth(String month){
        switch (month){
            case "Farvardin":{
                return 1;
            }
            case "Ordibehesht":{
                return 2;
            }
            case "Khordad":{
                return 3;
            }
            case "Tir":{
                return 4;
            }
            case "Mordad":{
                return 5;
            }
            case "Shahrivar":{
                return 6;
            }
            case "Mehr":{
                return 7;
            }
            case "Aban":{
                return 8;
            }
            case "Azar":{
                return 9;
            }
            case "Dey":{
                return 10;
            }
            case "Bahman":{
                return 11;
            }
            case "Esfand":{
                return 12;
            }
        }
        return 0;
    }
}

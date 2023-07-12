import java.util.ArrayList;
import java.util.Scanner;

public class HesabVaKetab {
    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
        public double income(){
            double result = 0;
            for(Double amount : transAmount){
                if(amount < 0)
                    result += amount;
            }
            return -1*result;
        }
        public double outcome(){
            double result = 0;
            for(Double amount : transAmount){
                if(amount > 0)
                    result += amount;
            }
            return result;
        }
        public void trans(String nameOther,double amount){
            if(transNames.contains(nameOther)){
                int index = transNames.indexOf(nameOther);
                transAmount.set(index,transAmount.get(index) + amount);
            }else {
                transNames.add(nameOther);
                transAmount.add(amount);
            }
        }
        ArrayList<String> transNames = new ArrayList<>();
        ArrayList<Double> transAmount = new ArrayList<>();
    }
    static Person findPerson(ArrayList<Person> people, String name){
        for(Person p:people) {
            if (p.name.equals(name)){
                return p;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int q  = keyboard.nextInt();
        ArrayList<Person> people = new ArrayList<>();
        for(int i = 0;i < q; i++){
            int reqNum = keyboard.nextInt();
            switch (reqNum){
                case 1:{
                    String name1 = keyboard.next();
                    String name2 = keyboard.next();
                    double amount = keyboard.nextDouble();
                    if(findPerson(people,name1) != null){
                        findPerson(people,name1).trans(name2,amount);
                    }else {
                        people.add(new Person(name1));
                        people.get(people.size()-1).trans(name2,amount);
                    }
                    if(findPerson(people,name2) != null){
                        findPerson(people,name2).trans(name1,-1*amount);
                    }else {
                        people.add(new Person(name2));
                        people.get(people.size()-1).trans(name1,-1*amount);
                    }
                    break;
                }
                case 2:{
                    String name="";
                    double max = -999;
                    for(Person person:people){
                        double persTotal = person.income() - person.outcome();
                        if(persTotal > 0 && persTotal >= max){
                            if(persTotal == max){
                                if(person.name.compareToIgnoreCase(name) < 0){
                                    name = person.name;
                                }
                            }else {
                                max = persTotal;
                                name = person.name;
                            }
                        }
                    }
                    if(max == -999){
                        System.out.println(-1);
                    }else {
                        System.out.println(name);
                    }
                    break;
                }
                case 3:{
                    String name="";
                    double max = 999;
                    for(Person person:people){
                        double persTotal = person.income() - person.outcome();
                        if(persTotal < 0 && persTotal <= max){
                            if(persTotal == max){
                                if(person.name.compareToIgnoreCase(name) > 0){
                                    name = person.name;
                                }
                            }else {
                                max = persTotal;
                                name = person.name;
                            }
                        }
                    }
                    if(max == 999){
                        System.out.println(-1);
                    }else {
                        System.out.println(name);
                    }
                    break;
                }
                case 4:{
                    String s = keyboard.next();
                    int res = 0;
                    for(Double money:  findPerson(people,s).transAmount){
                        if(money < 0)
                            res+= 1;
                    }
                    System.out.println(res);
                    break;
                }
                case 5:{
                    String s = keyboard.next();
                    int res = 0;
                    for(Double money:  findPerson(people,s).transAmount){
                        if(money > 0)
                            res+= 1;
                    }
                    System.out.println(res);
                    break;
                }
                case 6:{
                    String name1 = keyboard.next();
                    String name2 = keyboard.next();
                    Person p1 = findPerson(people,name1);
                    double money;
                    try {
                        money = p1.transAmount.get(p1.transNames.indexOf(name2));

                    }catch (IndexOutOfBoundsException e){
                        money = 0;
                    }
                    if(money != 0)
                        money = -1*money;

                    System.out.println(String.format("%.2f",money));
                    break;
                }
            }
        }
    }
}

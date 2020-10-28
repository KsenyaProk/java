public class HomeworkOne {

    public static void main(String[] args){
        byte by = 127;
        short s = 32767;
        int i = 10;
        long l = 640000000;
        float f = 120;
        double d = 38383;
        char c;
        boolean bool = true;

        System.out.println("Значение выражения = " + expression(1,3,4,2));

        checkSum(12,50);
        checkNumber(9);
        System.out.println(checkNegative(-8));
        System.out.println("Привет, " + name() + "!");
        System.out.println("Год " + checkYear(2021));
    }

    public static int expression(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    public static void checkSum(int a, int b){
        if(a+b>10){
            if(a+b<=20){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
    }

    public static void checkNumber(int n) {
        if(n>=0){System.out.println("n-положительное");}
        else {System.out.println("n-отрицательное");}
    }

    public static boolean checkNegative(int value){
        return value<0;
    }

    public static String name(){
        return "Kсения";
    }
    
    public static String checkYear(int year){
        if(year%400==0){
            return "високосный";
        }
        else{
            if(year%4==0 && year%100!=0){
            return "високосный";
            }
        }
        return "невисокосный";
    }
}

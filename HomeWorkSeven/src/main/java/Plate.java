import java.util.Scanner;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(){
        System.out.println("Добавить еды?\n1 - да / 0 - нет");
        Scanner scan = new Scanner(System.in);
        int yesNo = scan.nextInt();
        if (yesNo==1) {
            Scanner scan2 = new Scanner(System.in);
            int add = scan2.nextInt();
            if (add > 1 && add <= 100 && add <= food) {
                food += add;
                info();
            }
            if (add<=0){
                System.out.println("Так нельзя!");
            }
            if (add>100){
                System.out.println("Слишком много!");
            }
        }
    }

}

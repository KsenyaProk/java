public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0]=new Cat("Барсик",50);
        cats[1]=new Cat("Мурзик",10);
        cats[2]=new Cat("Семён",3);
        cats[3]=new Cat("Гром",15);
        cats[4]=new Cat("Мяучело",30);

        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat:cats) {
            cat.eat(plate);
        }
    }
}

public class AppTest {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 210, 1);
        cat.run(cat.lengthRun);
        cat.swim(cat.lengthSwim);
        cat.jump(cat.height);

        Dog dog1 = new Dog(1, 600, 3);
        dog1.run(dog1.lengthRun);
        dog1.swim(dog1.lengthSwim);
        dog1.jump(dog1.height);

    }
}

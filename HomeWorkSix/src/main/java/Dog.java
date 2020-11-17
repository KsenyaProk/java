public class Dog extends Animal{

    int height;
    int lengthRun;
    int lengthSwim;

    public Dog(int height, int lengthRun, int lengthSwim){
        this.name="Собака";
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
        this.height = height;
        maxRun = 500;
        maxSwim = 10;
        maxJump = 0.5f;
    }
}

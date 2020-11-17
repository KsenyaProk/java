public class Cat extends Animal {

    int height;
    int lengthRun;
    int lengthSwim;

    public Cat(int height, int lengthRun, int lengthSwim){
        this.name="Кот";
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
        this.height = height;
        maxRun = 200;
        maxSwim = 0;
        maxJump = 2;
        }
    }


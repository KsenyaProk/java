public class Animal {

    public int height;
    public int lengthRun;
    public int lengthSwim;
    public int maxRun;
    public int maxSwim;
    public float maxJump;
    public String name;


    public void run(int lengthRun){
        this.lengthRun = lengthRun;
        boolean canRun = lengthRun <= maxRun;
        System.out.println(name + " бежит " + lengthRun + " м. Это - " + canRun);
    }

    public void swim(int lengthSwim){
        boolean canSwim = lengthSwim <= maxSwim;
        this.lengthSwim = lengthSwim;
        System.out.println(name + " плывет " + lengthSwim + " м. Это - " + canSwim);
    }

    public void jump(int height){
        this.height = height;
        boolean canJump = height <= maxJump;
        System.out.println(name + " прыгает " + height + " м. Это - " + canJump);
    }




}

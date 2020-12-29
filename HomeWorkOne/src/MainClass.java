import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        //1
        Integer[] intArr = new Integer[2];
        intArr[0] = 1;
        intArr[1] = 2;
        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        //2
        ArrayList<Integer> arrList = toArrayList(intArr);
        System.out.println("arrList: "+arrList);

        //3
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        float orange1Weigth = orangeBox1.getWeight();
        float orange2Weigth = orangeBox2.getWeight();
        float appleWeigth = appleBox.getWeight();
        System.out.println("Вес 1-ой коробки с апельсинами: " + orange1Weigth);
        System.out.println("Вес 2-ой коробки с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}

public class HomeWorkFive {

    static final int size = 10;
    static final int h = size/2;
    static float[] arr = new float[size];
    static long a;
    static float[] a1=new float[h];
    static float[] a2=new float[h];

    private static void fillArray(){
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    private static void methodOne(){
        fillArray();
        a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(arr[i]);
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a + " - время работы");
    }

    private static void methodTwo(){
        fillArray();
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);//деление массива на два
        System.arraycopy(arr, h, a2, 0, h);

        new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                System.out.println(a1[i]);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                System.out.println(a2[i]);
            }
        }).start();

        System.arraycopy(a1, 0, arr, 0, h);//склейка двух в один
        System.arraycopy(a2, 0, arr, h, h);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a + " - время работы");
    }

    public static void main(String[] args) {
        //methodOne();
        methodTwo();
    }
}

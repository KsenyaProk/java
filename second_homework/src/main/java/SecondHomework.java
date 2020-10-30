public class SecondHomework {

    public static void main(String[] args) {

        firstMas();
        secondMas();
        thirdMas();
        fourthMas();
        fifthMas();
        System.out.println(sixthMas(new int[]{1,1,1,2,5}));
        seventhMas(new int[]{5,6,7},-5);
    }

    public static void firstMas(){
        int[] mas = new int[]{1,1,0,0,1,0,1,1,0,0};
        for(int i=0;i<mas.length;i++){
            if(mas[i]==1){System.out.print(mas[i]=0);}
            else{
                System.out.print(mas[i]=1);}
        }
        System.out.println();
    }

    public static void secondMas(){
        int[] mas = new int[8];
        for (int i = 0; i<mas.length; i++){
            System.out.print((mas[i]=i*3) + " ");
        }
        System.out.println();
    }

    public static void thirdMas(){
        int[] mas = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i<mas.length; i++){
            if (mas[i]<6){
                System.out.print((mas[i]*=2) + " ");
            }
            else {System.out.print(mas[i] + " ");}
        }
        System.out.println();
    }

    public static void fourthMas() {
        int[][] mas = new int[4][4];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i == j) {
                    System.out.print((mas[i][j] = 1) + " ");
                } else {
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void fifthMas(){
        int[] mas = new int[]{-2,25,1,8,77,3};
        int min = mas[0];
        int max = mas[0];
        for(int i=0; i<mas.length; i++){
            if (mas[i]<min){
                min=mas[i];
            }
            if (mas[i]>max){
                max=mas[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

    public static boolean sixthMas(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += mas[j];
            }
            for (int j = i; j < mas.length; j++) {
                rightSum += mas[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public static void seventhMas(int[] mas, int n){
        if (n>0) {
            for (int i = 0; i < n; i++) {
                int t = mas[mas.length - 1];
                for (int j = mas.length - 1; j > 0; j--) {
                    mas[j] = mas[j - 1];
                }
                mas[0] = t;
            }
        }
        else if (n<0){
            for (int i = 0; i < (-1)*n; i++) {
                int t = mas[0];
                for (int j = 0; j<mas.length-1; j++) {
                    mas[j] = mas[j + 1];
                }
                mas[mas.length - 1] = t;
            }
        }
        for (int i : mas){
            System.out.print(i + " ");}
    }
}

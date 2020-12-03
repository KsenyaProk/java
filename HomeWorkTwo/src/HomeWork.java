public class HomeWork {

    private static final String[][] array = new String[][]{
            {"1","2","3","4"},
            {"5","6","7","8"},
            {"9","10","11","12"},
            {"13","14","15","16"}
    };

//    private static final String[][] array1 = new String[][]{
//            {"1","2","3","4"},
//            {"5","6","7","8"},
//            {"9","10","11","12"},
//    };
//
//    private static final String[][] array2 = new String[][]{
//            {"1","2","3","4"},
//            {"5","f","7","8"},
//            {"9","10","11","12"},
//            {"13","14","15","16"}
//    };

    private static void sumArrayElements(){
        int sum=0;
        checkArraySize();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(array[i][j]+"\t");
                    try {
                        sum+=Integer.parseInt(array[i][j]);
                    }catch (NumberFormatException e){
                        throw new MyArrayDataException();
                    }
                }
                System.out.println();
            }
        System.out.println("Сумма элементов массива = "+sum);
    }

    private static void checkArraySize(){
        if(array.length!=4){
            throw new MyArraySizeException();
        }
        for(String[] strings : HomeWork.array){
            if (strings.length!=4) {
                throw new MyArraySizeException();
            }
        }
    }

    public static void main(String[] args) {
        sumArrayElements();
    }
}

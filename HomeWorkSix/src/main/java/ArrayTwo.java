public class ArrayTwo {
    public boolean doTaskWith (int[] arr) {
        boolean one = false;
        boolean four = false;
        boolean number = false;
        for (int a : arr) {
            if (a != 1 && a !=4){
                number = false;
            }
            if (a == 1){
                one = true;
                number = true;
            }
            if (a == 4){
                four = true;
                number = true;
            }
        }
        System.out.println(one&&four&&number);
        return (one && four&&number);
    }
}


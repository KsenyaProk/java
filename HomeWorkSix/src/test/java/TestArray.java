import org.junit.Test;

public class TestArray {

    @Test
    public void firstTestArr(){
        ArrayOne arrayOne = new ArrayOne();
        int[] arr = {1,2,4,4,2,3,4,1,7};
        arrayOne.doTaskWith(arr);
    }

    @Test(expected = RuntimeException.class)
    public void firstTestArrNoFour(){
        ArrayOne arrayOne = new ArrayOne();
        int[] arrNoFour = {1,2,2,3,1,7};
        arrayOne.doTaskWith(arrNoFour);
    }

    @Test
    public void firstTest1ArrLastFour(){
        ArrayOne arrayOne = new ArrayOne();
        int[] arrLastFour = {1,2,2,3,4};
        arrayOne.doTaskWith(arrLastFour);
    }

    @Test
    public void firstTest1ArrFirstFour(){
        ArrayOne arrayOne = new ArrayOne();
        int[] arrFirstFour = {4,1,2,2,3};
        arrayOne.doTaskWith(arrFirstFour);
    }

    @Test
    public void secondTestArr1(){
        ArrayTwo arrayTwo = new ArrayTwo();
        int[] arr = {1,1,1,4,4,1,4,4};
        arrayTwo.doTaskWith(arr);
    }

    @Test
    public void secondTestArr2(){
        ArrayTwo arrayTwo = new ArrayTwo();
        int[] arr = {1,1,1,1,1,1};
        arrayTwo.doTaskWith(arr);
    }

    @Test
    public void secondTestArr3(){
        ArrayTwo arrayTwo = new ArrayTwo();
        int[] arr = {4,4,4,4};
        arrayTwo.doTaskWith(arr);
    }

    @Test
    public void secondTestArr4(){
        ArrayTwo arrayTwo = new ArrayTwo();
        int[] arr = {1,4,4,1,1,4,3};
        arrayTwo.doTaskWith(arr);
    }
}

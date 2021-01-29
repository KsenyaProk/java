public class Tests {

    @BeforeSuite
    public void before(){
        System.out.println("Before");
    }

    @Test(priority = 10)
    public void test1(){
        System.out.println("test1 priority 10");
    }

    @Test
    public void test2(){
        System.out.println("test2 priority default 5");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("test3 priority 1");
    }

    @Test(priority = 7)
    public void test4(){
        System.out.println("test4 priority 7");
    }

    @Test
    public void test5(){
        System.out.println("test5 priority default 5");
    }

    @AfterSuite
    public void after(){
        System.out.println("After");
    }
}

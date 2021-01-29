import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){
        start();
    }

    private static void start() {
        Method[] methods = Tests.class.getDeclaredMethods();
        try {
            int count1 = 0;
            for (Method o : methods) {

                if (o.getAnnotation(BeforeSuite.class) != null) {
                    if (count1 == 1) throw new RuntimeException();
                    System.out.println(o);
                    count1++;
                }
            }
            for (int i = 1; i < 11; i++) {
                for (Method o : methods) {
                    if (o.getAnnotation(Test.class) != null) {
                        Test test =
                                o.getAnnotation(Test.class);
                        if (test.priority() == i) {
                            System.out.println(o);
                            System.out.println("priority: " + test.priority());
                        }
                    }
                }
            }
            int count2 = 0;
            for (Method o : methods) {
                if (o.getAnnotation(AfterSuite.class) != null) {
                    if (count2 == 1) throw new RuntimeException();
                    System.out.println(o);
                    count2++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

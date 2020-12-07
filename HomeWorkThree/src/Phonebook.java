import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    static HashMap<String,String> hm = new HashMap<>();
    private static void phonebook(){
        hm.put("55-10-10","Ivanov");
        hm.put("23-13-23","Petrov");
        hm.put("10-10-01","Sobolev");
        for (Map.Entry<String,String> map : hm.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }
    }

    //добавлять записи
    private static void add(){
        hm.put("58-29-28","Kosygin");
        hm.put("20-30-40","Ivanov");
    }

    //искать номер телефона по фамилии
    private static void get(){
        System.out.println("По заданной фамилии нашлось: ");
        for (Map.Entry<String,String> map : hm.entrySet()){
            if (map.getValue().equals("Ivanov")){
            System.out.println(map.getKey() + " - " + map.getValue());}
        }
    }

    public static void main(String[] args) {
        add();
        phonebook();
        get();
    }
}

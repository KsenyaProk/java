import java.util.*;

public class ArrayWords {

    private static final String[] words = new String[]{
                "Apple","Pen","Computer","Door","Chat",
        "Orange","Club","Pen","Photo","Window",
    "Phone","Orange","Pen","Table","Wall"};

    public static void main(String[] args) {
        Set set = new LinkedHashSet(Arrays.asList(words));
        System.out.println(set);

        HashMap<String,Integer> hm = new HashMap<>();
        for (String word : words){
            if (hm.containsKey(word)){
                hm.put(word,hm.get(word)+1);
            }else {hm.put(word,1);}
        }
        Set<String> keys = hm.keySet();
        for (String key:keys){
            if(hm.get(key)>1){
            System.out.println(key + " встречается "+hm.get(key)+" раз(а)");
            }
        }

    }
}

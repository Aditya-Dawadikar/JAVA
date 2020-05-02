package collection1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String ags[]){
        LinkedHashMap<String,String> lhm= new LinkedHashMap<>();
        lhm.put("afewg","segh");
        lhm.put("naghth","wfegesg");
        lhm.put("adsffg","idol");
        lhm.put(null,null);
        lhm.put(null,"hello");
        lhm.put("hello",null);
        System.out.println("key\tvalue");
        for(Map.Entry m: lhm.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}

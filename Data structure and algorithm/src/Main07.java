import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main07 {
    public String[] countString (String[] inputArray) {
        if(inputArray==null||inputArray.length==0)return null;
        String[] strings=new String[inputArray.length];
        Map<String,Integer> map = new HashMap<>();
        int j = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<inputArray.length;i++){
            if(map.containsKey(inputArray[i])){
                map.put(inputArray[i],map.get(inputArray)+1);
            }else {
                map.put(inputArray[i],1);
            }
        }
       Set<String> set1 = map.keySet();
        for (String c:set1){
            if(map.get(c)!=1){
                strings[j++]=c;
            }
        }
        // write code here
        return strings;
    }
}

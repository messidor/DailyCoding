
import java.util.*;
public class Day7Test {
    public static void main(String[] args) {
        Day7 day7 = new Day7();
        String[][] arr = new String[][]{
                {}
        };
        System.out.println(arr.length);
        HashMap<String, String> output = day7.convertListToHashMap(arr);
        System.out.println(output);
    }
}


class Day7 {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:

        HashMap<String,String> result = new HashMap<String,String>();

        if(arr.length==0){

        }
        for(int i=0; i<arr.length; i++){
            if(arr[i].length!=0) {
                if (!result.containsKey(arr[i][0])) {
                    result.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return result;
    }


}

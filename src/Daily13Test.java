import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Daily13Test {
    public static void main(String[] args) {
        Daily13 d13 = new Daily13();
        String[] input = new String[]{
                "hello",
                "wolrd",
                "wrd",
                "",
                "wolr",
        };
        String output = d13.readVertically(input);
        System.out.println(output);
    }
}

class Daily13 {
    public String readVertically(String[] arr) {
        // TODO:
        if(arr.length ==0){
            return "";
        }
        int arri=0;
        int maxLength=0;
        String result="";

        LinkedHashMap<Integer, Integer> arrStrLength = new LinkedHashMap<>();
        for(int i=0; i<arr.length;i++){
            arrStrLength.put((Integer)i,(Integer)arr[i].length());
            if(maxLength<(Integer)arr[i].length()){ maxLength = arr[i].length(); };
        }
        //arrStrLength.values().remove(0);

        for( int i =0;i<maxLength;i++){
            for (int j = 0; j < arr.length; j++) {
                //System.out.println("값"+arrStrLength.get(i));

                Integer temp = arrStrLength.get(j);
                if(temp!=0){
                    result += arr[j].charAt(i);
                    arrStrLength.put(j,temp-1);
                }

            }
        }

        return result;
    }
}
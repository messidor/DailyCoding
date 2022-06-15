import java.util.*;

public class Day11Test {
    public static void main(String[] args) {
        Day11 d11= new Day11();

        String[] output = d11.removeExtremes(new String[]{"a", "b", "c", "def","bef","aef"});
        for(int i=0; i< output.length;i++) {
            System.out.println(output[i]); // --> ["a"', "b"]
        }
    }

}
class Day11 {
    public String[] removeExtremes(String[] arr) {
        ArrayList<String> resultAL = new ArrayList<>();
        // TODO:
        if(arr.length==0){
            return null;
        }

        String[] result = new String[arr.length-2];


        int maxLength=0;
        int minLength=20;


        int maxIndex=0;
        int minIndex=0;
        for(int i=0; i<arr.length;i++) {
            if(arr[i].length() >= maxLength){
                maxLength= arr[i].length();
                maxIndex = i;
            }
            if((arr[i].length() <= minLength)){
                minLength= arr[i].length();
                minIndex = i;
            }
        }
        for(int i=0;i< arr.length;i++){
            if((i!=maxIndex)&&(i!=minIndex)){
                resultAL.add(arr[i]);
            }
        }

        /*
        //max remove
        if(maxIndex>minIndex) {
            String[] prevArry = Arrays.copyOfRange(arr, 0, minIndex - 1);
            String[] middleArray = Arrays.copyOfRange(arr, minIndex+1, maxIndex - 1);
            String[] nextArry = Arrays.copyOfRange(arr, maxIndex+1, arr.length-1);
            System.arraycopy(result,0,prevArry,0,prevArry.length);
            System.arraycopy(result,prevArry.length,middleArray,0,middleArray.length);
            System.arraycopy(result,middleArray.length,nextArry,0,nextArry.length);

        }
        else if(minIndex>maxIndex){
            String[] prevArry = Arrays.copyOfRange(arr, 0, maxIndex - 1);
            String[] middleArray = Arrays.copyOfRange(arr, maxIndex+1, minIndex - 1);
            String[] nextArry = Arrays.copyOfRange(arr, minIndex+1, arr.length-1);
            System.arraycopy(result,0,prevArry,0,prevArry.length);
            System.arraycopy(result,prevArry.length,middleArray,0,middleArray.length);
            System.arraycopy(result,middleArray.length,nextArry,0,nextArry.length);
        }
*/
        return resultAL.toArray(resultAL.toArray(new String[0]));
    }
}

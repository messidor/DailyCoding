import java.util.ArrayList;
import java.util.Arrays;

public class Day21Test {
    public static void main(String[] args) {
        Day21 d21 = new Day21();
        int output = d21.largestProductOfThree(new int[]{2, 1, 3, 7});

        System.out.println(output); // --> 42 (= 2 * 3 * 7)

    }
}


class Day21 {
    public int largestProductOfThree(int[] arr) {
        // TODO:
        int result=0;
        if(arr.length<3){
            return 0;
        }
        int case1=0;
        int case2=0;
        Arrays.sort(arr);
        case1 = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];  //가장 큰수 3개의곱
        case2 = arr[arr.length-1] * arr[0] * arr[1];                        //가장 작은 음수 2개x가장큰수
        result = (case1>=case2) ? case1 : case2;
        return result;
    }
}

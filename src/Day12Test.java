import java.util.Arrays;

public class Day12Test {
    public static void main(String[] args) {
        Day12 d12 = new Day12();
        int[] temp ={1, 2, 3};
        int[] output = d12.reverseArr(temp);
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
}
class Day12 {
    public int[] reverseArr(int[] arr) {
        // TODO:
        if (arr.length == 0) {
            return new int[]{};
        }
        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] result = new int[head.length + tail.length];
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        return result;
    }
}
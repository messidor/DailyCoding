public class Day14Test {
    public static void main(String[] args) {
        Day14 d14 = new Day14();
        boolean output = d14.superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
        System.out.println(output); // --> true
    }
}

class Day14 {
    public boolean superIncreasing(int[] arr) {
        // TODO:
        int sumArr=arr[0];
        boolean result=false;
        for(int i=1 ;i<arr.length;i++){
            if(arr[i]>sumArr){
                result= true;
            }
            else {
                return false;
            }
            sumArr += arr[i];

        }

        return true;
    }
}

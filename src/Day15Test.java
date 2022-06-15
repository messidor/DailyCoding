public class Day15Test {

    public static void main(String[] args) {
        Day15 d15 = new Day15();
        Integer output = d15.modulo(25, 4);
        System.out.println(output); // --> 1
    }
}

class Day15 {
    public Integer modulo(int num1, int num2) {
        // TODO:
        Integer result = new Integer(num1);
        if(num2==0){
            return null;
        }

        while(result>=num2){
            result -= num2;
        }

        return result;
    }
}

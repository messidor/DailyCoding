import java.util.ArrayList;

public class Day23Test {
    public static void main(String[] args) {
        Day23 d23 = new Day23();
        int output = d23.fibonacci(9);
        System.out.println(output); // --> 34
    }
}

class Day23 {
    public int fibonacci(int num) {
        // TODO:
        ArrayList<Integer> fiboList = new ArrayList<>();
        if(num==0){
            return 0;
        }
        if(num<=2){
            return 1;
        }
        else {
            fiboList.add(0);
            fiboList.add(1);
        }
        return fibo(fiboList,num);
    }

    public int fibo(ArrayList<Integer> fiboList, int num){
        if(fiboList.size() <= num){
            fiboList.add(fiboList.get(fiboList.size()-2)+fiboList.get(fiboList.size()-1) );
            fibo(fiboList,num);
        }
        return fiboList.get(num);
    }
}
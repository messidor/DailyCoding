import java.math.BigDecimal;
import java.math.RoundingMode;

public class Day17Test {
    public static void main(String[] args) {
        Day17 d17 = new Day17();
        String output = d17.computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

    }
}
class Day17 {
    public String computeSquareRoot(int num) {
        // TODO:

        BigDecimal numRoot = new BigDecimal("0.000");
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num01 = new BigDecimal("0.1");
        BigDecimal num001 = new BigDecimal("0.01");
        BigDecimal num0001 = new BigDecimal("0.001");

        if(num%2==0) {
            numRoot = BigDecimal.valueOf(num/2);
        }
        else
            numRoot = BigDecimal.valueOf((num/2)+1);

        BigDecimal[] decTemp = new BigDecimal[3];

        boolean[] checkUD = new boolean[8];    //0 : 1자리수적을떄 1 : 1자리수클떄 2 : 0.1자리수적을떄 3 : 0.1자리수클떄 4 : 0.01자리수적을떄 5 : 0.01자리수 클떄
        for(int i =0; i<checkUD.length;i++){
            checkUD[i]=false;
        }



        while((checkUD[0]==false) || (checkUD[1]==false)) {
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== -1 ){ //적을때
                checkUD[0]=true;
                numRoot = numRoot.add(num1);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 1 ){ //많을때
                checkUD[1]=true;
                numRoot = numRoot.subtract(num1);
           }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 0 ){ //많을때
                numRoot = numRoot.setScale(2, RoundingMode.HALF_EVEN);
                return numRoot.toString();
            }

        }

        while((checkUD[2]==false) || (checkUD[3]==false)) {
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== -1 ){ //적을때
                checkUD[2]=true;
                numRoot = numRoot.add(num01);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 1 ){ //많을때
                checkUD[3]=true;
                numRoot = numRoot.subtract(num01);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 0 ){ //많을때
                numRoot = numRoot.setScale(2, RoundingMode.HALF_EVEN);
                return numRoot.toString();
            }
        }

        while((checkUD[4]==false) || (checkUD[5]==false)) {
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== -1 ){ //적을때
                checkUD[4]=true;
                numRoot = numRoot.add(num001);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 1 ){ //많을때
                checkUD[5]=true;
                numRoot = numRoot.subtract(num001);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 0 ){ //많을때
                numRoot = numRoot.setScale(2, RoundingMode.HALF_EVEN);
                return numRoot.toString();
            }
        }

        while((checkUD[6]==false) || (checkUD[7]==false)) {
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== -1 ){ //적을때
                checkUD[6]=true;
                numRoot = numRoot.add(num0001);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 1 ){ //많을때
                checkUD[7]=true;
                numRoot = numRoot.subtract(num0001);
            }
            if(numRoot.multiply(numRoot).compareTo( BigDecimal.valueOf(num) )== 0 ){ //많을때
                numRoot = numRoot.setScale(2, RoundingMode.HALF_EVEN);
                return numRoot.toString();
            }
        }

        numRoot = numRoot.setScale(2, RoundingMode.HALF_EVEN);


        return numRoot.toString();
    }
}
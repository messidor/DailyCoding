public class Day18Test {
    public static void main(String[] args) {
        Day18 d18 = new Day18();
        int output = d18.numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 1
    }
}

class Day18 {
    public int numberSearch(String str) {
        // TODO:
        double resultD=0f;
        int countChar=0;

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){   //숫자만 합함
                resultD += (double)(str.charAt(i)-'0');
            }
            else if(str.charAt(i)!=' '){            //숫자와 빈문자열 제외한 문자길이
                countChar++;
            }
        }

        resultD /= countChar;

        return (int)Math.round(resultD);

    }
}

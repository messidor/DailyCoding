import java.util.Locale;

public class Day9Test {
    public static void main(String[] args) {
        Day9 day9 = new Day9();
        boolean output = day9.ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }
}
class Day9 {
    public boolean ABCheck(String str) {
        // TODO:
        String temp="";
        if(str!=null){
            temp = str.toLowerCase();
        }
        int i=0;
        while(i+4 <temp.length()){
            if((temp.charAt(i)=='a')&&(temp.charAt(i+4)=='b')){
                return true;
            }
            if((temp.charAt(i)=='b')&&(temp.charAt(i+4)=='a')){
                return true;
            }
            i++;
        }


        return false;
    }
}

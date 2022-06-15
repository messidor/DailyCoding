import java.util.*;

public class Day16Test {
    public static void main(String[] args) {
        Day16 d16 = new Day16();
        boolean output = d16.isIsogram("dropOut");
        System.out.println(output); // true

    }
}

class Day16 {
    public boolean isIsogram(String str) {
        // TODO:
        if(str.length()==0){
            return true;
        }
        String strToUp = str.toUpperCase();
        Set<Character> alp = new HashSet<>();
        boolean result = true;

        for(int i=0; i<strToUp.length(); i++){
            if(alp.contains(strToUp.charAt(i))){
                result = false;
                break;
            }
            else{
                alp.add(strToUp.charAt(i));
            }
        }
        return result;
    }
}
public class Day6 {
}
class D6Solution {
    public String letterCapitalize(String str) {
        // TODO:

        // TODO:
        String result="";

        boolean checkOp=true;

        if(str.length()==0){
            return "";
        }
        String[] word = str.split(" ");
        for(int i = 0; i<word.length; i++){
            if(word[i].isEmpty()){

            }
            else {
                word[i] = String.valueOf(word[i].charAt(0)).toUpperCase() + word[i].substring(1);
            }
        }

        result = String.join(" ", word);
        return result;
    }
}
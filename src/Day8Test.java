public class Day8Test {
    public static void main(String[] args) {
        Day8 d8 = new Day8();
        String output = d8.convertDoubleSpaceToSingle("  string with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }
}

class Day8 {
    public String convertDoubleSpaceToSingle(String str) {
        // TODO:
        String result="";
        if(str.length()==0){
            return "";
        }
        result+= str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&str.charAt(i-1)==' '){
                continue;
            }
            result+= str.charAt(i);
        }
        return  result;
    }
}
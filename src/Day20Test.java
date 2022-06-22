public class Day20Test {
    public static void main(String[] args) {
        Day20 d20 = new Day20();
        String output = d20.compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
}

class Day20 {
    public String compressString(String str) {
        if(str.length()==0){
            return "";
        }
        char currentChar =0;
        char prevChar =str.charAt(0);
        int prevCount=0;
        String result="";
        for (int i=1;i<=str.length();i++){
            if(i==str.length()){
                currentChar=0;
            }
            else{
                currentChar=str.charAt(i);
            }

            if((currentChar==prevChar)){
                prevCount++;
                prevChar= str.charAt(i);
            }
            else{

                if(prevCount<2){
                    for(int j =0;j<=prevCount;j++){
                         result += prevChar;
                    }
                }
                else {
                    result = result + (prevCount+1) + prevChar;
                }
                prevCount=0;
                prevChar= currentChar;
            }
        }
        return result;
    }
}

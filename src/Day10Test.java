public class Day10Test {

    public static void main(String[] args) {
        Day10 d10 = new Day10();
        String output = d10.insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }
}

class Day10 {
    public String insertDash(String str) {
        // TODO:
        String result ="";
        int currentValue=0;
        boolean checkOdd=false;
        if(str.length()==0){
            return null;
        }
        for(int i=0; i<str.length();i++){
            currentValue =Character.getNumericValue(str.charAt(i));
            if((currentValue%2)!=0){
                if(checkOdd==true){
                    result+="-";
                }
                result +=str.charAt(i);
                checkOdd=true;
            }
            else if((currentValue%2)==0){
                result +=str.charAt(i);
                checkOdd=false;
            }
        }


        return result;
    }

}
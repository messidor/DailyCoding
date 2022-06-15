public class Daily4 {
    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        //String str="       ";
        String str="fucking test code";

        System.out.println(sol4.firstCharacter(str));

    }

}
class Solution4 {
    public String firstCharacter(String str) {
        // TODO:
        String result="";

        boolean checkOp=true;

        if(str.length()==0){
            return "";
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                checkOp=true;
            }
            else if(checkOp==true) {
                result = result + str.charAt(i);
                checkOp=false;
            }

        }
        return result;
    }
}

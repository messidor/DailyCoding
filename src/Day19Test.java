public class Day19Test {
    public static void main(String[] args) {
        Day19 d19 = new Day19();
        String output = d19.decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // --> hello

    }
}


class Day19 {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String reg="[a-z]";
        String result="";
        int temp=0;
        for(int i=0; i<str.length();i++){
            if((int)(str.charAt(i))==32){
                temp=32;
            }
            else {
                temp = (int) (str.charAt(i) - secret);
                if (temp < 97) {
                    temp = 122 - (96 - temp);
                }
            }
            result += (char)(temp);
        }
        return result;
    }
}

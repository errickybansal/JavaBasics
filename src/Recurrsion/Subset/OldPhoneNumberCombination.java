package Recurrsion.Subset;

public class OldPhoneNumberCombination {

    public static void main(String[] args) {
        String input = "12";
    }

    public static void allLetterforNumbers(String output,String input){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        int digit = input.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch =(char) ('a'+i);
            allLetterforNumbers(output+ch,input.substring(1));
        }
    }
}

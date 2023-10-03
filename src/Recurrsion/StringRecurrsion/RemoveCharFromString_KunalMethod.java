package Recurrsion.StringRecurrsion;

public class RemoveCharFromString_KunalMethod {
    public static void main(String[] args) {
        String input = "saasbd";
        removeCharacter(input,"");
    }

    public static void removeCharacter(String input, String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        char ch = input.charAt(0);
        if(ch=='a'){
            removeCharacter(input.substring(1),output);
        }else{
             removeCharacter(input.substring(1),output+ch);
        }
    }

}

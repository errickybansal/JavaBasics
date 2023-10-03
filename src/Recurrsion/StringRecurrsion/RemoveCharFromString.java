package Recurrsion.StringRecurrsion;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String input = "saasbd";
        System.out.println(removeCharacter(input,0));
    }

    public static String removeCharacter(String s,int index){
        if(index==s.length()){
            return "";
        }

        if(s.charAt(index)=='a'){
            return removeCharacter(s,++index);
        }
        else {
            return s.charAt(index)+""+removeCharacter(s,++index);
        }
    }
}

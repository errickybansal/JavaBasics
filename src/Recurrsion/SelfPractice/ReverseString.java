package Recurrsion.SelfPractice;

public class ReverseString {
    public static void main(String[] args) {
        Reverse("abc","");
    }

    public static void Reverse(String input,String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        Reverse(input.substring(1),ch+output);

    }
}

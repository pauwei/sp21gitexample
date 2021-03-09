import java.util.Scanner;
import java.util.Random;

public class HelloWorld{
    
    private static String generatePassword(int length) {
        Random rand = new Random();
        String password = "";
        for (int i = 0; i < length; i++){
            int nextchar = 33 + rand.nextInt(93);
            password += (char)nextchar;
        }
        
        return password;
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Your password is: \n" + generatePassword(8));
    }
}
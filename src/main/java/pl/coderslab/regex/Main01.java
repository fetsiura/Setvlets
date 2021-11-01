package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(verifyEmail("jaro@gmail.com"));
        System.out.println(verifyEmail("jarogmail.com"));
        System.out.println(verifyEmail("jarogmailcom"));
    }


    static boolean verifyEmail(String email){

        return Pattern.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}", email);
    }


    static boolean verifyPassword(String password) {
        String regex1 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{10,15}$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

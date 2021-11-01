package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {

    public static void main(String[] args) {
        String pas = "Coder";
        System.out.println(verifyPassword(pas));
    }
    static boolean verifyPassword(String password){
        String has10to15 = ".{10,15}";
        String hasOneSmallLetter = ".*[a-z]+";
        String hasOneBigLetter = ".*[A-Z]+";
        String doesNotHaveTwoSmall = ".*([a-z]{2} | [A-Z]{2}).*";

        Pattern pattern = Pattern.compile(doesNotHaveTwoSmall);
        Matcher matcher = pattern.matcher(password);

        return  matcher.matches();




    }
}
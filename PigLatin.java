import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String el : arr){
            if(containsSpecialChar(el)){
                String changed = el.substring(1) + el.substring(0,1) + "ay ";
                sb.append(changed);
            }else {
                sb.append(el + " ");
            }
        }
        return sb.toString().trim();
    }
    public static boolean containsSpecialChar(String str) {
        String regex = "[^a-zA-Z0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.matches())
            return false;
        else
            return true;
    }

    public static String pigItBest(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}

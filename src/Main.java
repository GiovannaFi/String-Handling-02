import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";
        String sub1 = string1.substring(0, 6);
        String sub2 = string1.substring(7, 14);
        char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
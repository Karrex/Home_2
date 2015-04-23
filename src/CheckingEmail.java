import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingEmail {
    public static void main(String[] args) {
        check(inputEmail());
    }

    private static String inputEmail() {
        String email;
        System.out.println("Enter Email - ");
        Scanner scan = new Scanner(System.in);
        email = scan.nextLine();
        return email;
    }

    public static void check(String email) {
        Pattern p = Pattern.compile("\\w.\\w+@\\w+\\.(com|ru|ua)");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.println(email + " - this is can be Email");
        } else {
            System.out.println(email + " - this is cannot be Email");
        }
    }
}
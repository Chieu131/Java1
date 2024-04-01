import java.util.regex.Matcher;
import java.util.regex.Pattern;

public String checkEmail(String email) {
    String message = "";
    if (email != null) {
        Pattern patternEmail = Pattern
                .compile("^[\\w\\.]+@[\\w]+\\.[\\w]+");
        Matcher matcherEmail = patternEmail.matcher(email);
        if (!matcherEmail.matches()) {
            message = "Email must is correct format";
        }
    } else {
        message = "You must enter email";
    }
    return message;
}
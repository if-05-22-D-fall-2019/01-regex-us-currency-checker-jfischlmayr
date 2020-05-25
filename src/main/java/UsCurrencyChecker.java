import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {

    private static final String PATTERN = "\\$\\s?\\d+(\\.\\d{1,2})?";
    private static final Pattern pattern = Pattern.compile(PATTERN);

    public static Matcher getMatcher(String usCurrencyString) {
        return pattern.matcher(usCurrencyString);
    }
}

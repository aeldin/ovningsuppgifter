package ovningsuppgifter.Week3;

import java.util.Locale;

public class Swedish extends Language {

    @Override
    public Locale getLocale() {
        return new Locale("sv", "SE");
    }

    @Override
    public String greeting() {
        return "Hej";
    }

    @Override
    public String ok() {
        return "okej";
    }

    @Override
    public String cancel() {
        return "Avbryt";
    }

    @Override
    public String tryAgain() {
        return "Försök igen";
    }
}


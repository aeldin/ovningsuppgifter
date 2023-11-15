package ovningsuppgifter.Week3;

import java.util.Locale;

public class USEnglish extends Language {

    @Override
    public Locale getLocale() {
        return new Locale("en", "US");
    }

    @Override
    public String greeting() {
        return "Hello";
    }

    @Override
    public String ok() {
        return "Okay";
    }

    @Override
    public String cancel() {
        return "Cancel";
    }

    @Override
    public String tryAgain() {
        return "Try again";
    }
}

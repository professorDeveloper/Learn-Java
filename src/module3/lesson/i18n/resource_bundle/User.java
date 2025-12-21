package module3.lesson.i18n.resource_bundle;

import java.util.List;
import java.util.Locale;

public record User(String username, Locale locale) {
    public static List<User> users =List.of(
            new User("user1",Locale.forLanguageTag("en")),
            new User("user2",Locale.forLanguageTag("fr")),
            new User("user3",Locale.forLanguageTag("uz"))
    );
}

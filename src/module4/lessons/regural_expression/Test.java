package module4.lessons.regural_expression;

public class Test {
    public static void main(String[] args) {
        String testNum = "+998991234567";
        String testEmail = "Ox2QH@example.com";
        String password = "Parol2255!@#";
        String wordTest = "Hello PDP 12, 2025/11/20";

        System.out.println(StringUtils.getWords(wordTest));

        testPassword(password);
        testPhoneNumber(testNum);
        testEmail(testEmail);
    }

    private static void testPassword(String password) {
        System.out.println(StringUtils.isStrongPassword(password));
    }

    private static void testEmail(String testEmail) {
        System.out.println(StringUtils.isValidEmailAddress(testEmail));
    }

    private static void testPhoneNumber(String testNum) {
        System.out.println(StringUtils.isValidPhoneNumber(testNum));
    }
}

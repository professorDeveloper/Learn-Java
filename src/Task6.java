public class Task6 {
    public static void main(String[] args) {
        String a = "hel";
        String b = "lo";
        String result =concatRev(a,b);
        System.out.println(result);

    }

    static String concatRev(String a, String b) {
        return a+b+b+a;
    }
}

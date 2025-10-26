package old;

public class Task6 {
    //    public static void main(String[] args) {
//        String a = "hel";
//        String b = "lo";
//        String result =concatRev(a,b);
//        System.out.println(result);
//
//    }
//
//    static String concatRev(String a, String b) {
//        return a+b+b+a;
//    }
    //Task6.2
//    public static void main(String[] args) {
//        String a = "hello";
//        String result = resubstring(a);
//        System.out.println(result);
//    }
//
//    public static String resubstring(String str) {
//        return str.length() >= 2 ? str.substring(0, 2) : str;
//    }

//    public static void main(String[] args) {
//        String a = "hello";
//        String result = resubString(a);
//        System.out.println(result);
//
//    }
//
//    public static String resubString(String str) {
//        return str.length() >= 2 ? str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2) : str + str + str;
//    }

//    public static void main(String[] args) {
//        String a = "hello";
//        boolean result = checkEndLyStr(a);
//        System.out.println(result);
//    }
//    public static boolean checkEndLyStr(String str){
//        return str.endsWith("ly");
//    }

    public static void main(String[] args) {
        String a = "bb0bc";
        boolean result = checkBAnybStr(a);
        System.out.println(result);
    }

    public static boolean checkBAnybStr(String str) {
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i - 2) == 'b' && str.charAt(i) == 'b') {
                return true;
            }
        }
        return false;
    }
}
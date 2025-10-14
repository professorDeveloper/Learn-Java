// Berilgan stringning istalgan joyida "code" qatori necha marta paydo bo'lishini qaytaring countni qaaytaring, bundan mustasno, biz "d" uchun har qanday harfni qabul qilamiz, shuning uchun "cope" va "cooe" ni hisoblang.
//aaacodebbb -> 1
//codexxcode -> 2
//cozexxcope -> 2
public class Task8 {
    /*
    * Berilgan stringning istalgan joyida "code" qatori necha marta paydo bo'lishini qaytaring countni qaaytaring,
    * bundan mustasno, biz "d" uchun har qanday harfni qabul qilamiz, shuning uchun "cope" va "cooe" ni hisoblang.
    * aaacodebbb -> 1
    * codexxcode -> 2
    * cozexxcope -> 2
    * using string buffer
    * */
//    public static void main(String[] args) {
//        String str = "codexxcode";
//        int count = countCode(str);
//        System.out.println(count);
//    }
//    public static int countCode(String str) {
//        StringBuffer sb = new StringBuffer(str);
//        int count = 0;
//        for (int i = 0; i < sb.length() - 3; i++) {
//            if (sb.charAt(i) == 'c' && sb.charAt(i + 1) == 'o' && sb.charAt(i + 3) == 'e') {
//                count++;
//            }
//        }
//        return count;
//    }

    //Task8.2
//    public static void main(String[] args) {
//        String str = "AAbb";
//        String result = doubChar(str);
//        System.out.println(result);
//    }
//    public static String doubChar(String str) {
//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < str.length(); i++) {
//            result.append(str.charAt(i)).append(str.charAt(i));
//        }
//        return result.toString();
//    }


    //Task8.3
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }}

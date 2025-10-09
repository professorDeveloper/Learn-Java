import java.util.Scanner;

public class Task3 {
    //Task3.1
//    public static void main(String[] args) {
//        int a=23;
//        int b=45;
//        boolean res =a==b;
//        System.out.println(res);
//    }

    //Task3.2
    /*
     * 7 ni 5chi darajasini ekran chaqizuvchi dasturini yozing.
     * */

    //    public static void main(String[] args) {
//        int a=7;
//        int b=5;
//        double result =Math.pow(a,b);
//        System.out.printf("Natija:%.2f",result);
//    }
//    //Task3.3
//    public static void main(String[] args) {
//        int a=7;
//        int b=5;

    /// /        int min =a>b?a:b;
    /// /        System.out.println(min);
//    }
    //Task3.9
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("D:");
//        int d = scanner.nextInt();
//        System.out.print("V1:");
//        int v1 = scanner.nextInt();
//        System.out.print("V2:");
//        int v2 = scanner.nextInt();
//        int t =d/(v1+v2);
//        int s1 =v1*t;
//        int s2 =v2*t;
//        System.out.println("Uchratish vaqti:"+t);
//        System.out.println("Mashina1 bosib o`tgan masofa:"+s1);
//        System.out.println("Mashina2 bosib o`tgan masofa:"+s2);
//    }


    //Task3.10
//    public static void main(String[] args) {
//        int a = 123;
//        int yuzlik = a / 100;
//        int onlik = a / 10 %10;
//        int birlik = a % 10;
//        System.out.println("Yuzlik:"+yuzlik);
//        System.out.println("Onlik:"+onlik);
//        System.out.println("Birlik:"+birlik);
//    }

    //Task3.11
//    public static void main(String[] args) {
//        int a = 1234;
//        int minglik = a / 1000;
//        int yuzlik = (a % 1000) / 100;
//        int onlik = (a % 100) / 10;
//        int birlik = a % 10;
//        System.out.printf("%d, %d, %d, %d", minglik, yuzlik, onlik, birlik);
//    }

    //Task3.12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son:");
        int a =scanner.nextInt();
        String msg =a%2==0?"Juft":"Toq";
        System.out.println(msg);
    }
}

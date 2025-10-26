package old;

import java.util.Scanner;

public class Task4 {

    //Task4.1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("n:");
//        int n = scanner.nextInt();
//        if (n>0){
//            n=n+1;
//        }
//        System.out.println(n);
//    }
    //Task4.2
    // Butun son berilgan, Agar berilgan butun son musbat bo'lsa, 1ga oshirilsin, aks 2 ga kamaytiring.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("n:");
//        int n = scanner.nextInt();
//        if (n>0){
//            n=n+1;
//        }else{
//            n=n-2;
//        }
//        System.out.println(n);
//    }

    //Task4.3
    /*
     * Butun son berilgan, Agar berilgan butun son musbat bo'lsa, 1ga oshirilsin, aks 2 ga kamaytiring.
     * Agar 0 ga teng bo'lsa 10 ga o'zgartirilsin. Hosil bo'lgan sonni ekranga chiqaruvchi dastur yozing.
     * */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("n:");
//        int n = scanner.nextInt();
//        if (n>0){
//            n=n+1;
//        }else if (n<0){
//            n=n-2;
//        }else {
//            n=10;
//        }
//        System.out.println(n);
//    }

    //Task4.4
    /*
     * 3ta son berilgan ular orasida nechta musbat son borligini aniqlovchi dastur yozing.
     * */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("n1:");
//        int n1 = scanner.nextInt();
//        System.out.print("n2:");
//        int n2 = scanner.nextInt();
//        System.out.print("n3:");
//        int n3 = scanner.nextInt();
//        int count = 0;
//        if (n1 > 0) {
//            count++;
//        }
//        if (n2 > 0) {
//            count++;
//        }
//        if (n3 > 0) {
//            count++;
//        }
//        System.out.println("Musbat sonlar soni: " + count);
//    }

    //Task4.5
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("n1:");
//        int n1 =scanner.nextInt();
//        System.out.print("n2:");
//        int n2=scanner.nextInt();
//        int max =n1;
//        if (n2>max){
//            max=n2;
//        }
//        System.out.println("Max son: "+max);
//    }

    //Task4.6
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.print("a:");
//        int a=scanner.nextInt();
//        System.out.print("b:");
//        int b=scanner.nextInt();
//        System.out.print("c:");
//        int c=scanner.nextInt();
//        int min=a;
//        if (b<min){
//            min=b;
//        }
//        if (c<min){
//            min=c;
//        }
//        System.out.println("Min son: "+min);
//    }

    //    //Task4.7
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a:");
//        int a = scanner.nextInt();
//        System.out.print("b:");
//        int b = scanner.nextInt();
//        System.out.print("c:");
//        int c = scanner.nextInt();
//        int max1 = -1;
//        int max2 = -1;
//        if (a + b > b + c && a + b > a + c) {
//            max1 = a;
//            max2 = b;
//
//        } else if (a + c > a + b && a + c > b + c) {
//            max1 = a;
//            max2 = c;
//        } else if (b + c > a + c && b + c > a + b) {
//            max1 = b;
//            max2 = c;
//        }
//        System.out.printf("max1: %d max2: %d", max1, max2);
//    }

    // Task4.8
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("day:");
//        int day = scanner.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Dushanba");
//            case 2 -> System.out.println("Seshanba");
//            case 3 -> System.out.println("Chorshanba");
//            case 4 -> System.out.println("Payshanba");
//            case 5 -> System.out.println("Juma");
//            case 6 -> System.out.println("Shanba");
//            case 7 -> System.out.println("Yakshanba");
//            default -> System.out.println(" haftada 7 kun bor");
//        }
//    }

    //Task4.9
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("k:");
//        int k = scanner.nextInt();
//        switch (k) {
//            case 1 -> System.out.println("Yomon");
//            case 2 -> System.out.println("Qoniqarsiz");
//            case 3 -> System.out.println("Qoniqarli");
//            case 4 -> System.out.println("Yaxshi");
//            case 5 -> System.out.println("A`lo");
//            default -> System.out.println("Xato");
//        }
//    }

    //Task4.10
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Oy:");
//        int oy = scanner.nextInt();
//        switch (oy) {
//            case 1, 2, 12 -> System.out.println("Qish");
//            case 3, 4, 5 -> System.out.print("Bahor");
//            case 6, 7, 8 -> System.out.println("Yoz");
//            case 9,10,11 -> System.out.println("Kuz");
//            default -> System.out.println("Xato");
//        }
//    }
    //Task4.11
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Oy:");
//        int oy = scanner.nextInt();
//        int day = -1;
//        switch (oy) {
//            case 1, 3, 5, 8, 7, 10, 12 -> day = 31;
//            case 4, 6, 9, 11 -> day = 30;
//            case 2 -> day = 29;
//            default -> System.out.print("xato oy");
//        }
//        if (day != -1) {
//            System.out.println(oy + " da " + day + " kun bor");
//        }
//    }
//    //Task12
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("son:");
//        int son = scanner.nextInt();
//        if (son > 99 && son < 1000) {
//            String msg = "";
//            int birlik = son % 10;
//            int on = son / 10 % 10;
//            int yuzlik = son / 100;
//            switch (yuzlik) {
//                case 1 -> msg += "bir yuz";
//                case 2 -> msg += "ikki yuz";
//                case 3 -> msg += "uch yuz";
//                case 4 -> msg += "to`rt yuz";
//                case 5 -> msg += "besh yuz";
//                case 6 -> msg += "olti yuz";
//                case 7 -> msg += "yetti yuz";
//                case 8 -> msg += "sakkiz yuz";
//                case 9 -> msg += "to`qqiz yuz";
//            }
//            switch (on) {
//                case 1 -> msg += " o`n";
//                case 2 -> msg += " yigirma";
//                case 3 -> msg += " o`ttiz";
//                case 4 -> msg += " qiriq";
//                case 5 -> msg += " ellik";
//                case 6 -> msg += " oltmish";
//                case 7 -> msg += " yetmish";
//                case 8 -> msg += " sakson";
//                case 9 -> msg += " to`qson";
//            }
//            switch (birlik) {
//                case 1 -> msg += " bir";
//                case 2 -> msg += " ikki";
//                case 3 -> msg += " uch";
//                case 4 -> msg += " to`rt";
//                case 5 -> msg += " besh";
//                case 6 -> msg += " olti";
//                case 7 -> msg += " yetti";
//                case 8 -> msg += " sakkiz";
//                case 9 -> msg += " to`qqiz";
//            }
//            System.out.println(msg);
//        } else {
//            System.out.println("son 3 xonali bo`lishi kerak");
//        }
//
//    }
    // Task4.13
//    /**
//     * n butun son berilgan (n > 0). Quyidagi yig'indini hisoblovchi dastur yozing.
//     * s = 1 + 1/2 + 1/3 + ... + 1/n
//     **/
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Son:");
//        int n = scanner.nextInt();
//        int res = 0;
//        if (n > 0) {
//            for (int i = 1; i <= n; i++) {
//                res += 1 / i;
//            }
//            System.out.println(res);
//        } else {
//            System.out.println("son 0 dan katta bo`lishi kerak");
//        }
//    }

    //Task4.14

    //    /**
//     * bir kg konfetning narxi berilgan (haqiqiy son). 1, 2, ... 10 kg konfet narxini chiqaruvchi dastur yozing.
//     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("1kg konfet narx:");
//        double narx = scanner.nextDouble();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + "kg konfet narxi:" + i * narx);
//        }
//    }
    // Task4.15
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a:");
//        int a = scanner.nextInt();
//        System.out.print("b");
//        int b = scanner.nextInt();
//        if (a < b) {
//            int sum = 0;
//            for (int i = a; i < b; i++) {
//                sum += i;
//            }
//            System.out.println(a + " va " + b + " orasidagi sonlar yig`indisi:" + sum);
//        }
//    }

    //Task4.16
    /*
    * n butun son va a haqiqiy soni berilgan. (n > 0). bitta skildan foydalanib quyidagi a ning 1dan n gacha bo'lgan barcha darajalarni chiqaruvchi va yig'indini hisoblovchi dastur yozing.
        1 + a + a² + a³ + ... aN
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n:");
        int n = scanner.nextInt();
        System.out.print("a:");
        double a = scanner.nextDouble();
        if (n > 0) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println(a + " ning " + i + " darajasi:" + Math.pow(a, i));
                sum += Math.pow(a, i);
            }
            System.out.println("a ning darajalari:" + sum);
        }
    }
}

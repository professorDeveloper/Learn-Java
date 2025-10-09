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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n:");
        int n = scanner.nextInt();
        if (n>0){
            n=n+1;
        }else{
            n=n-2;
        }
        System.out.println(n);
    }
}

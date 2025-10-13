public class Task7 {
    //Task7.1

//    public static void main(String[] args) {
//        int n =5;
//        int[] arr = new int[n];
//        int value =1;
//        for (int i=0; i<n; i++) {
//            arr[i] = value;
//            value *= 2;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    //Task2.
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

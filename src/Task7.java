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

    //Task7.2
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }
//    }
    //Task7.3
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//        int oddCount = getOddCount(arr);
//        int[] newArr = new int[oddCount];
//        int index =0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 != 0) {
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        for (int i = 0; i < oddCount; i++) {
//            System.out.println(newArr[i]);
//        }
//
//    }
//
//    public static int getOddCount(int[] arr) {
//        int count = 0;
//        for (int j : arr) {
//            if (j % 2 != 0) {
//                count++;
//            }
//        }
//        return count;
//    }
    // Task7.4
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//        int oddCount = getJuftCount(arr);
//        int[] newArr = new int[oddCount];
//        int index =0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 == 0) {
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        for (int i = 0; i < oddCount; i++) {
//            System.out.println(newArr[i]);
//        }
//
//    }
//
//    public static int getJuftCount(int[] arr) {
//        int count = 0;
//        for (int j : arr) {
//            if (j % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
    // Task7.5
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
    //Task7.6
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

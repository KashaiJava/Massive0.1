public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("\n"+ "Задание 1");
        int[] arr1 = new int[1];
        int[] arr2 = new int[2];
        int[] arr3 = new int[3];

        arr1[0] = 1;
        arr2[1] = 2;
        arr3[2] = 3;
        System.out.println(arr1[0]);
        System.out.println(arr2[1]);
        System.out.println(arr3[2]);
    }

    public static void task2() {
        System.out.println("\n"+ "Задание 2");
        float[] arr = new float[]{1.57f, 7.654f, 9.986f,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void task3() {
        System.out.println("\n"+ "Задание 3");
        int[] volume = new int[154];
        volume[0] = 153;
        int volumeFirst = volume[0];
        System.out.println(volumeFirst);
    }
}
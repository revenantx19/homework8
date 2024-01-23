public class Main {
    public static void main(String[] args) {
        //task1
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        byte[] array3 = {1, 2, 3, 4, 5, 6, 7, -1, -2, -3};

        //task2
        System.out.print("Задача2\n");
        for (int i = 0; i <= 2; i++) {
            System.out.print(array1[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.print(array2[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            System.out.print(array3[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task3
        System.out.print("Задача3\n");
        for (int i = 2; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //task4
        System.out.print("\nЗадача4\n");
        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] % 2 == 1) {
                System.out.print(array1[i] + 1);
            }
            else {
                System.out.print(array1[i]);
            }
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
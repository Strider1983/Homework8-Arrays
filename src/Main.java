import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы. Урок 1");
        System.out.println("_______________");
        System.out.println("Задача №1");
        System.out.println("Массив 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(" ");
        System.out.println("Массив 2");
        double[] fractionals = {1.57, 7.654, 9.986};
        System.out.println(fractionals[0]);
        System.out.println(fractionals[1]);
        System.out.println(fractionals[2]);
        System.out.println(" ");
        System.out.println("Массив 3");
        double[] mass = {23, 7, 64, 35.8, 76.2, 11, 3.67};
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("Длина массива - " + mass.length + " элементов");
        System.out.println("_______________");
        System.out.println("Задача №2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fractionals));
        System.out.println(Arrays.toString(mass));
        System.out.println("_______________");
        System.out.println("Задача №3");
        for (int i1 = numbers.length - 1; i1 >= 0; i1 = i1 - 1) {
            if (i1 == 0) {
                System.out.println(numbers[i1]);
                break;
            }
            System.out.print(numbers[i1] + ", ");
        }
        for (int i2 = fractionals.length - 1; i2 >= 0; i2 = i2 - 1) {
            if (i2 == 0) {
                System.out.println(fractionals[i2]);
                break;
            }
            System.out.print(fractionals[i2] + ", ");
        }
        for (int i3 = mass.length - 1; i3 >= 0; i3 = i3 - 1) {
            if (i3 == 0) {
                System.out.println(mass[i3]);
                break;
            }
            System.out.print(mass[i3] + ", ");
        }
        System.out.println("_______________");
        System.out.println("Задача №4");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int s = 0; s < array.length; s++) {
            if (array[s] % 2 > 0) {
                array[s] = array[s] + 1;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
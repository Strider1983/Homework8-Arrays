public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы. Урок 1");
        System.out.println("_______________");
        System.out.println("Задача №1");
        System.out.println("Массив 1");
        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);
        System.out.println(" ");
        System.out.println("Массив 2");
        double [] fractionals = {1.57, 7.654, 9.986};
        System.out.println(fractionals [0]);
        System.out.println(fractionals [1]);
        System.out.println(fractionals [2]);
        System.out.println(" ");
        System.out.println("Массив 3");
        double [] mass = {23, 7, 64, 35.8, 76.2, 11, 3.67};
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass [i]);
        }
        System.out.println("Длина массива - " + mass.length + " элементов");
        System.out.println("_______________");
        System.out.println("Задача №2");
    }
    }
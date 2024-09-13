import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] paymentsMonth = new int[5];
        paymentsMonth[0] = 45;
        paymentsMonth[1] = 70;
        paymentsMonth[2] = 33;
        paymentsMonth[3] = 11;
        paymentsMonth[4] = 29;
        int sumMonth = 0;
        for (int element : paymentsMonth) {
            sumMonth += element;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей.");
        System.out.println();

        System.out.println("Задача 2");
        int[] arr = {331, 105, 45, 109, 73};
        int min, max;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[4];
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        System.out.println("Задача 3");
        int[] arr2 = {45, 17, 99, 32, 70};
        int sum = 0;
        double averageValue = 0.0;
        for (int element : arr2) {
            sum += element;
        }
        averageValue = (double) sum / (arr2.length - 1);
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int y = reverseFullName.length - 1;
        char x;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            x = reverseFullName[i];
            reverseFullName[i] = reverseFullName[y - i];
            reverseFullName[y - i] = x;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }
}
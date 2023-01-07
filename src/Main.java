import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        double[] mass = new double[15];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextDouble(-50, 50);
            System.out.println(mass[i]);
        }
        double sum = 0;
        int count = 0;
        boolean cheking = false;

        for (double arrayElement : mass){
            if (arrayElement < 0){
                cheking = true;
            }else if (arrayElement > 0 && cheking) {
                sum += arrayElement;
                count++;
                System.out.println(arrayElement);
            }
        }
        System.out.println("Среднее арифметическое значение массива: " + (sum/count));

        // на сообразительность:
        int [] sorted = new int[5];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = random.nextInt(1, 20);
            System.out.println(sorted[i]);
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < sorted.length-1; i++) {
                if(sorted[i] > sorted[i+1]){
                    isSorted = false;

                    buf = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(sorted));
    }
}

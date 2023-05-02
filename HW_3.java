// task 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + ar.get(i));
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("Список с удаленными четными числами: \n " + ar);
        }
    }

}

// task 2

public class task_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/arrlst.size()));


    }
}

// task 3

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Zemlya");
        planets.add("Mars");
        planets.add("Upiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptun");
        planets.add("Pluton");
        planets.add("Zemlya");
    }
}

for (String planets) {
    int count = 0;
    for (String p : planets) {
        if (planet.equals(p)) {
            count++;
        }
    }
    System.out.printf("%s - %d%n", planet, count);
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("ВВЕДИТЕ СТРОКУ: ");
            String line = scanner.nextLine();
            A.add(line);
        }
        System.out.println("СПИСОК А: ");
        for (String line : A) {
            System.out.println(line);
        }
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("ВВЕДИТЕ СТРОКУ ДЛЯ СПИСКА B: ");
            String line = scanner.nextLine();
            B.add(line);
        }
        System.out.println("СПИСОК B: ");
        for (String line : B) {
            System.out.println(line);
        }
        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(4 - i));
            System.out.println("СПИСОК C: ");
            for (String s : C) {
                System.out.println(C);
            }
            Collections.sort(C);
            System.out.println("ОТСОРТИРОВАННЫЙ СПИСОК C: ");
            for (String s : C) {
                System.out.println(s);
            }
        }
    }
}

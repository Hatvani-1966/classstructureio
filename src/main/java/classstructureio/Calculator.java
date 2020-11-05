package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int k = 0;
        i = scanner.nextInt();
        k = scanner.nextInt();
        System.out.println(i+" + "+k);
        System.out.println(i+k);
    }
}

package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type yoyr username");
        String userName =  scanner.nextLine();
        System.out.println("type your e-mail");
        String email =  scanner.nextLine();
        System.out.println("username: " + userName );
        System.out.println("email " + email );

    }
}

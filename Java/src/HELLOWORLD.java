import java.util.Scanner;

public class HELLOWORLD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number-- > 0) {
            String name = scanner.next();
            System.out.println("Hello, " + name + "!");
        }
    }
}
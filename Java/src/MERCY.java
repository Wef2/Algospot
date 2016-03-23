import java.util.Scanner;

public class MERCY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 1 && number <= 10){
            for(int i = 1; i<= number; i++){
                System.out.println("Hello Algospot!");
            }
        }
    }
}

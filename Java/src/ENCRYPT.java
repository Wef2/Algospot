import java.util.Scanner;

public class ENCRYPT {

    public String encryption(String string){
        String encryptedString = "";
        int i = 0;
        while(i < string.length()){
            encryptedString = encryptedString + string.substring(i, i+1);
            i = i + 2;
        }
        int j = 1;
        while(j < string.length()){
            encryptedString = encryptedString + string.substring(j, j+1);
            j = j + 2;
        }
        return encryptedString;
    }

    public static void main(String[] args) {
        ENCRYPT encrypt = new ENCRYPT();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number-- > 0) {
            String word = scanner.next();
            String encryptedWord = encrypt.encryption(word);
            System.out.println(encryptedWord);
        }
    }
}
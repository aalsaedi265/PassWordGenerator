import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The World");

        Scanner in = new Scanner(System.in);
        System.out.print("How many random Passwords do you generate?");
        int total = in.nextInt();

        System.out.print("How many chacacters long do you want to random generated password to be?");

        String[] randomPasswords = new String[total];

        int length = in.nextInt();
        for (int i = 0; i < total; i++) {
            String randomPassword = "";
            for (int j = 0; j < length; i++) {
                randomPassword += randomCharacter();
            }
            randomPasswords[i] = randomPassword;
        }

    }

    public static void PrintPW(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static char randomCharacter() {
     
        int rand = (int) (Math.random() * 62);
        
        if (rand <= 9) {
            int ascii = rand +48;
            return (char) (ascii);
        } else if (rand <= 35) {
            int ascii = rand + 55;
            return (char) (ascii);
        } else {
            int ascii = rand + 61;
            return (char) (ascii);
        }
        return 0;
    }
}

import java.util.Scanner;

public class Validation {
    public static boolean inputValid(String st) {
        if (st == null || st.trim().isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean isInt(String st) {
        if (!inputValid(st)) {
            return false;
        }
        try {
            Integer.parseInt(st.trim());
            return true;
        } catch (Exception ex) {
            System.out.println("Error: Not Valid Int: " + ex);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("--- Validation Tester ---");
            System.out.println("Type anything, and type 'exit' to stop:");

            String input = scanner.nextLine();
            if (inputValid(input)) {
                if (input == "exit") {
                    System.out.println("Exiting Program...");
                    flag = false;
                    break;
                } 
                if (isInt(input)) {
                    System.out.println(input + "is a valid integer.");
                }
                else{
                    System.out.println(input + "is a valid string.");
                }
            }
            
        }
    }
}

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digit your password: ");
        String password = scanner.nextLine();

        System.out.println("Score: " + passwordStrength(password));

        }

        //create a function called passwordStrength
        public static int passwordStrength(String password){

            int score = 0;
            int length = password.length();

            //this condition test the password length and gives a score
            if (length >= 8 && length <= 10){
                score++;
            } else if (length >= 11 && length <= 15) {
                score += 2;
            } else if (length >= 16) {
                score += 3;
            }

            //Lower Case Letter
            if (password.matches("(?=.*[a-z]).*")){
                score++;
            }

            //Upper Case Letter
            if (password.matches("(?=.*[A-Z]).*")){
                score++;
            }

            //Numbers
            if (password.matches("(?=.*[0-9]).*")){
                score++;
            }

            //Special Characters
            if (password.matches("(?=.*[!@#$%^&*]).*")){
                score++;
            }

            return score;
        }
    }

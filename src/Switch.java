import java.util.Scanner;

//This is a test comment. I'm practicing with Git
public class Switch {



    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = user_input.nextInt();

        switch ( age ) {

            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:

                System.out.println( age + " is between 0 and 10");
                break;

            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:

                System.out.println(age + " is between 11 and 20");
                break;

            case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:

                System.out.println(age + "is between 21 and 30");
                break;

            default:

                System.out.println("You are over 30");

        }


    }
}


import java.util.Scanner;
public class calc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        do {
            System.out.println("Calculator Main Menu\n");
            System.out.print("1.) Addition \n");
            System.out.print("2.) Subtraction.\n");
            System.out.print("3.) Multiplication.\n");
            System.out.print("4.) Division.\n");
            System.out.print("5.) Generate Random Number.\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");
            choice = input.nextInt();


            switch (choice) {

                case 1:
                    //do something
                    break;

                case 2:
                    //do something
                    break;

                case 3:
                    //do something
                    break;

                case 4:
                    //do something
                    break;

                case 5:
                    //do something
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

            }


        } while (choice != 6 /*Exit loop when choice is 6*/);

    }
}

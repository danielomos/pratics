import java.util.Scanner;

public class WorkingPhonePrototypeApplication {

    public static void main(String[] args) {
        WorkingPhonePrototype one = new WorkingPhonePrototype();
        boolean mainLoop = true;
        Scanner collect = new Scanner(System.in);
        //int fd = collect.nextInt();
        while(true) {
            one.getMainmenu();

            int menu = collect.nextInt();

            switch (menu) {
                case 1:
                    one.getMenu1();

                    one.maainmenu(collect.nextInt());
                    break;
                case 2:
                    System.out.println("testing");
                    break;
                case 0:
                    System.out.println("Exiting Program...");
                    System.exit(0);


                default:
                    System.out.println("out");
            }
        }

    }
}



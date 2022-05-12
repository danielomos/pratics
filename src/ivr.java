import java.util.Scanner;

public class ivr {
    public static void main(String[] args) {

int option1 = 0;


        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome, Kindly Enter%n 1 if you want to be service in English%n 2 if you want to be service in igbo%n 3 if you want to be service in french%n 4 if you want to be service in Yoruba%n ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.printf(" you selected English enter%n 1 for data%n 2 for Transfer%n ");
                option1 = input.nextInt();
                switch (option1){

                    case 1: System.out.printf(" you have select data%n ");
                    break;
                    case 2: System.out.printf(" you have select trasnfer%n ");
                    break;
                    default: System.out.printf(" you have not select anything ");
                }
                break;
            case 2:
                System.out.printf(" you selected igbo enter%n 1 for sharing%n 2 for caring%n ");
                option1 = input.nextInt();
                switch (option1) {

                    case 1:
                        System.out.printf(" you have select sharing%n ");
                        break;
                    case 2:
                        System.out.printf(" you have select caring%n ");
                        break;
                    default:
                        System.out.printf(" you have not select anything ");
                }
                break;
            case 3:
                System.out.printf(" you selected french enter%n 1 for Egg%n 2 for champan%n ");
                option1 = input.nextInt();
                switch (option1) {

                    case 1:
                        System.out.printf(" you have select Egg%n ");
                        break;
                    case 2:
                        System.out.printf(" you have select champan ");
                        break;
                    default:
                        System.out.printf(" you have not select anything ");
                        break;
                }
                break;
            case 4:
                System.out.printf(" you selected yoruba enter%n 1 for ewa%n 2 for agoyin%n ");
                option1 = input.nextInt();
                switch (option1) {

                    case 1:
                        System.out.printf(" you have select ewa%n ");
                        break;
                    case 2:
                        System.out.printf(" you have select agoyin%n ");
                        break;
                    default:
                        System.out.printf(" you have not select anything ");
                        break;
                }
                break;
            default: System.out.printf(" you have not select anything ");
                break;

        }
    }
}


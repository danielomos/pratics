import java.util.Scanner;

public class HeartRateApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstname = input.nextLine();
        System.out.println("Enter your Last Name:");
        String lastname = input.nextLine();
        System.out.println("Enter your year of birth:");
        int year = input.nextInt();
        System.out.println("Enter your month of birth:");
        int month = input.nextInt();
        System.out.println("Enter your day of birth:");
        int day = input.nextInt();

        HeartRatePratice patient = newPatient(firstname, lastname, year, month, day);
        HeartRatePratice patient2 = newPatient(firstname, lastname, year, month, day);
        printInfoMore(patient);
        printInfoMore(patient2);

    }


        public static HeartRatePratice newPatient (String firstname, String lastname, int year, int month, int day){
        HeartRatePratice patient;
        patient = new HeartRatePratice(firstname, lastname, year, month, day);
        return patient;
    }
    public static void printInfoMore (HeartRatePratice patient){
        System.out.printf("%s, born on %d %d %d, is %d years old.%n",patient.getFirstName(), patient.getYearOfBirth(),patient.getMonthOfBirth(), patient.getDayOfBirth(), patient.getAgeInYears());
        System.out.printf("Maximum heart rate: %d bpm.%n", patient.getMaxHeartRate());
        System.out.printf("Target heart rate of %s is %d bpm.%n",patient.getFirstName(), patient.targetHeartRate());

    }
    }


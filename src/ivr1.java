import java.util.Scanner;

public class ivr1 {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        String prompt = """
                1 for English
                2 for Igbo
                3 for French
                4 for  youruba
                """;
        System.out.println(prompt);
        String userResponse = collect.nextLine();
        // char response = userResponse.charAt(0);
        switch (userResponse.charAt(0)) {
            case '1' -> displayEnglishMenu(collect);
            case '2' -> displayIgboMenu(collect);
            case '3' -> displayFrenchMenu(collect);
            case '4' -> displayYorubaMenu(collect);
            default -> System.out.print("off");
        }


    }

    private static void displayYorubaMenu(Scanner collect) {
        String prompt;
        String userResponse;
        prompt = """
                1 for data
                2 for transfer
                """;
        System.out.print(prompt);
        userResponse = collect.nextLine();
        switch (userResponse.charAt(0)) {
            case '1' -> System.out.print("ewa");
            case '2' -> System.out.print("agoyin");
            default -> System.out.print("off");
        }
    }

    private static void displayFrenchMenu(Scanner collect) {
        String prompt;
        String userResponse;
        prompt = """
                1 for data
                2 for transfer
                """;
        System.out.print(prompt);
        userResponse = collect.nextLine();
        switch (userResponse.charAt(0)) {
            case '1' -> System.out.print("Egg");
            case '2' -> System.out.print("champain");
            default -> System.out.print("off");
        }
    }

    private static void displayIgboMenu(Scanner collect) {
        String prompt;
        String userResponse;
        prompt = """
                1 for data
                2 for transfer
                """;
        System.out.print(prompt);
        userResponse = collect.nextLine();
        switch (userResponse.charAt(0)) {
            case '1' -> System.out.print("sharing");
            case '2' -> System.out.print("caring");
            default -> System.out.print("off");
        }
    }

    private static void displayEnglishMenu(Scanner collect) {
        String prompt;
        String userResponse;
        prompt = """
                1 for data
                2 for transfer
                """;
        System.out.print(prompt);
        userResponse = collect.nextLine();
        switch (userResponse.charAt(0)) {
            case '1' -> System.out.print("data");
            case '2' -> System.out.print("data");
            default -> System.out.print("off");
        }
    }
}




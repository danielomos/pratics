/*import java.util.Scanner;

public class NokiaPhone{
    private String mainmenu = """
                Welcome!!!
                MainMenu
                        Enter 
                        1 for Phone Book
                        2 for Messages
                        3 for chat
                        4 for Call Register
                        5 for Tones
                        6 for Settings
                        7 for Call divert
                        8 for Games
                        9 for Calculator
                        10 for Reminders
                        11 for Clock
                        12 for Profiles
                        13 for SIM Services
                        0 for back
                """;
    private String menu1 = """
            Phone Book:-
                        Enter 
                        1 for Search
                        2 for Service Nos.
                        3 for Add Name
                        4 for Erase
                        5  for Edit
                        6 for Assign tone
                        7 for Send b' Card
                        8  for Option
                        9 for Speend Dials
                        10 for Voice tags
                        0 for back
            """;
    private String menu1_8 = """
            Option:-
            1 for Type of View
            2 for Memory Status
            0 for back
            """;
    private String menu2 = """
            Messages:-
            1 for write Messages
            2 for inbox
            3 for Outbox
            4 for Picture Messages
            5 for Templates
            6 for Smileys
            7 for messages Settings
            8 for Info Services
            9 for Voice Mailbox Number
            10 for Service Command Editor
            0 for back
            """;
    private String menu2_7 = """
            Message Settings
            1 for Set
            2 for Common
            0 for back
            """;
    private String menu2_7_1 = """
            Set:-
            1 for Message centre number 
            2 for Messages Sent As
            3 Message validity
            0 for back
            """;
    private String menu2_7_2 = """
            Common:-
            1 for Delivery Reports
            2 for Reply via same centre
            3 Character Support
            0 for back
            """;
    private String menu3 = """
            Chat
            1 for Chat
            0 for back
            """;
    private String menu4 = """
            Call Register
            1 for missed calls
            2 for received calls
            3 for dialled numbers
            4 for erase recent call lists
            5 for show call duration
            6 for show call costs
            7 for call cost settings
            8 for prepaid credit
            0 for back
            """;
    private String menu4_5 = """
            Show call costs
            1 for last call duration
            2 for all call's duration
            3 for received call's duration
            4 for dialled calls duration
            5 for clear timers
            0 for back
            """;
    private String menu4_6 = """
            Show call costs
            1 for last call cost
            2 for all call's cost
            3 for clear counters
            0 for back
            """;
    private String menu4_7 = """
            call cost settings
            1 for call cost limit
            2 for show costs in
            0 for back
            """;
    private String menu5 = """
            Tones
            1 for ringing tone
            2 for ringing volume
            3 for incoming call alert
            4 for composer
            5 for message alert tone
            6 for keypad tones
            7 for warming and game tones
            8 for vibrating alert
            9 screen saver
            0 for back
            """;
    private String menu6 = """
            Settings
            1 for call settings
            2 for phone settings
            3 for security settings
            4 for restore factory settings
            0 for back
            """;
    private String menu6_1 = """
            Call settings
            1 for Automatic redial
            2 for speed dialling
            3 for call waiting options
            4 for own number sending
            5 for phone line in use
            6 for automatic answer
            0 for back
                                   
            """;
    private String menu6_2= """
            Phone Setting
            1 for language
            2 for cell info display
            3 for welcome note
            4 for network selection
            5 for light
            6 for confirm sim services actions
            0 for back
            """;
    private String menu6_3 = """
            Security settings
            1 for Pin code request
            2 for call barring service
            3 for fixed dialling
            4 for closed user group
            5 for phone security
            6 for change access codes
            0 for back
            """;
    private String menu7 = """
            1 for Call divert
            0 for back
            """;
    private String menu8 = """
            1 for Games
            0 for back
            """;
    private String menu9 = """
            1 for calculator
            0 for back
            """;
    private String menu10 = """
            1 for Reminders
            0 for back
            """;
    private String menu11 = """
            Clock
            1 for Alarm clock
            2 for Clock setting
            3 for date setting
            4 for stopwatch
            5 for countdown timer
            6 for auto update of date and time
            0 for back
            """;
    private String menu12 = """
            1 for Profiles  
            0 for back          
            """;
    private String menu13 = """
            1 for SIM services
            0 for back
            """;


    public void displayMainmenu() {
        System.out.println(mainmenu);
    }
    public  void getMainmenu(int feed){

        switch (feed){
            case 1:
                displayMenu1();
        }

    }
    public void displayMenu1() {System.out.println(menu1);}
    public void getMenu1(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos.");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
            case 6:
                System.out.println("Assign tone");
            case 7:
                System.out.println("Send b' Card");
                break;
            case 8:
                displayMenu1_8();
                int feed1 = input.nextInt();
                getMenu1_8(feed1);

                break;
            case 9:
                System.out.println("Speen Dials");
                break;
            case 10:
                System.out.println("Voice tags");

        }

    }
    public void displayMenu1_8() {System.out.println(menu1_8);}
    public void getMenu1_8(int feed){

        switch (feed) {
            case 1:
                System.out.println("Type of View");
                break;
            case 2:
                System.out.println("Memory Status");
                break;
        }

    }
    public void displayMenu2() {System.out.println(menu2);}
    public static void getMenu2(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("write Messages");
                break;
            case 2:
                System.out.println("inbox");
                break;
            case 3:
                System.out.println("outbox");
                break;
            case 4:
                System.out.println("Picture message");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;

            case 7:
                displayMenu2_7();
                int feed2 = input.nextInt();
               getMenu2_7(feed2);
                break;
            case 8:
                System.out.println("Info services");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;


        }



    }

    public static void getMenu2_7(int feed)
    {
        Scanner input = new Scanner(System.in);
     switch (feed) {
        case 1:
          displayMenu2_7_1();
          int feed1 = input.nextInt();
          getMenu2_7(feed1);
        case 2:
            displayMenu2_7_2();
            int feed3 = input.nextInt();
            getMenu2_7_2(feed3);

    }

    }
    public  void displayMenu2_7_1() {System.out.println(menu2_7_1);}
    public void getMenu2_7_1(int feed){
        switch (feed){
        case 1:
        System.out.println("Message centre number");
        break;
        case 2:
        System.out.println("message sent as");
        break;
        case 3:
        System.out.println("message validity");
        break;
    }

    }
    public void displayMenu2_7_2() {System.out.println(menu2_7_2);}
    public void getMenu2_7_2(int feed){
        switch (feed) {
            case 1:
                System.out.println("Delivery reports");
                break;
            case 2:
                System.out.println("reply via centre");
                break;
            case 3:
                System.out.println("Character support");
                break;
        }

    }
    public void displayMenu3() {System.out.println(menu3);}
    public void getMenu3(int feed){
        displayMenu3();
        switch (feed){
            case 1:
                System.out.println("Chat");
                break;
            case 0:
                System.out.println("back");

        }

    }
    public void displayMenu4() {System.out.println(menu4);}
    public void getMenu4(int feed){
        Scanner input = new Scanner(System.in);
        displayMenu4();
        switch (feed){
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                displayMenu4_5();
                int feed1 = input.nextInt();
                getMenu4_5(feed1);
                break;

            case 6:
                displayMenu4_6();
                int feed2 = input.nextInt();
                getMenu4_6(feed2);
                break;
            case 7:
                displayMenu4_7();
                int feed3 = input.nextInt();
                getMenu4_7(feed3);
                break;
            case 8:
                System.out.println("Prepaid Credit");
                break;
        }

    }
    public void displayMenu4_5() {System.out.println(menu4_5);}
    public void getMenu4_5(int feed){
        switch (feed){
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All calls' duration");
                break;
            case 3:
                System.out.println("Received calls' duration");
                break;
            case 4:
                System.out.println("Dialled Calls' duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
        }

    }
    public void displayMenu4_6() {System.out.println(menu4_6);}
    public void getMenu4_6(int feed){
        switch (feed){
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls cost");
                break;
            case 3:
                System.out.println("Clear Counters");

        }

    }
    public void displayMenu4_7() {System.out.println(menu4_7);}
    public void getMenu4_7(int feed){
        switch (feed) {
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show costs in");
                break;
        }

        }
    public void displayMenu5() {System.out.println(menu5);}
    public void getMenu5(int feed){
        displayMenu5();
        switch (feed) {
            case 1:
                System.out.println("Ringing Tone");
                break;
            case 2:
                System.out.println("Ringing Volume");
            case 3:
                System.out.println("Incoming call Alert ");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad Tone");
                break;
            case 7:
                System.out.println("Warming an Game tones");
                break;
            case 8:
                System.out.println("Vibrating");
                break;
            case 9:
                System.out.println("Screen Saver");
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }


    }
    public void displayMenu6() {System.out.println(menu6);}
    public void getMenu6(int feed){
        Scanner input = new Scanner(System.in);
       displayMenu6();
        switch (feed){
            case 1:
               displayMenu6_1();
               int feed1 = input.nextInt();
               getMenu6_1(feed1);
                break;
            case 2:
                displayMenu6_2();
                int feed2 = input.nextInt();
                getMenu6_2(feed2);
                break;
            case 3:
                displayMenu6_3();
                int feed3 = input.nextInt();
                getMenu6_3(feed3);
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }

    }
    public void displayMenu6_1() {System.out.println(menu6_1);}
    public void getMenu6_1(int feed){
      displayMenu6_1();
        switch (feed){
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own Number Sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }

    }
    public void displayMenu6_2() {System.out.println(menu6_2);}
    public void getMenu6_2(int feed){
       displayMenu6_2();
        switch (feed){
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network Selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service actions");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }

    }
    public void displayMenu6_3() {System.out.println(menu6_3);}
    public void getMenu6_3(int feed){
       displayMenu6_3();
        switch (feed){
            case 1:
                System.out.println("Pin code request");
                break;
            case 2:
                System.out.println("Call barring Services");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone Security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }

    }
    public void displayMenu7() {System.out.println(menu7);}
    public void getMenu7(int feed){
        displayMenu7();
        switch (feed){
            case 1:
                System.out.println("Call divert");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;

        }

    }
    public void displayMenu8() {System.out.println(menu8);}
    public void getMenu8(int feed){
        displayMenu8();
        switch (feed) {
            case 1:
                System.out.println(" Games");
                 break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;

        }


    }
    public void displayMenu9() {System.out.println(menu9);}
    public void getMenu9(int feed) {
        displayMenu9();
        switch (feed) {
            case 1:
                System.out.println("calculator");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;

        }
    }
    public void displayMenu10() {System.out.println(menu10);}
    public void getMenu10(int feed){
        displayMenu10();
        switch (feed) {
            case 1:
                System.out.println("Reminders");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;

        }

    }
    public void displayMenu11() {System.out.println(menu11);}
    public void getMenu11(int feed) {
        displayMenu11();
        switch (feed){
            case 1:
                System.out.println("Alarm Clock");
                break;
            case 2:
                System.out.println("Clock Setting");
                break;
            case 3:
                System.out.println("Date Settings");
                break;
            case 4:
                System.out.println("stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
        }
    /*    displayMenu11();
            switch (feed) {
                case 1:
                    System.out.println("Alarm Clock");
                    break;
                case 2:
                    System.out.println("Clock Setting");
                    break;
                case 3:
                    System.out.println("Date Settings");
                    break;
                case 4:
                    System.out.println("stopwatch");
                    break;
                case 5:
                    System.out.println("Countdown timer");
                    break;
                case 6:
                    System.out.println("Auto update of date and time");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }


    public void displayMenu12() {System.out.println(menu12);}
    public void getMenu12(int feed){

        displayMenu12();
        switch (feed) {
            case 1:
                System.out.println("Profiles");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }
    }
    public void displayMenu13() {System.out.println(menu13);}
    public void getMenu13(int feed){
        displayMenu13();
        switch (feed) {
            case 1:
                System.out.println("SIM services");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }
    }
    public int  prompt( ) {
        Scanner collect = new Scanner(System.in);
        int prom = collect.nextInt();
        return prom;
    }
}

*/
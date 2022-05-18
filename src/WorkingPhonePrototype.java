
import java.util.Scanner;

public class WorkingPhonePrototype{
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
            Call divert
            0 for back
            """;
    private String menu8 = """
            Games
            0 for back
            """;
    private String menu9 = """
            calculator
            0 for back
            """;
    private String menu10 = """
            Reminders
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
            Profiles  
            0 for back          
            """;
    private String menu13 = """
            SIM services
            0 for back
            """;


    public void maainmenu (int feed) {
        switch (feed) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("1 or 2");

                break;
            default:
                System.out.println("out");
        }
    }
    public void setMainmenu1(int feed) {
        switch (feed) {
            case 1:
                System.out.println("1.1");
                break;
            case 2:
                System.out.println("1.2");
                break;
            case 0:
                System.out.println("am coming back");
                break;
        }
    }
    public void getMainmenu() {System.out.println(mainmenu);}
    public void getMenu1() {System.out.println(menu1);}
    public void getMenu1_8() {System.out.println(menu1_8);}
    public void getMenu2() {System.out.println(menu2);}
    public void getMenu2_7() {System.out.println(menu2_7);}
    public void getMenu2_7_1() {System.out.println(menu2_7_1);}
    public void getMenu2_7_2() {System.out.println(menu2_7_2);}
    public void getMenu3() {System.out.println(menu3);}
    public void getMenu4() {System.out.println(menu4);}
    public void getMenu4_5() {System.out.println(menu4_5);}
    public void getMenu4_6() {System.out.println(menu4_6);}
    public void getMenu4_7() {System.out.println(menu4_7);}
    public void getMenu5() {System.out.println(menu5);}
    public void getMenu6() {System.out.println(menu6);}
    public void getMenu6_1() {System.out.println(menu6_1);}
    public void getMenu6_2() {System.out.println(menu6_2);}
    public void getMenu6_3() {System.out.println(menu6_3);}
    public void getMenu7() {System.out.println(menu7);}
    public void getMenu8() {System.out.println(menu8);}
    public void getMenu9() {System.out.println(menu9);}
    public void getMenu10() {System.out.println(menu10);}
    public void getMenu11() {System.out.println(menu11);}
    public void getMenu12() {System.out.println(menu12);}
    public void getMenu13() {System.out.println(menu13);}

    public int  prompt( ) {
        Scanner collect = new Scanner(System.in);
        int prom = collect.nextInt();
        return prom;
    }


}
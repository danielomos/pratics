
public class SamsungApplication {
    public static void main(String[] args) {
        Samsung one = new Samsung();
        boolean mainLoop = true;

        one.getMainmenu();
        int response = one.prompt();
        switch (response) {
            case 1:

                one.getMenu1();
                response = one.prompt();
                switch (response) {
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
                        one.getMenu1_8();
                        response = one.prompt();
                        switch (response) {
                            case 1:
                                System.out.println("Type of View");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;

                        }
                        break;
                    case 9:
                        System.out.println("Speen Dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                }
                break;
            case 2:
                one.getMenu2();
                response = one.prompt();
                switch (response) {
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
                        one.getMenu2_7();
                        response = one.prompt();
                        switch (response) {
                            case 1:
                                one.getMenu2_7_1();
                                response = one.prompt();
                                switch (response) {
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
                            case 2:

                                one.getMenu2_7_2();
                                response = one.prompt();
                                switch (response) {
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
                break;
            case 3:
                one.getMenu3();
                break;
            case 4:
                one.getMenu4();
                response = one.prompt();
                switch (response){
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
                        one.getMenu4_5();
                        response= one.prompt();
                        switch (response){
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
                    case 6:
                        one.getMenu4_6();
                        response = one.prompt();
                        switch (response){
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls cost");
                                break;
                            case 3:
                                System.out.println("Clear Counters");

                        }
                    case 7:
                        one.getMenu4_7();
                        response= one.prompt();
                        switch (response){
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;

                        }
                    case 8:
                        System.out.println("Prepaid Credit");
                        break;
                }
                break;
            case 5:
                one.getMenu5();
                response = one.prompt();
                switch (response){
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

                }
                break;
            case 6:
                one.getMenu6();
                response = one.prompt();
                switch (response){
                    case 1:
                        one.getMenu6_1();
                        response = one.prompt();
                        switch (response){
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
                        }
                    case 2:
                        one.getMenu6_2();
                        response = one.prompt();
                        switch (response){
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
                        }
                    case 3:
                        one.getMenu6_3();
                        response = one.prompt();
                        switch (response){
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
                        }
                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                }
                break;
            case 7:
                one.getMenu7();
                break;
            case 8:
                one.getMenu8();
                break;
            case 9:
                one.getMenu9();
                break;
            case 10:
                one.getMenu10();
                break;
            case 11:
                one.getMenu11();
                response = one.prompt();
                switch (response){
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
                break;
            case 12:
                one.getMenu12();
                break;
            case 13:
                one.getMenu13();
                break;
            default:
                System.out.print("out");
        }

    }
}







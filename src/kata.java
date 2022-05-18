public class kata {
    private int number;
    private int factor;
    public static int sumFactor(int number, int num){
        number = 0;
        num = 0;
        int factor = 1;
        while (factor <num){
            if (num%factor == 0){
                number +=factor;
            }
            number++;
        }
        return number;
    }
}

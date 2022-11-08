import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final Level level = Level.FINE;
    private static int getSum(int num){
        logger.log(level, ()-> "in getSum with "+num);
        if(num%10 == num) return num;
        return num%10+getSum(num/10);
    }
    public static boolean isHarshad(int num){
        return num % getSum(num) == 0;
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(isHarshad(num)) System.out.println(num + " is a Harshad Number");
        else System.out.println(num+ " is not a Harshad Number");
    }
}
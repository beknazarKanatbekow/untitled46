import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[]Num = {15,43,-56,36,-78,58,48,38,59,-76,56,-95,36,16,-74};
        boolean num = false;
        double numer = 0;
        double numbers = 0;
        for ( double number: Num) {
            if (number < 0){
                num = true;
            }else {
                if (num){
                    numer += number;
                    numbers++;
                    System.out.println(numer / numbers );
                    System.out.println(Arrays.toString(Num));
                }
            }
        }{

        }
    }
}
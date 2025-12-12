package personalworks;
import java.lang.Math.*;

public class test {
    public static void main(String[] args) {
        long n = 100000;
        long counter = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                counter++;
            }
        }
        System.out.println("n log(n): "+ (n * Math.log(n)));
        System.out.println("Actual number of operations: "+counter);
        System.out.println("n^2: "+ n * n);
    }
}

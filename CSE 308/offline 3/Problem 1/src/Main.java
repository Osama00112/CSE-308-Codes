import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int finalSum;
        TildeDelim tildeDelim = new TildeDelim();
        File myfile = new File("input.txt");
        finalSum = tildeDelim.sum(myfile);
        System.out.println("Sum Found : " + finalSum);
    }
}

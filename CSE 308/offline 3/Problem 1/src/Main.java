import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int finalSum;
        TildeDelim tildeDelim = new TildeDelim();
        finalSum = tildeDelim.sum("input.txt");
        System.out.println("Sum Found : " + finalSum);
    }
}

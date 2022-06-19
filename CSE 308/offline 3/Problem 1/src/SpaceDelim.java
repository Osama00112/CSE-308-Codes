import java.io.*;

public class SpaceDelim implements Delim{
    @Override
    public int sum(File fileName) throws IOException {
        int sum = 0;
        //File myFile = new File(fileName);
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String str = bf.readLine();
        String[] integerStrings = str.split(" ");
        for (String integerString : integerStrings) {
            sum += Integer.parseInt(integerString);
        }
        return sum;
    }
}

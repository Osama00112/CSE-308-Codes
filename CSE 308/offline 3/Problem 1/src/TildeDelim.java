import java.io.*;

public class TildeDelim implements AnotherDelim{
    DelimAdapter adapter = new DelimAdapter();
    @Override
    public int sum(String fileName) throws IOException {
        int sum = 0;
        File temp = File.createTempFile("newFile","txt");

        FileWriter fw = new FileWriter("newFile.txt");
        File myFile = new File(fileName);
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String str = bf.readLine();
        String[] integerStrings = str.split("~");
        String line = "";
        for(String integerString : integerStrings){
            line += integerString;
            line += " ";
        }
        fw.write(line);
        fw.close();
        return adapter.sum("newFile.txt");

    }
}

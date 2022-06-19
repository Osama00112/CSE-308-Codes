import java.io.*;

public class TildeDelim implements AnotherDelim{
    DelimAdapter adapter = new DelimAdapter();
    @Override
    public int sum(File fileName) throws IOException {
        int sum = 0;
        File temp = File.createTempFile("newFile","txt");

        FileWriter fw = new FileWriter(temp);
        //File myFile = new File(fileName);
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String str = bf.readLine();
        String[] integerStrings = str.split("~");
        StringBuilder line = new StringBuilder();
        for(String integerString : integerStrings){
            line.append(integerString);
            line.append(" ");
        }
        fw.write(line.toString());
        fw.close();
        return adapter.sum(temp);

    }
}

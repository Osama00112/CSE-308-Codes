import java.io.IOException;

public class DelimAdapter implements AnotherDelim{
    Delim delim;
    public DelimAdapter(){
        delim = new SpaceDelim();
    }
    @Override
    public int sum(String fileName) throws IOException {
        return delim.sum(fileName);
    }
}

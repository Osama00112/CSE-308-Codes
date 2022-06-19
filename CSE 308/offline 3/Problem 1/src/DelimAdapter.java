import java.io.File;
import java.io.IOException;

public class DelimAdapter implements AnotherDelim{
    Delim delim;
    public DelimAdapter(){
        delim = new SpaceDelim();
    }
    @Override
    public int sum(File fileName) throws IOException {
        return delim.sum(fileName);
    }
}

public class CPP_Parser implements Parser {
    private final String parserName;
    CPP_Parser(){
        parserName = "CPP Parser";
        System.out.println(parserName + " created");
    }

    @Override
    public void parse() {
        System.out.println("Extension \".cpp\" file parsed via CPP Parser");
    }
}

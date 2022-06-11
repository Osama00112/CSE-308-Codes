public class Python_Parser implements Parser {
    private final String parserName;
    Python_Parser(){
        parserName = "Python Parser";
        System.out.println(parserName + " created");
    }

    @Override
    public void parse() {
        System.out.println("Extension \".py\" file parsed via Python Parser");
    }

}

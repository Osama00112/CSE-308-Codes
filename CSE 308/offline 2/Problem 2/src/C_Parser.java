public class C_Parser implements Parser {
    private final String parserName;
    C_Parser(){
        parserName = "C Parser";
        System.out.println(parserName + " created");
    }

    @Override
    public void parse() {
        System.out.println("Extension \".c\" file parsed via C Parser");
    }
}

public class parserFactory {
    public Parser getParser(String name){
        if(name == null){
            return null;
        } else if(name.equalsIgnoreCase("c")){
            return new C_Parser();
        } else if(name.equalsIgnoreCase("cpp")){
            return new CPP_Parser();
        } else if(name.equalsIgnoreCase("py")){
            return new Python_Parser();
        }
        return null;
    }
}

public class Editor {
    private static Editor editor;
    private static Parser editorParser;
    private static Fonts editorFont;
    private static parserFactory pFactory;
    private static FontFactory fFactory;
    private Editor(){
        pFactory = new parserFactory();
        fFactory = new FontFactory();
    }

    public static Editor getInstance(){
        if (editor == null){
            editor = new Editor();
        }
        return editor;
    }

    public void setEnvironment(String parser, String font){
        editorParser = pFactory.getParser(parser);
        editorFont = fFactory.getFont(font);
        editorFont.setFont();
    }
    public void parse(){
        editorParser.parse();
    }

}

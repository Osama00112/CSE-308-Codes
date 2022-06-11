public class Editor {
    private static Editor editor;
    private static Parser editorParser;
    private static Fonts editorFont;
    private static AbstractFactory pFactory;
    private static AbstractFactory fFactory;
    private Editor(){
        pFactory = FactoryProducer.getFactory("Parser");
        fFactory = FactoryProducer.getFactory("Font");
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

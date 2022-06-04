public class Consolas implements Fonts{
    private final String fontName;
    Consolas(){
        fontName = "Consolas";
    }

    @Override
    public void setFont() {
        System.out.println("Font set to : " + getFontName());
    }
    public String getFontName() {
        return fontName;
    }
}

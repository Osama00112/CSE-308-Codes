public class Monaco implements Fonts{
    private final String fontName;
    Monaco(){
        fontName = "Monaco";
    }

    @Override
    public void setFont() {
        System.out.println("Font set to : " + getFontName());
    }
    public String getFontName() {
        return fontName;
    }
}

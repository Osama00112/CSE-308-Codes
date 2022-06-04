public class CourierNew implements Fonts{
    private final String fontName;
    CourierNew(){
        fontName = "Courier New";
    }

    @Override
    public void setFont() {
        System.out.println("Font set to : " + getFontName());
    }
    public String getFontName() {
        return fontName;
    }
}

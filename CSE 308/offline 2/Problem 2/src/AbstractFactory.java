public abstract class AbstractFactory {
    public abstract Parser getParser(String name);
    public abstract Fonts getFont(String name);
}

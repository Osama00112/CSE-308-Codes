import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //System.out.println("sion \".py\" file ");
        String fileName;
        String extension;
        String selection;
        String font;
        Editor myEditor = Editor.getInstance();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input file name: ");
        fileName = sc.next();
        extension = fileName.split("\\.")[1];

        System.out.println("""
                Select Font:
                1. Courier New
                2. Monaco
                3. Consolas
                """);
        selection = sc.next();
        if(selection.equalsIgnoreCase("1")){
            font = "Courier";
        }else if(selection.equalsIgnoreCase("2")){
            font = "Monaco";
        }else if(selection.equalsIgnoreCase("3")){
            font = "Consolas";
        }
        else{
            font = null;
            System.out.println("Invalid selection");
        }
        myEditor.setEnvironment(extension, font);
        myEditor.parse();

    }
}

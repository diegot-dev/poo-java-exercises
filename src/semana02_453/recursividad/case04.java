package semana02_453.recursividad;
import java.util.Scanner;
import java.io.File;
public class case04 {
    public static void print(String txt)
    {
        System.out.println(txt);
    }
    
    public static void browseFolder(File folder)
    {
        File[] archives = folder.listFiles();
        if (archives == null) print(folder.getName());
        for (File archive : archives) {
            if (archive.isDirectory()) {
                print("\nCarpeta : " + archive.getAbsolutePath());
                browseFolder(archive);
            } else print("Archivo : " + archive.getAbsolutePath());
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el directorio: ");
        String path = s.nextLine();
        s.close();

        File folder = new File(path);
        
        if (folder.exists() && folder.isDirectory()) {
            browseFolder(folder);
        } else print("No existe o no es una carpeta");
        
    }
}

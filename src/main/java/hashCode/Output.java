package hashCode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Output {

    public Output(String f){
        escribirFichero(f);
    }

    public void escribirFichero(String f){
        PrintWriter fichero = null;
        try {
            fichero = new PrintWriter(new FileOutputStream("C:\\Users\\javie\\Desktop\\NullPointTeam_" + f + ".txt"));
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Error al hacer el fichero");
        }

        Photos misFotos = new Photos("a_example.txt");

        fichero.print(misFotos.organizarFotos());


        fichero.close();
    }




}

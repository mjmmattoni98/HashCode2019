package hashCode;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        Input input = new Input("b_lovely_landscapes.txt");
        //System.out.println(input.getNumberOfPhotos());
        //System.out.println(input.mostrarFotos());
        //Output output = new Output("a");
        Prueba prueba = new Prueba();
        prueba.cuerpo(input.getPhotos());
    }
}

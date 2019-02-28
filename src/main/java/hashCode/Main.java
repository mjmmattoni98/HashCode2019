package hashCode;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        Input input = new Input();
        input.readFile("a_example.txt");
        System.out.println(input.getNumberOfPhotos());
        System.out.println(input.mostrarFotos());

    }
}

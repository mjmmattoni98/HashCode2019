package hashCode;

import java.util.List;
import java.util.ListIterator;

public class Photos {
    private List<Node> photos;
    private int numberOfPhotos;

    public Photos(String fichero){
        inicializarVariables(fichero);
    }

    private void inicializarVariables(String fichero){
        Input input = new Input(fichero);
        this.photos = input.getPhotos();
        this.numberOfPhotos = input.getNumberOfPhotos();
    }

    public void organizarVerticales(){
        ListIterator<Node> iter = photos.listIterator();

    }

    public String organizarFotos(){
        String s = "Hola \n soy \n patata.";


        return s;
    }



}


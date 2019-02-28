package hashCode;

import java.util.List;

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

    public String organizarFotos(){
        String s = "Hola \n soy \n patata.";


        return s;
    }



}


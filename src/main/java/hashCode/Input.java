package hashCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Input {
    private int numberOfPhotos;
    private List<Node> photos;

    public Input(String fichero){
        readFile(fichero);
    }

    private void readFile(String fichero){
        fichero = "C:\\Users\\javie\\IdeaProjects\\HashCode2019\\src\\main\\java\\hashCode\\" + fichero;
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new FileInputStream(fichero));
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("El fichero " + fichero + " no existe.");
        }
        if (inputFile.hasNextLine()){
            numberOfPhotos = Integer.parseInt(inputFile.nextLine());
        }

        photos = new ArrayList<Node>();
        int i = 0;
        while (inputFile.hasNextLine()){
            String[] line = inputFile.nextLine().split(" ");
            String type = line[0];
            int numberOfTags = Integer.parseInt(line[1]);
            Set<String> tags = new HashSet<String>();
            for (int j = 2; j < line.length; j++)
                tags.add(line[j]);
            photos.add(new Node(type, numberOfTags, i, tags));
            i++;
        }
        inputFile.close();
    }


    public int getNumberOfPhotos(){
        return numberOfPhotos;
    }

    public List<Node> getPhotos(){
        return photos;
    }

    public String mostrarFotos(){
        String s = "";
        for (Node node : photos){
            s += node.toString() + "\n";
        }

        return s;
    }

}

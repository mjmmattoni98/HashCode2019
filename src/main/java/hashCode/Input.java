package hashCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Input {
    private class Node {
        String type;
        int numberOfTags;
        Set<String> tags;

        Node (String type, int numberOfTags, Set<String> tags) {
            this.type = type;
            this.numberOfTags = numberOfTags;
            this.tags = tags;
        }


        @Override
        public String toString() {
            String misTags = "";
            for (String tag : tags) {
                misTags += tag + " ";
            }
            return type + " " + Integer.toString(numberOfTags) + " " + misTags;

        }
        /*@Override
        public boolean equals (Object other) {
            if (this == other) return true;
            if (!(other instanceof Node)) return false;
            //System.out.println("equals de node");
            Node<T> anotherNode = (Node<T>) other;
            return data.equals(anotherNode.data);
        }*/
    }

    private int numberOfPhotos;
    private List<Node> photos;

    public Input(){
        super();
    }

    public void readFile(String fichero){
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
        while (inputFile.hasNextLine()){
            String[] line = inputFile.nextLine().split(" ");
            String type = line[0];
            int numberOfTags = Integer.parseInt(line[1]);
            Set<String> tags = new HashSet<String>();
            for (int i = 2; i < line.length; i++)
                tags.add(line[i]);
            photos.add(new Node(type, numberOfTags, tags));
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

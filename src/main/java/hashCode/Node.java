package hashCode;

import java.util.Set;

public class Node {
    String type;
    int numberOfTags;
    Set<String> tags;
    boolean used;
    int indice;

    Node (String type, int numberOfTags, int indice, Set<String> tags) {
        this.type = type;
        this.numberOfTags = numberOfTags;
        this.tags = tags;
        this.used = false;
        this.indice = indice;
    }

    Node (String type, int numberOfTags, Set<String> tags) {
        this.type = type;
        this.numberOfTags = numberOfTags;
        this.tags = tags;
        this.used = false;
    }

    public void setUsed(boolean used){
        this.used = used;
    }

    public void isUsed(){
        this.used = true;
    }

    public void isNotUsed(){
        this.used = false;
    }

    @Override
    public String toString() {
        String misTags = "";
        for (String tag : tags) {
            misTags += tag + " ";
        }
        return indice + " " + type + " " + numberOfTags + " " + misTags;

    }
}

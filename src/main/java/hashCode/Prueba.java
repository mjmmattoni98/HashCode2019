package hashCode;

import java.util.*;

public class Prueba {
    public int interes(Set<String> a, Set<String> b){
        Set<String> ejA = new HashSet<String>();
        Set<String> ejB = new HashSet<String>();
        ejA.addAll(a);
        ejB.addAll(b);
        System.out.println("IMPRIMIR EN INTERES:");

        Set<String> AmB = ejA;
        System.out.println("a");

        for (String s : a){
            System.out.print(s + " ");
        }
        System.out.println("");
        Set<String> BmA = ejB;
        System.out.println("b");

        for (String s : b){
            System.out.print(s + " ");
        }
        System.out.println("");
        Set<String> inter = a;
        AmB.removeAll(b);
        System.out.println("AmB");
        for (String s : AmB){
            System.out.print(s + " ");
        }
        System.out.println("");
        BmA.removeAll(a);
        System.out.println("BmA");
        for (String s : BmA){
            System.out.print(s + " ");
        }
        System.out.println("");
        inter.retainAll(b);
        System.out.println("inter");
        for (String s : inter){
            System.out.print(s + " ");
        }
        System.out.println("");

        System.out.printf("AmB %d BmA %d inter %d\n",AmB.size(),BmA.size(),inter.size());
        if (AmB.size() <= BmA.size()) {
            if (AmB.size() <= inter.size())
                return AmB.size();
            return inter.size();
        }
        if (BmA.size() <= inter.size())
            return BmA.size();
        return inter.size();
    }

    public void cuerpo (List<Node> photos){
        List<Node> lista = photos;
        //ListIterator<Node> iter = lista.listIterator();


        /*for (int x=0;x<=(lista.size()-4)/2;x++){*/
            for (int y=2; y<lista.size()-2;y++){
                int unorm = interes(lista.get(y-2).tags,lista.get(y-1).tags);
                int dosorm = interes(lista.get(y).tags,lista.get(y+1).tags);
                int ucamb = interes(lista.get(y-2).tags,lista.get(y).tags);
                int docamb = interes(lista.get(y-1).tags,lista.get(y+1).tags);
                System.out.printf("%d con %d: %d\n %d con %d: %d\n %d con %d: %d\n %d con %d: %d\n",
                        y-2,y-1,unorm,y,y+1,dosorm,y-2,y,ucamb,y-1,y+1,docamb);
                System.out.println("IMPRIMIR TAGS:");
                for (int j = y-2; j<=y+1;j++){
                    System.out.println(j);
                    for (String s : lista.get(j).tags){
                        System.out.print(s + " ");
                    }
                    System.out.println("");
                }
                if (    unorm + dosorm < ucamb +docamb){
                    /*Set<String> malab = lista.get(y).tags;
                    lista.set(y,lista.get(y-1));
                    lista.set(y-1,malab);*/
                   // Node malab = lista.get(y);
                    //lista.set(y,lista.get(y-1));
                    //lista.set(y-1,malab);
                    //System.out.printf("Ha habido un intercambio en posición %d\n",y);
                }
            }
            /*for (int y=lista.size()-2;y>2;y--){
                int unorm = interes(lista.get(y-2).tags,lista.get(y-1).tags);
                int dosorm = interes(lista.get(y).tags,lista.get(y+1).tags);
                int ucamb = interes(lista.get(y-2).tags,lista.get(y).tags);
                int docamb = interes(lista.get(y-1).tags,lista.get(y+1).tags);
                System.out.printf("%d con %d: %d\n %d con %d: %d\n %d con %d: %d\n %d con %d: %d\n",
                        y-2,y-1,unorm,y,y+1,dosorm,y-2,y,ucamb,y-1,y+1,docamb);
                if (    unorm + dosorm < ucamb +docamb){
                    Node malab = lista.get(y);
                    lista.set(y,lista.get(y-1));
                    lista.set(y-1,malab);
                    System.out.printf("Ha habido un intercambio en posición %d\n",y);
                }
            }*/
        //}
        int intotal = 0;
        for (int i=0;i<lista.size()-1;i++){
            int eres = interes(lista.get(i).tags,lista.get(i+1).tags);
            intotal+=eres;
            System.out.printf("Entre %d y %d hay interes de %d\n",i,i+1,eres);
        }
        System.out.printf("Total: %d\n",intotal);
    }
}

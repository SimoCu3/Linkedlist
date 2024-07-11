/*
CONSEGNA:
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
*/

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> fruitList = new LinkedList<>();

        fruitList.add("Mela");

        //Aggiungere un elemento al PRIMO POSTO della lista
        fruitList.addFirst("Banana");

        //Aggiungere un elemento all'ULTIMO POSTO della lista
        fruitList.addLast("Pera");

        for(String element : fruitList){
            System.out.println("Frutto: " + element);
        }

    }
}

/*
CORREZIONE:

*/
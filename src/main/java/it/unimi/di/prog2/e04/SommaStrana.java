package it.unimi.di.prog2.e04;

import java.util.*;

public class SommaStrana {
  private SommaStrana() {}
  public static void main(String[] args) {
    Vector<Vector<Integer>> interi = new Vector<>();
    int max = 0, i = 0, j = 0, s1 = 0, s2 = 0, somma = 0, riporto = 0;

    //inserisco in un vettore all'interno di un'altro vettore tutti i numeri che ricevo in input
    try (Scanner s = new Scanner(System.in)) {
        while (s.hasNext()) {
            final String linea = s.nextLine();
            Vector<Integer> numeri = new Vector<>(linea.length()); 
            for (char c : linea.toCharArray()) {
                if (Character.isDigit(c)) {
                    numeri.add(Character.getNumericValue(c));
                }
            }
            interi.add(numeri);
            max = Math.max(max, numeri.size());
        }
    }

    Vector<Integer> risultati = new Vector<>(Collections.nCopies(max, 0));

    // Rendo tutti i vettori di dimensione massima, aggiungendo zeri a sinistra

    for (Vector<Integer> a : interi) {
      while(a.size() < max){
        a.add(0,0);
      }
    }

    //eseguo la somma
    for(i = 0; i < interi.size(); i++){
      for(j = max-1; j>=0; j--){
        s1 = interi.get(i).get(j);
        s2 = risultati.get(j);
        somma = s1+s2+riporto;
        if(somma > 9){
          riporto = 1;
          somma = 9 - (somma % 10);
        }else{
          riporto = 0;
        }
        risultati.set(j, somma);
      }
      if((i == interi.size()-1) && riporto == 1) risultati.add(0,1);
    }

    //stampo il risultato
    for(i = 0; i<risultati.size(); i++){
      System.out.print(risultati.get(i));
    }

  }
}

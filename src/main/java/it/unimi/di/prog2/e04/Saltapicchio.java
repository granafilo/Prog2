package it.unimi.di.prog2.e04;

import java.util.*;

public class Saltapicchio {
  private Saltapicchio() {}
  public static void main(String[] args) {
    final int N = Integer.parseInt(args[0]);
    int precedente = -1, corrente = 0;
    Set<Integer> salta = new HashSet<>();

    //Inserisco in un array N interi
    try (Scanner s = new Scanner(System.in)){
      for (int i = 0; i < N && s.hasNextInt(); i++) {
        corrente = s.nextInt();
        if(i > 0){
          int differenza = Math.abs(precedente-corrente);
          if((differenza > 0) && (differenza < N)){
            salta.add(differenza);
          }
        }
        precedente = corrente;
      }
    }

    if( salta.size() == (N-1)){
      System.out.println("saltapicchio");
    }
  }
}


package it.unimi.di.prog2.e04;

/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/nave_spaziale/Testo.md">testo</a>.
 */

import java.util.*;

public class NaveSpaziale {

  public static int quoziente(int to){
    return Math.floorDiv(to, 4);
  }

  public static int resto(int to){
    return Math.floorMod(to, 4);
  }

  private NaveSpaziale() {}
  public static void main(String[] args) {
    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);
    String output = "";

    while (Math.floorDiv(to, 4) >= from) {
      for(int i = 0; i < resto(to); i++){
        output = "P" + output;
      }
      output = "S" + output;
      to = quoziente(to);
    }
    while(to != from){
      from++;
      output = "P" + output;
    }

    System.out.println(output);
  }
}

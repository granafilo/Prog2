/*

Copyright 2024 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.e04;

/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/nave_spaziale/Testo.md">testo</a>.
 */

import java.util.*;

public class NaveSpaziale {

  public static int potenza(int from){
    return (int) Math.pow(from, 4);
  }

  private NaveSpaziale() {}
  public static void main(String[] args) {
    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);
    String output = ""; 
      while(true){
        if(potenza(from) < to){
          String pString = String.join("", Collections.nCopies(Math.max(0, to - from), "P")); 
          output = output + pString;
          break;
        }else{
          output+= "S";
          from = from*2;
        }
      }

    System.out.println(output);
  }
}

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

package it.unimi.di.prog2.e03;

import java.util.*;
/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/lettera_piu_frequente/Testo.md">testo</a>,
 */
public class LetteraPiùFrequente {

  /** . */
  private LetteraPiùFrequente() {}

  /*- Completa il seguente main */

  public static void main(String[] args) {
    int[] map = new int['z'-'a'+1];
    int i = 0, max = 0;
    char l;
    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNext()) {
        final String parola = s.nextLine();
        for(i = 0; i < parola.length(); i++){
          l = parola.charAt(i);
          if (l != ' ' && l != '\n')
            map[l-'a']++;
        }
      }
    }
    for(int v : map){
      max = Math.max(max, v);
    }
    System.out.println(max);
  }
}

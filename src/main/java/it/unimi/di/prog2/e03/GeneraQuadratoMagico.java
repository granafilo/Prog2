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

/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/genera_quadrato_magico/Testo.md">testo</a>,
 */
public class GeneraQuadratoMagico {

  /** . */
  private GeneraQuadratoMagico() {}

  /*- Completa il seguente main*/

  public static void main(String[] args) {
    final int N = Integer.parseInt(args[0]);
    int[][] quadrato = new int[N][N];
    int cont = 0,i = 0, j = Math.floorDiv(N,2);

    int cap = N*N;

    while (cont++ < cap) {
      quadrato[i][j] = cont;
      i--;
      j = (j+1)%N;
      if (i < 0) i = N-1;
      if (quadrato[i][j] != 0){
        i = (i+2)%N; 
        j--;
        if (j < 0) j = N-1;
      } 
    }

    for(int righe = 0; righe < N; righe++) {
      for (int colonne = 0; colonne < N; colonne++) {
        System.out.print(quadrato[righe][colonne] + " ");
      }
      System.out.println();
    }
  }
}

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
 * href="https://github.com/mapio/labprog/blob/master/esercizi/bounding_box/Testo.md">testo</a>,
 */
public class BoundingBox {
    /** . */
    private BoundingBox() {}
    /*- Completa il seguente main */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        int altezza = 0, larghezza = 0;
        int altezzaMassima = 0, larghezzaMassima = 0, primoIndiceL = -1, ultimoIndiceL = -1, i = 0, j = 0, primoIndiceA = -1, ultimoIndiceA = -1;
        boolean rigaCompresa = false, ultimoChar = true;
        try (Scanner s = new Scanner(System.in)){
            while (s.hasNext()) {
                final String linea = s.nextLine(); // il final rende non modificabile la linea ricevuta in input
                char[] caratteriLinea = linea.toCharArray(); //trasformo la linea (tipo string) in input in un array di caratteri
                lista.add(linea); //aggiungo l'array di caratteri alla lista contente tutto l'imput
                //Calcolo la larghezza massima
                primoIndiceL = 0;
                ultimoIndiceL = 0;
                /*ciclo for che scorre da dx verso sx e da sx verso dx sulla linea in input e
                salva nelle due variabili quando incontra il primo e l'ultimo carattere*/
                for (i = 0, j = caratteriLinea.length - 1; i < caratteriLinea.length && j > 0; i++, j--) {
                    if (ultimoIndiceL == 0 && caratteriLinea[j] == '*') ultimoIndiceL = (j +1) ;
                    if (primoIndiceL == 0 && caratteriLinea[i] == '*') primoIndiceL = (i) ;
                    //System.out.println(primoIndiceL + " " + ultimoIndiceL + " " + linea);
                }
                larghezza = (ultimoIndiceL - primoIndiceL) ;
                if (larghezza > larghezzaMassima) larghezzaMassima = larghezza;
                //fine calcolo larghezza massima
            }
            /*calcolo altezza */
            /*Ciclo for che scorre da dx verso sx e da sx verso dx nella lista formata da tutte le righe, in formato String, di input e
            salva nelle due variabili quando incontra il primo e l'ultimo carattere */
            for( i = 0, j = lista.size()-1; i < lista.size() && j > 0; i++, j--) {
                if (ultimoIndiceA == -1 && lista.get(j).contains("*")) ultimoIndiceA = j+1;
                if (primoIndiceA == -1 && lista.get(i).contains("*")) primoIndiceA = i + 1;
            }
            altezzaMassima = (ultimoIndiceA - primoIndiceA) + 1 ;
        }
        System.out.println(altezzaMassima + " " + larghezzaMassima);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultimo;

import java.util.ArrayList;

/**
 *
 * @author lucat
 */
public class ProgPrinc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numerosPrimos(1, 20);
        numerosDivisiblesTres(1, 20);
    }

    public static void numerosPrimos(int numInicial, int numFinal) {
        for (Integer i = numInicial; i <= numFinal; i++) {
            double raiz = Math.sqrt(i);
            boolean esPrimo = true;
            for (int j = 2; j <= raiz; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo == true) {
                System.out.println("Numero primo: " + i);
            }
        }

    }

    public static void numerosDivisiblesTres(int numInicial, int numFinal) {
        for (Integer i = numInicial; i <= numFinal; i++) {
            if (i % 3 == 0) {
                System.out.println("Mutiplo de 3: " + i);
            }
        }
    }

    public static boolean validarRango(int numInicial, int numFinal) {
        return !(numInicial < 2 || numFinal < 2 || numInicial > numFinal);
    }
}

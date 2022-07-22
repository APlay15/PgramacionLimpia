/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridad;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author lucat
 */
public class distanciaAbsoluta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar cantidad del arreglo: ");
        int cantidad = teclado.nextInt();
        int[] valores = new int[cantidad];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduzca los valores: ");
            valores[i] = teclado.nextInt();
        }
        Arrays.sort(valores);
        int distanciaMenor, distanciaMayor;
//For
        distanciaMenor = valores[2] - valores[1];
        distanciaMayor = valores[cantidad-1] - valores[0];
        System.out.println("Valores: " + distanciaMayor + " " + distanciaMenor);
    }

}

//        int menorValor, mayorValor, menorValorSig, menorValorSeg;
//        mayorValor = menorValor = menorValorSig = menorValorSeg = valores[0];
//        for (int i = 0; i < valores.length; i++) {
//            if (valores[i] > mayorValor) {
//                mayorValor = valores[i];
//            }
//            if (valores[i] < menorValor) {
//                menorValor = valores[i];
//            }
//        }


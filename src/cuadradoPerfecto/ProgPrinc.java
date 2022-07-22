/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradoPerfecto;

import java.util.Scanner;

/**
 *
 * @author lucat
 */
public class ProgPrinc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Casos a realizar: ");
        int casos = teclado.nextInt();
        for (int i = 0; i < casos; i++) {
            System.out.print("Inicio del rango: ");
            int ini = teclado.nextInt();
            System.out.print("Final del rango: ");
            int fin = teclado.nextInt();
            CuadradoPerfecto.cuadradoPerfecto(ini, fin);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradoPerfecto;

/**
 *
 * @author lucat
 */
public class CuadradoPerfecto {

    public static void cuadradoPerfecto(int entradaIni, int entradaFin) {
        int cuadradosPerfectos = 0;
        for (int base = 0; (base * base) <= entradaFin; base++) {
            int cuadrado = base * base;
            if (cuadrado >= entradaIni && cuadrado <= entradaFin) {
                cuadradosPerfectos++;
            }
        }
        System.out.println("Cuadrados perfectos encontrados: " + cuadradosPerfectos);
    }
}


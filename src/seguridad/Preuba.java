/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridad;

/**
 *
 * @author lucat
 */
public class Preuba {

    public static void main(String[] args) {
        int valores[] = {1, 2, 3, 4, 5};
        int cantidad = 0;
        int suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i];
        }
        float promedio = suma / valores.length;

        System.out.println(suma);
        System.out.println(promedio);
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > promedio) {
                System.out.println(i);
            }
        }

    }
}

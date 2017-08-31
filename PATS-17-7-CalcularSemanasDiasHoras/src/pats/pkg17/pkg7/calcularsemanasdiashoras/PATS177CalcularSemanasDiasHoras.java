/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg17.pkg7.calcularsemanasdiashoras;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class PATS177CalcularSemanasDiasHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.print("Ingresa el numero de HORAS TOTALES: ");
        horasTotales = teclado.nextInt();
        
        //La semana tiene 168 horas
        //7 dias * 24 hrs de un día = 168 horas
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("Semanas = " + semanas);
        System.out.println("Días = " + dias);
        System.out.println("Horas = " + horas);
        
        
    }
    
}

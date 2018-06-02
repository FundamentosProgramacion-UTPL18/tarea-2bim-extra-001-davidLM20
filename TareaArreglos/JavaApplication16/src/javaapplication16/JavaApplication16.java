/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author jhand
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de los arreglos
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4"};
        double[] ventas_mes1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double total_final_sucursales = 0;
        double suma_total = 0;
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];

        // primer for es para sumar y sacar los promedios 
        for (int i = 0; i < ventas_mes3.length; i++) {
            double suma = ventas_mes1[i] + ventas_mes2[i] + ventas_mes3[i];
            double promedio = suma / 3;
            // se guarda los resultados el los respectivos arreglos
            
            venta_total_sucursal[i] = suma;
            venta_promedio_sucursal[i] = promedio;
            /*sumo todos los totales prara presentar los totales de todas las sucursales 
            esto debido a que el ejercicio no dice si se debe sacar un pormedio o solo presentar las ventas totales
            */
            suma_total = suma + suma_total;
            
        }
        // segundo ciclo for es para presentar los encabezados
        for (String mese : meses) {
            System.out.printf("\t\t%s", mese);
        }
        
        System.out.printf("\t%s\t\t%s\n", "Total", "Promedio");
        System.out.println("");
        
        // tercer ciclo for es para la presentacion de los valores previamente establecidos y los nuevos resultados 
        for (int i = 0; i < venta_promedio_sucursal.length; i++) {
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[i], ventas_mes1[i], ventas_mes2[i], ventas_mes3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);

        }
        // estos print son para  presntar la suma final de los totales de las ventas
        System.out.println("");
        System.out.printf("Totales de ventas de todas la sucursales es: %.1f\n", suma_total);

    }

}

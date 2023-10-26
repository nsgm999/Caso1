/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casomain;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author garci
 */
public class CasoMain {

    public static void main(String[] args) {
        List<Factura> facturas = Arrays.asList(new Factura("Juan Ramon Solis", "11202000", 2351, 20000, 1, 2023, 1),
                                                new Factura( "Juan Ramon Solis", "11202000", 2546, 30000, 2, 2023, 2),
                                                new Factura("Juan Ramon Solis", "11202000", 2700, 60000, 3, 2023, 1),
                                                new Factura("Juan Ramon Solis", "11202000", 2810, 10000, 4, 2023, 2),
                                                new Factura("Juan Ramon Solis", "11202000", 2912, 25000, 4, 2023, 1));
        
        
       
        imprimirDatos(facturas);
        
        calcular(facturas, 2546, 2810);
    }
    
    public static void calcular(List<Factura> facturas, int... numeroF){
        
        Integer suma = 0;
        for (int i = 0; i < numeroF.length; i++) {
            for (Factura f : facturas) {
                if (f.getNumeroFactura().equals(numeroF[i]) ) {
                    suma += f.getMontoFactura();
                }
            } 
        }
        
        Double coutaMensual = ((suma*0.05) + suma)/6;
        
        
        System.out.println("\n Calculo de pagos: \n");
        
        for(int i = 1; i < 6; i++){
            System.out.printf("\tCuota %s %s Fecha de pago %s 2023 %n", i+1, coutaMensual.toString(), Meses.obtenerMesPorNumero(i +6) );
        }
        
    }
    
    public static void imprimirDatos(List<Factura> facturas){
        System.out.println("**********************************************************************");
        System.out.println("*                            Facturas                                *");
        System.out.println("**********************************************************************");
        System.out.printf("*%20s%10s%10s%10s%5s%5s%7s *%n","Nombre","cedula","NFactura","MFactura","Mes","year","estado");
        for(Factura f : facturas){
            System.out.printf("*%20s%10s%10s%10s%5s%5s%7s *%n", f.getNombre(),f.getCedula(), f.getNumeroFactura(), f.getMontoFactura(), f.getMes(), f.getYear(), f.getEstado());
        }
        System.out.println("**********************************************************************");
    }
}

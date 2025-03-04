package FirstParcial;
/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 24-Febrero-2025
 */

 
 
 // La clase calcula el total de ventas con un descuento 
 // Metodo que me calcula el total de ventas con un descuento del 10%
//sales es la de ventas
// total ya con el descuento


public class SalesWithDiscount {

    
    public double totalWithDiscount() {
        
        double[] sales = {100.0, 200.0, 150.0,};

        double total = 0.0;

       for (double sale : sales) {
            double saleWithDiscount = sale * 0.90; 
            System.out.println(sale + " * 0.90 = " + saleWithDiscount); 
            total += saleWithDiscount; 
        }

        return total; 
    }

}


    

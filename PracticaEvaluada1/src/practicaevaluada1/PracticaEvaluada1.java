/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brenes
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreDeArticulo ="";
        int CodigoDeCategoria =0;
        int ValorDelPaquete =0;
        JOptionPane.showInputDialog(null, "Digite el nombre del articulo"+nombreDeArticulo);
        JOptionPane.showInputDialog(null, "Digite el codigo de categoria, 1: Tecnologia, 2:Ropa y 3: Hogar"+CodigoDeCategoria);
        JOptionPane.showInputDialog(null, "Digite el valor del paquete"+ValorDelPaquete);
        //Calculo del 13% de iva
        if (CodigoDeCategoria==1 || CodigoDeCategoria==2 || CodigoDeCategoria==3){
            ValorDelPaquete=(int) (ValorDelPaquete*0.13);
            JOptionPane.showMessageDialog(null, "El valor del produtco con el IVA es de: "+ValorDelPaquete);
        if (CodigoDeCategoria==1){
            ValorDelPaquete=(int) (ValorDelPaquete*0.5);
            JOptionPane.showMessageDialog(null, "El valor del producto con el 5% de su aumento es de: "+ValorDelPaquete);
        }
        
        
        
            
        
        }
            
 }
}
        
      
        
    
        
       


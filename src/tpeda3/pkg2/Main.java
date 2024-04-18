/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpeda3.pkg2;

/**
 *
 * @author NandoJ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Pila p1=new Pila(10);
//        
//        p1.pushOrdenado(20);
//        p1.pushOrdenado(2);
//        p1.pushOrdenado(10);
//        p1.pushOrdenado(11);
//        p1.pushOrdenado(0);
        
//        System.out.println(p1.verElemento());

        Pila a=new Pila(10);
        Pila b=new Pila(10);
        a.push(500);
        a.push(400);
        a.push(300);
        a.push(2);
        a.push(-5);
        
        a.verElementos();
        
        b.push(50);
        b.push(40);
        b.push(30);
        b.push(20);
        b.push(10);
        
        b.verElementos();

        Pila.unidosNoMezclados(a, b);
        
        
//        Esto seria si el metodo no fuera estatico
//        Pila c=new Pila(10);
//        c.unidosNoMezclados(a, b);
    }
    
}

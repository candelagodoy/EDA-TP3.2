package tpeda3.pkg2;

public class Main {

    public static void main(String[] args) {
        
        //Complejidad baja: a. Pilas ordenadas
        Pila p1=new Pila(10);
        
        p1.pushOrdenado(20);
        p1.pushOrdenado(2);
        p1.pushOrdenado(10);
        p1.pushOrdenado(11);
        p1.pushOrdenado(0);
        
        //Complejidad media: d. Unidos no mezclados
        Pila a=new Pila(10);
        Pila b=new Pila(10);
        
        a.push(800);
        a.push(50);
        a.push(40);
        a.push(2);
        a.push(1);
        
        
        b.push(800);
        b.push(40);
        b.push(30);
        b.push(20);
        b.push(10);
        
        Pila c=Pila.unidosNoMezclados(a,b);
        c.verElementos();

    }
    
}
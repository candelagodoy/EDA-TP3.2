/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeda3.pkg2;

/**
 *
 * @author NandoJ
 */
public class Pila {

    private int n;
    private int[] pila;
    private int tope = -1;

    public Pila(int n) {
        this.n = n;
        pila = new int[this.n];
    }
    public int getTamaño(){
        return n;
    }
    
    public int getTope() {
        return tope;
    }

    public void push(int x) {
        if (tope < n - 1) {
            tope++;
            pila[tope] = x;
        } else {
            System.out.println("No se pudo insertar el elemento");
        }
    }

    public int pop() {
        int aux;

        if (tope >= 0) {
            aux = pila[tope];
            tope--;
            return aux;
        } else {
            System.out.println("No hay elementos en la pila");
            return -50;
        }
    }

    public boolean pilaVacia() {
        return (tope == -1);
    }

    public boolean pilaLlena() {
        return (tope == (n - 1));
    }

    public void verElementos() {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + pila[i] + "]");
        }
        System.out.println("");
        System.out.println("");
    }
    
    public int verElemento() {
        if (!pilaVacia()) {
            return pila[tope];
        }else{
            return -1;
        }
        
    }


    public void pushOrdenado(int x) {
        Pila pilaAux = new Pila(n);

        while(!pilaVacia() && x<verElemento()){
            pilaAux.push(pop());
        }
        pilaAux.verElementos();
        push(x);
        
        while(!pilaAux.pilaVacia()){
            push(pilaAux.pop());
        }

    }
    
    public static void unidosNoMezclados(Pila a, Pila b){
        Pila c = new Pila(a.getTamaño());
        
        while (!a.pilaVacia() && !b.pilaVacia()) {
            /*los 2 primeros if son solo para que si una pila está vacia,
            directamente pase a meter los elementos de la otra, sin esos if 
            tambien funciona, pero si una pila esta vacia su metodo verElemento() 
            va a devolver -1 y va a comparar con eso el elemento de la otra pila*/
            /*if(a.pilaVacia()){
                c.push(b.pop());
            }else if(b.pilaVacia()){
                c.push(a.pop());
            }else if (a.verElemento()<b.verElemento()) {
                c.push(a.pop());
            }else if(a.verElemento()>b.verElemento()){
                c.push(b.pop());
            }else if(b.verElemento()==a.verElemento()){
                c.push(b.pop());
                c.push(a.pop());
            }*/
            if(a.verElemento()<=b.verElemento()){
                c.push(a.pop());
            }else if(a.verElemento()>=b.verElemento()){
                c.push(b.pop());
            }/*else if (b.verElemento()==a.verElemento()) {
                c.push(b.pop());
                c.push(a.pop());
               
            }*/
        }
        
            while(!c.pilaVacia()) {
                a.push(c.pop());
            }
            while(!a.pilaVacia()) {
                b.push(a.pop());
            }
            while(!b.pilaVacia()) {
                c.push(b.pop());
            }
            c.verElementos();
    }
}

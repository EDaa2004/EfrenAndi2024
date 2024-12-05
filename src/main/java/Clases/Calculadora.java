package Clases;

import java.util.Stack;

public class Calculadora {
    private Stack<Integer> pilaResultado;
    private Stack<Integer> pilaRehacer;
    private int resultado;

    public Calculadora() {
        this.resultado = 0;
        this.pilaResultado = new Stack<>();
        this.pilaRehacer = new Stack<>();
    }

    
    public void Suma(int dato) {
        pilaResultado.push(resultado); 
        pilaResultado.push(resultado); 
        resultado += dato; 
        pilaRehacer.clear(); 
        System.out.println("El dato actual: " + resultado);
    }

    
    public void desHacer() {
        if (!pilaResultado.isEmpty()) {
            pilaRehacer.push(resultado); 
            resultado = pilaResultado.pop(); 
            System.out.println("Deshacer: " + resultado);
        } else {
            System.out.println("No hay más acciones para deshacer");
        }
    }

    
    public void reHacer() {
        if (!pilaRehacer.isEmpty()) {
            pilaResultado.push(resultado); 
            resultado = pilaRehacer.pop(); 
            System.out.println("Rehacer: " + resultado);
        } else {
            System.out.println("No hay más operaciones para rehacer");
        }
    }
}

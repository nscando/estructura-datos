package Colecciones;

import java.util.Stack;
public class PruebaStack {



   public static void main(String[] args) {
      Stack<String> pila1 = new Stack<String>();
      System.out.println("Insertamos 3 elementos en la pila: ");
      pila1.push("Nico");
      pila1.push("Angy");
      pila1.push("Paty");
      System.out.println("Cantidad de elementos de la pila: " + pila1.size());
      System.out.println("Consultar primero elemento de la pila sin extraerlo: "+ pila1.peek());
      System.out.println("Extraemos un elemento: "+ pila1.pop());
      System.out.println("Cantidad de elementos de la pila: " + pila1.size());
      System.out.println("Consultar primero elemento de la pila sin extraerlo: "+ pila1.peek());
      System.out.println("Extraer uno a uno los elementos de la pila");
      while (!pila1.isEmpty()){
         System.out.println("Extraemos a : "+pila1.pop());
      }

      Stack<Integer> pila2= new Stack<Integer>();
      pila2.push(20);
      pila2.push(60);
      pila2.push(120);
      pila2.push(150);
      System.out.println("Cantidad de elementos de la pila2: " + pila2.size());
      pila2.clear();
      System.out.println("Cantidad de elementos de la pila2: " + pila2.size());


   }
}

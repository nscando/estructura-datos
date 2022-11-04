package Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class PruebaQueue {
   public static void main(String[] args) {
      Queue<String> cola1 = new LinkedList<String>();

      System.out.println("insertamos elementos en la cola1: ");
      cola1.add("Nico");
      cola1.add("Angy");
      cola1.add("Paty");
      System.out.println();
      System.out.println("La cantidad de elementos  de la cola es: " + cola1.size());
      System.out.println("Consultar el primer elemento de la cola sin extraerlo: " + cola1.peek());

      System.out.println();
      System.out.println("Extraemos el primer elemento de la cola1: " + cola1.poll());
      System.out.println("La cantidad de elementos  de la cola es: " + cola1.size());
      System.out.println();
      System.out.println("Consultar el primer elemento de la cola sin extraerlo: " + cola1.peek());

      System.out.println();
      System.out.println("Extraer uno a uno los elementos de la cola:");
      while (!cola1.isEmpty()) {
         System.out.println("Extraemos: " + cola1.poll());
      }
      System.out.println("La cantidad de elementos  de la cola es: " + cola1.size());

      System.out.println();

      //no se pueden usar tipos de datos primitivos, hay que utilizar Clases de envoltura por ej Integer.
      Queue<Integer> cola2 = new LinkedList<Integer>();

      System.out.println("insertamos elementos en la cola2: ");
      cola2.add(10);
      cola2.add(5);
      cola2.add(20);

      System.out.println();
      System.out.println("La cantidad de elementos  de la cola es: " + cola2.size());
      System.out.println("Los elementos de la cola2 son: ");
      for (Integer elemento : cola2) {

         System.out.println(elemento);

      }
      System.out.println();
      System.out.println("Extraemos el primer elemento de la cola1: " + cola2.poll());
      System.out.println("La cantidad de elementos  de la cola es: " + cola2.size());
      System.out.println();
      System.out.println("Consultar el primer elemento de la cola sin extraerlo: " + cola2.peek());

      System.out.println();
      System.out.println("Extraer uno a uno los elementos de la cola:");
      while (!cola2.isEmpty()) {
         System.out.println("Extraemos: " + cola2.poll());
      }
      System.out.println("La cantidad de elementos  de la cola es: " + cola2.size());

      System.out.println();

      System.out.println("eliminar todos los elementos de la cola: .clear() ");
      cola2.clear();
      System.out.println("La cantidad de elementos  de la cola es: " + cola2.size());

   }
}

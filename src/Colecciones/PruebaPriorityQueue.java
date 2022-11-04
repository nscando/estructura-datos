package Colecciones;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {
   public static void main(String[] args) {
      PriorityQueue<Integer> cola = new PriorityQueue<Integer>();

      cola.add(70);
      cola.add(120);
      cola.add(6);

      System.out.println("Primero de la cola: " + cola.peek());
      System.out.println();
      System.out.println("Extraemos todos los elementos de la cola:");
      while (!cola.isEmpty()) {
         System.out.println("extraemos el elemento: " + cola.poll());
      }
      System.out.println();
      PriorityQueue<String> cola2 = new PriorityQueue<String>();

      cola2.add("Nicolas");
      cola2.add("Angeles");
      cola2.add("Patricia");
      cola2.add("Patroclo");

      System.out.println("Primero de la cola2: " + cola2.peek());
      System.out.println();

      System.out.println("Extraemos todos los elementos de la cola2:");
      while (!cola2.isEmpty()) {
         System.out.println("extraemos el elemento: " + cola2.poll());
      }
   }


}

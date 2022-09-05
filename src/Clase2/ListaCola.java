package Clase2;

public class ListaCola {

   class Nodo {
      int info;
      Nodo sig;
   }

   private Nodo raiz, fondo;

   public ListaCola() {
      raiz = null;
      fondo = null;
   }

   void insertar(int x) {
      Nodo nuevo = new Nodo();
      nuevo.info = x;

      if (raiz == null) {
         raiz = nuevo;
         fondo = nuevo;
      } else {
         fondo.sig = nuevo;
         fondo = nuevo;
      }
   }

   void imprimir() {
      Nodo recorrido = raiz;
      System.out.println("Lista de Nodos");

      while (recorrido != null) {
         System.out.println("- " + recorrido.info);

         recorrido = recorrido.sig;
      }
      System.out.println("Fin lista");
   }

   int extraer() {
      if (raiz == null) {
         return Integer.MAX_VALUE;
      } else {
         int data = raiz.info;
         if (raiz == fondo) {
            raiz = null;
            fondo = null;
         } else {
            raiz = raiz.sig;
         }
         return data;
      }
   }


   public static void main(String[] args) {
      ListaCola cola = new ListaCola();
      cola.insertar(10);
      cola.insertar(20);
      cola.insertar(30);
      cola.insertar(40);
      cola.insertar(99);
      cola.imprimir();
      System.out.println();
      System.out.println("Extraccion " + cola.extraer());
      System.out.println();
      cola.imprimir();
   }

}

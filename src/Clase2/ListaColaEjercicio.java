package Clase2;

public class ListaColaEjercicio {

   class Nodo {
      int info;
      Nodo siguiente;
   }

   private Nodo raiz;

   void insertar(int x) {
      Nodo auxiliar = raiz;
      Nodo nuevo = new Nodo();
      nuevo.info = x;

      if (auxiliar == null) {
         raiz = nuevo;
      } else {
         while (auxiliar.siguiente != null) {
            auxiliar = auxiliar.siguiente;
         }
         auxiliar.siguiente = nuevo;
      }

   }


   void imprimir() {
      Nodo recorrido = raiz;
      System.out.println("Lista de nodos: ");

      while (recorrido != null) {
         System.out.println("-" + recorrido.info);
         recorrido = recorrido.siguiente;
      }
   }

   int extraer(){
      Nodo aux = raiz;

      if (raiz == null){
         return Integer.MAX_VALUE;
      }else {
         int data = raiz.info;

         if(raiz == raiz.siguiente){
            raiz = null;

         }else {
            raiz = raiz.siguiente;
         }
         return data;

      }


   }

   public static void main(String[] args) {
      ListaColaEjercicio cola = new ListaColaEjercicio();
      cola.insertar(10);
      cola.insertar(20);
      cola.insertar(30);
      cola.insertar(40);
      cola.imprimir();
      System.out.println( "extraemos - " + cola.extraer());
      cola.imprimir();
   }
}

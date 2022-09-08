package Clase3;

public class ListasGenericas {

   class Nodo {
      int info;
      Nodo sig;
   }

   private Nodo raiz;

   public boolean vacia() {
      return raiz == null;
   }

   public int cantidad() {
      int contador = 0;
      Nodo recorrido = raiz;
      while (recorrido != null) {
         recorrido = recorrido.sig;
         contador++;
      }
      return contador;
   }

   public void insertar(int posicion, int valor) {
      if (posicion <= cantidad() + 1) {
         Nodo nuevo = new Nodo();
         nuevo.info = valor;

         //insertar al principio de la lista
         if (posicion == 1) {
            nuevo.sig = raiz;
            raiz = nuevo;
         } else {
            //insertar al final
            if (posicion == cantidad() + 1) {
               Nodo recorrido = raiz;

               while (recorrido.sig != null) {
                  recorrido = recorrido.sig;
               }
               recorrido.sig = nuevo;
            } else {
               //insertar en el medio
               Nodo recorrido = raiz;

               for (int i = 0; i <= posicion - 2; i++) {
                  recorrido = recorrido.sig;

               }
               Nodo auxiliar = recorrido.sig;
               recorrido.sig = nuevo;
               nuevo.sig = auxiliar;
            }
         }
      }
   }

   public int extraer(int posicion) {
      if (posicion > cantidad()) {
         System.out.println("Esa posicion no existe");
         return Integer.MAX_VALUE;
      } else {
         if (posicion == 1) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
         } else {
            Nodo recorrido = raiz;
            for (int i = 0; i <= posicion - 2; i++) {
               recorrido = recorrido.sig;
            }
            Nodo auxiliar = recorrido.sig;
            int informacion = auxiliar.info;
            recorrido.sig = auxiliar.sig;
            return informacion;
         }
      }
   }

   public void borrar(int posicion) {
      if (posicion > cantidad()) {
         return;
      } else {
         if (posicion == 1) {
            raiz = raiz.sig;
         } else {
            Nodo recorrido = raiz;
            for (int i = 1; i < posicion - 2; i++) {
               recorrido = recorrido.sig;
            }
            Nodo aux = recorrido.sig;
            recorrido.sig = aux.sig;
         }
      }
   }

   public void imprimir() {
      Nodo recorrido = raiz;
      System.out.println("Lista de nodos");

      while (recorrido != null) {
         System.out.println("-" + recorrido.info);

         recorrido = recorrido.sig;
      }
   }

   public void intercambiar(int posicion1, int posicion2) {
      if (posicion1 <= cantidad() && posicion2 <= cantidad()) {
         Nodo reco1 = raiz;
         for (int i = 1; i < posicion1; i++) {
            reco1 = reco1.sig;
         }
         Nodo reco2 = raiz;
         for (int i = 1; i < posicion2; i++) {
            reco2 = reco2.sig;
         }

         int aux = reco1.info;
         reco1.info = reco2.info;
         reco2.info = aux;

      }
   }

   public static void main(String[] args) {
      ListasGenericas lista = new ListasGenericas();
      if (lista.vacia()) {
         System.out.println("Lista vacia ");
      }
      System.out.println("la cantidad de nodos es: " + lista.cantidad());
      lista.insertar(1, 10);
      lista.insertar(2, 15);
      lista.insertar(3, 18);
      lista.insertar(4, 25);
      lista.imprimir();
      System.out.println();
      System.out.println(lista.cantidad());
      System.out.println();
      //System.out.println("El NODO extraido es " + lista.extraer(1));
      System.out.println();
      lista.imprimir();
      System.out.println("la cantidad de nodos es: " + lista.cantidad());
      System.out.println();
      System.out.println("lista despues de borrar :");
      //lista.borrar(2);
      lista.imprimir();
      System.out.println();
      System.out.println("la cantidad de nodos es: " + lista.cantidad());
      lista.intercambiar(1, 2);
      lista.imprimir();

   }
}

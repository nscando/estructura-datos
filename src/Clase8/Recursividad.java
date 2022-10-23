package Clase8;

public class Recursividad {


   class Nodo {
      int info;

      Nodo sig;

   }

   private Nodo raiz;

   public void insertarPrimero(int x) {
      Nodo nuevo = new Nodo();

      nuevo.info = x;
      nuevo.sig = raiz;
      raiz = nuevo;

   }

   public void imprimir() {
      Nodo reco = raiz;

      while (reco != null) {
         System.out.print(reco.info + " - ");
         reco = reco.sig;

      }
      System.out.println();
   }

   private void imprimirInversa(Nodo reco) {
      if (reco != null) {
         imprimirInversa(reco.sig);
         System.out.print(reco.info + " - ");
      }
   }

   public void imprimirInversa() {
      imprimirInversa(raiz);
      System.out.println();
   }




   public static void main(String[] args) {
      Recursividad r = new Recursividad();
      r.insertarPrimero(10);
      r.insertarPrimero(29);
      r.insertarPrimero(35);
      r.insertarPrimero(15);
      r.imprimir();
      r.imprimirInversa();

   }
}

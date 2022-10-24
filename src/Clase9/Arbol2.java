package Clase9;

public class Arbol2 {

   class Nodo {
      int info;
      Nodo izq, der;
   }

   private Nodo raiz;


   public boolean existe(int x) {
      Nodo reco = raiz;

      while (reco != null) {
         if (x == reco.info) {
            return true;
         } else {
            if (x > reco.info) {
               reco = reco.der;
            } else {
               reco = reco.izq;
            }
         }
      }
      return false;
   }

   public void insertar(int x) {
      if (!existe(x)) {

      }
   }


   public static void main(String[] args) {

   }
}

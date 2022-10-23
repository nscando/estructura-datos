package Clase9;

public class Arbol1 {

   class Nodo {
      int info;
      Nodo izq, der;

   }

   private Nodo raiz;

   void insertar(int x) {
      Nodo nuevo = new Nodo();
      nuevo.info = x;

      if (raiz == null) {
         raiz = nuevo;
      } else {
         Nodo anterior = null;
         Nodo reco = raiz;

         while (reco != null) {
            anterior = reco;
            if (x < reco.info) {
               reco = reco.izq;
            } else {
               reco = reco.der;
            }
         }
         if (x < anterior.info) {
            anterior.izq = nuevo;
         } else {
            anterior.der = nuevo;
         }
      }
   }

   //Visita la raiz
   //Recorre subarbol izq en pre-orden
   //Recorre subarbol der en pre-orden
   private void recorrerPreorden(Nodo reco) {
      if (reco != null) {
         System.out.print(reco.info + "-");
         recorrerPreorden(reco.izq);
         recorrerPreorden(reco.der);
      }
   }

   public void recorrerPreOrden() {
      recorrerPreorden(raiz);
      System.out.println();
   }


   //Recorre subarbol izq en entre-orden
   //Visita la raiz
   //Recorre subarbol der en entre-orden
   private void recorrerEntreOrden(Nodo reco) {
      if (reco != null) {
         recorrerEntreOrden(reco.izq);
         System.out.print(reco.info + "-");
         recorrerEntreOrden(reco.der);
      }
   }

   public void recorrerEntreOrden() {
      recorrerEntreOrden(raiz);
      System.out.println();
   }

   //Recorre subarbol izq en post-orden
   //Recorre subarbol der en post-orden
   //Visita la raiz
   private void recorrerPostOrden(Nodo reco) {
      if (reco != null) {
         recorrerPostOrden(reco.izq);
         recorrerPostOrden(reco.der);
         System.out.print(reco.info + "-");
      }
   }

   public void recorrerPostOrden() {
      recorrerPostOrden(raiz);
      System.out.println();
   }




   public static void main(String[] args) {
      Arbol1 ar = new Arbol1();
      ar.insertar(400);
      ar.insertar(100);
      ar.insertar(200);
      ar.insertar(50);
      ar.insertar(75);
      ar.insertar(700);

      ar.recorrerPreOrden();
      ar.recorrerEntreOrden();
      ar.recorrerPostOrden();
   }

}

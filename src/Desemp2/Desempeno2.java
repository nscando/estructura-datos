package Desemp2;

import Clase9.Arbol1;
import Clase9.Arbol2;

public class Desempeno2 {

   class Nodo {
      int info;
      Nodo izq, der;
   }

   private Nodo raiz;
   int cantidad;
   int altura;


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
         Nodo nuevo = new Nodo();
         nuevo.info = x;
         nuevo.izq = null;
         nuevo.der = null;

         if (raiz == null) {
            raiz = nuevo;
            System.out.println("El Nodo RAIZ es: " + raiz.info);
         } else {
            Nodo anterior = null, reco;
            reco = raiz;

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
               System.out.println(x + " por IZQUIERDA del NODO " + anterior.info);
            } else {
               anterior.der = nuevo;
               System.out.println(x + " por DERECHA del NODO " + anterior.info);
            }
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
      Desempeno2 arbol = new Desempeno2();
      arbol.insertar(10);
      arbol.insertar(7);
      arbol.insertar(9);
      arbol.insertar(20);
      arbol.insertar(15);
      System.out.println();
      arbol.recorrerEntreOrden();
      arbol.recorrerPreOrden();
      arbol.recorrerPostOrden();

   }

}

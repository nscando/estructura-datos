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
      } else {
         System.out.println("El valor "+ x + " que intentas insertar ya existe");
      }
   }


   public void menorValor() {
      if (raiz == null) {
         System.out.println("El Subarbol IZQUIERDO esta vacio");
      } else {

         Nodo reco = raiz;
         Nodo auxiliar = raiz;
         while (reco.izq != null) {
            reco = reco.izq;
            System.out.println("El MENOR valor del SUBARBOL IZQUIERDO es: " + reco.info);
            auxiliar = reco.der;
            System.out.println("El MAYOR valor del SUBARBOL IZQUIERO es: " + auxiliar.info);

         }
      }
   }

   private void retornarAltura(Nodo reco, int nivel) {
      if (reco != null) {
         retornarAltura(reco.izq, nivel + 1);
         if (nivel > altura) {
            altura = nivel;
         }
         retornarAltura(reco.der, nivel + 1);
      }
   }


   public int retornarAltura() {
      altura = 0;
      retornarAltura(raiz, 1);
      return altura;
   }

   public boolean existePrimerosTresNiveles(int info) {
      Nodo reco = raiz;

      while (reco != null && retornarAltura() == 3) {
         if (info == reco.info) {
            System.out.println("El valor " + info + " existe en los primeros 3 niveles!");
            return true;

         } else {
            if (info > reco.info) {
               reco = reco.der;
            } else {
               reco = reco.izq;
            }
         }
      }
      System.out.println("El valor " + info + " no existe en los 3 primeros niveles!");

      return false;
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




   public static void main(String[] args) {
      Desempeno2 arbol = new Desempeno2();
      System.out.println();
      arbol.insertar(10);
      arbol.insertar(7);
      arbol.insertar(9);
      arbol.insertar(20);
      arbol.insertar(15);
      arbol.insertar(15);

      System.out.println();

      arbol.menorValor();

      System.out.println();

      System.out.println("Altura del arbol: ");
      System.out.println(arbol.retornarAltura());
      System.out.println();

      System.out.println("Existe:");
      arbol.existePrimerosTresNiveles(15);
      System.out.println();

      System.out.println("Recorrido preorden:");
      arbol.recorrerPreOrden();


   }

}

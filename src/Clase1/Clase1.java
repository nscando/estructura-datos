package Clase1;

public class Clase1 {
   class Nodo {
      int info;
      Nodo sig;
   }

   private Nodo raiz;

   Clase1() {
      raiz = null;
   }

   public void insertar(int x) {
      Nodo nuevo = new Nodo();
      nuevo.info = x;
      if (raiz == null) {
         nuevo.sig = null;
         raiz = nuevo;
      } else {
         nuevo.sig = raiz;
         raiz = nuevo;
      }
   }


   public void inicializarEnCero(int valorInicial) {
      Nodo recorrido = raiz;
      Nodo aux = new Nodo();
      aux.info = recorrido.info;
      System.out.println("Listado de todos los nodos inicializados en cero");

      while (recorrido != null) {
         recorrido = recorrido.sig;

         Nodo temporal = new Nodo();

         temporal.info = valorInicial;

         aux.info = temporal.info;

         System.out.println(aux.info + " - ");
      }
      System.out.println("--");
   }


   public void imprimir() {
      Nodo flecha = raiz;
      System.out.println("Listado de todos los elementos de la pila");

      while (flecha != null) {
         System.out.println(flecha.info + "-");
         flecha = flecha.sig;
      }
      System.out.println("--");
   }

   public void cantidad() {
      Nodo reco = raiz;
      int contador = 0;

      while (reco != null) {
         reco = reco.sig;
         contador++;
      }
      if (contador != 0) {
         System.out.println("Esta Pila contiene: " + contador + " Nodos");
      } else if (contador == 0) {
         System.out.println("Esta pila esta vacia");
      }
   }


   public static void main(String[] args) {
      Clase1 pila1 = new Clase1();
      pila1.insertar(5);
      pila1.insertar(8);
      pila1.insertar(10);
      pila1.insertar(20);
      pila1.insertar(20);
      pila1.insertar(20);
      pila1.insertar(20);
      pila1.cantidad();
      pila1.imprimir();
      pila1.inicializarEnCero(0);
   }
}

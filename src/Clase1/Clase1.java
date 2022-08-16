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

   public void imprimir() {
      Nodo flecha = raiz;
      System.out.println("Listado de todos los elementos de la pila");

      while (flecha != null) {
         System.out.println(flecha.info + "-");
         flecha = flecha.sig;
      }
      System.out.println("--");
   }

   public static void main(String[] args) {
      Clase1 pila1 = new Clase1();
      pila1.insertar(10);
      pila1.insertar(90);
      pila1.insertar(60);
      pila1.insertar(15);
      pila1.imprimir();
   }
}

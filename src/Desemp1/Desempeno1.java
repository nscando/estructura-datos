package Desemp1;


public class Desempeno1 {

   class Nodo {
      int info;
      Nodo anterior, siguiente;
   }

   public Desempeno1() {
      raiz = null;
      fondo = null;
   }

   private Nodo raiz, fondo;

   public int cantidad() {
      int contador = 0;
      Nodo recorrido = raiz;
      while (recorrido != null) {
         recorrido = recorrido.siguiente;
         contador++;
      }
      System.out.println("la cantidad de nodos es  " + contador);
      return contador;
   }

   public boolean vacia() {
      return raiz == null;
   }

   public void insertar(int x1, int x2) {
      Nodo nuevo1 = new Nodo();
      nuevo1.info = x1;
      Nodo nuevo2 = new Nodo();
      nuevo2.info = x2;

      nuevo1.siguiente = nuevo2;
      nuevo2.anterior = nuevo1;

      if (raiz == null) {
         raiz = nuevo1;
         fondo = nuevo2;

      } else {
         if (cantidad() == 4) {
            fondo.siguiente = nuevo1;
            fondo = nuevo2;
         } else {
            raiz.anterior = nuevo1;
            nuevo2.siguiente = raiz;
            raiz = nuevo1;
         }
      }

   }

   public void sumaImpares() {
      Nodo recorrido = raiz;
      int contador = 0;
      int suma = 0;
      int valorNodo;
      while (recorrido != null) {
         contador++;
         valorNodo = recorrido.info;
         recorrido = recorrido.siguiente;

         if (contador % 2 != 0) {
            suma = suma + valorNodo;
            System.out.println("los valores de las posiciones impares son " + valorNodo);
         }
      }
      System.out.println("La suma de las posiciones impares es: " + suma);
   }

   public void borrarPrimeroUltimo() {
      if (raiz != null) {
         Nodo recorrido = raiz;

         raiz = raiz.siguiente;

         while (recorrido.siguiente != null) {
            recorrido = recorrido.siguiente;
         }
         recorrido = recorrido.anterior;
         recorrido.siguiente = null;
         if (raiz != null) {
            raiz.anterior = null;
         }
      }
      if (cantidad() == 1) {
         raiz = null;
         fondo = null;
      }


   }


   public void imprimir() {
      Nodo recorrido = raiz;
      System.out.println("Lista de nodos");

      while (recorrido != null) {
         System.out.println("-" + recorrido.info);
         recorrido = recorrido.siguiente;
      }
      System.out.println();
   }


   public static void main(String[] args) {
      Desempeno1 lista = new Desempeno1();

      lista.insertar(10, 20);
      lista.insertar(5, 8);
      lista.insertar(200, 4);
      lista.insertar(1, 2);

      lista.cantidad();

      lista.imprimir();
      lista.sumaImpares();
      lista.borrarPrimeroUltimo();
      lista.imprimir();
      lista.cantidad();
   }

}

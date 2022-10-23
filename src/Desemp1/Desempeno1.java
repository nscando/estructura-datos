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

   public void intercambiar() {
      Nodo recorrido1 = raiz;
      Nodo recorrido2 = raiz;
      int posicion1 = 0;


      while (recorrido1 != null) {
         posicion1++;

         recorrido1 = recorrido1.siguiente;
      }

      for (int i = 1; i < posicion1; i++) {
         recorrido2 = recorrido2.siguiente;
      }

      int aux = raiz.info;
      raiz.info = recorrido2.info;
      recorrido2.info = aux;

   }

   public void borrarDuplicado() {
      if (raiz != null) {
         Nodo recorrido = raiz;
         Nodo aux = null;
         Nodo temporal = null;
         int valorPimerNodo = 0;
         int contador = 0;

         if (raiz == null) {
            return;
         } else {
            while (recorrido != null) {

               if (contador == 0) {
                  valorPimerNodo = recorrido.info;
               }
               temporal = recorrido;
               aux = recorrido.siguiente;
               contador++;

               while (aux != null) {
                  if (recorrido.info == valorPimerNodo && recorrido.info == aux.info) {
                     temporal.siguiente = aux.siguiente;
                  } else {
                     temporal = aux;
                  }
                  aux = aux.siguiente;
               }
               recorrido = recorrido.siguiente;
            }
         }

      }
   }


   public void imprimir() {
      Nodo recorrido = raiz;

      while (recorrido != null) {
         System.out.print(recorrido.info + "-");
         recorrido = recorrido.siguiente;
      }
      System.out.println();
   }


   public static void main(String[] args) {
      Desempeno1 lista = new Desempeno1();
      if (lista.vacia()) {
         System.out.println("Lista de Nodos insertados:");
         lista.insertar(10, 20);
         lista.insertar(5, 8);
         lista.insertar(200, 4);
         lista.insertar(1, 2);
         lista.insertar(80, 99);
         lista.insertar(3, 99);
         lista.insertar(8, 27);
         lista.insertar(75, 99);
         lista.cantidad();
         lista.imprimir();
         System.out.println();
         System.out.println("Intercambio de posicion raiz-fondo: ");
         lista.intercambiar();
         lista.imprimir();
         System.out.println();
         System.out.println("Suma de impares:");
         lista.sumaImpares();
         System.out.println();
         System.out.println("Eliminar primero y ultimo de la lista: ");
         lista.borrarPrimeroUltimo();
         lista.imprimir();
         System.out.println();
         System.out.println("Eliminar duplicados: ");
         lista.borrarDuplicado();
         lista.imprimir();
      } else {
         System.out.println("La lista esta vacia, tenes que insertar nodos para poder probarla.");
      }

   }

}

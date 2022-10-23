package Clase8;

import java.io.File;
import java.lang.reflect.Field;

public class Recursividad2 {

   public void leer(String directorio) {
      File ar = new File(directorio);

      String[] dir = ar.list();

      for (int i = 0; i < dir.length; i++) {
         File ar2 = new File(directorio + dir[i]);
         if (ar2.isFile()) {
            System.out.println("Archivo:" + dir[i]);
         }
         if (ar2.isDirectory()) {
            System.out.println("Directorio:" + dir[i].toUpperCase());
            leer(directorio+dir[i]+"//");
         }
      }
   }


   public static void main(String[] args) {
      Recursividad2 r = new Recursividad2();
      r.leer("/Users/nicolasscandizzo/desktop/");
   }
}

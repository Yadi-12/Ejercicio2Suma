//Realiza la suma de los digitos de un numero,  se hace la suma las
// veces que sea necesaria hasta obtener una suma de un solo digito 
//Autor: García Vásquez Yadira Dalila
import java.util.Scanner;
public class EjercicioSuma
{   public static void main (String [] args){
    Scanner sc= new Scanner (System.in);// variable utilizada para leer desde el teclado
    System.out.println("Ingrese un numero");// impresion solicitando el numero
    int n=sc.nextInt(); //se guarda en la variable n  el numero ingresado
    int suma=0;// variable que guardara la suma
 
    do{// inicio del do-while
        suma=0;
        while(n!=0){// siempre que n sea diferente de 0 entrara en el while
         suma= suma +(n%10);//la suma sera igual a 0 mas dividir el numero dado ente 10
         n=n/10; // el numero dado cambiara de valor
        }
        n=suma;// el numero ingresado tomara el valor de la suma
        }while(suma>9);// se repite el ciclo mientras la suma sea mayor que nueve
     System.out.println("La suma es: "+suma); // se imprime el resultado de la suma   
   }  // cierre del metodo
  }  // cierre de la clase      
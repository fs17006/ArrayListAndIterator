
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {
  

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una lista que contenga los dias de la semana, que el 
        programa ejecute las siguientes funciones:
        *inserta en la posicion 4 el elemento "Juerneses"
        *copia esa lista en otra lista llamada listaDos
        *Muestra el contenido de las posiciones 3 y 4 de la lista original 
        *Elimina el elemento que contenga "juerneses" de la lista y compruba si 
        elimina algo o no
        *crea un iterador y muestra uno de los valores de la lista original 
        *busca si hay un elemento que se denomine "Lunes"
        *Busca si existe en la lista un elemento que se denomine "Lunes".
        No importa si esta en mayuculas y minusculas*/
    
    String diaBuscado;
    Scanner entrada;    
    ArrayList<Semana> semana= new ArrayList<Semana>();
    semana.add(new Semana(1,"Lunes"));
    semana.add(new Semana(2,"Martes"));
    semana.add(new Semana(3,"Miercoles"));
    semana.add(new Semana(4,"juerneses"));
    semana.add(new Semana(5,"Viernes"));
    semana.add(new Semana(6,"Sabado"));
    semana.add(new Semana(7,"Domingo"));
    ArrayList<String> listaDos=(ArrayList<String>)semana.clone();
    Iterator it=semana.iterator();
    System.out.println("Semana original:"+semana.toString());
    for(int i=0;i<7;i++){
        if(i>1&&i<4){
            System.out.println(semana.get(i));
        }
    }
    while(it.hasNext()){
        Semana s=(Semana) it.next();
        if(s.getDia()=="juerneses"){
            it.remove();
        }
    }
    System.out.println("Despues:"+semana.toString());
    System.out.println("ListaDos:"+listaDos.toString());
    System.out.println("Creacion de un iterador que solo muesta un dia de la lista.");
    Iterator to=semana.iterator();
    Random ran=new Random();
    int valorMin=0,valorMax=6;
    while(to.hasNext()){
         int x=0;
         x=ran.nextInt(valorMax)+valorMin;
         System.out.println("monstrando solo un dato de la lista:"+semana.get(x));
         break;
    }
    
            /*lee un string y lo busca en la lista independiente mente si esta en mayusculas o 
             minisculas si lo encuetra muestra el mensaje "Dia encontrado"*/
            Scanner sc=new Scanner(System.in);
            System.out.println("Escriba el dia a buscar en la lista:");
            diaBuscado=sc.nextLine();
            Iterator ot=semana.iterator();
            while(ot.hasNext()){
            Semana a=(Semana) ot.next();
            if(a.getDia().equalsIgnoreCase(diaBuscado)){
              System.out.println("Dia encontrado");
            }
           }
          
    }
}

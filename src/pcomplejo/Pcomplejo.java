
package pcomplejo;

import java.util.Scanner;


public class Pcomplejo {
    public static void main(String[] args) {
       
        double areal,aimg;
        int opc;
        
        Scanner sc = new Scanner(System.in);
        Complejo c1=new Complejo();
        Complejo c2=new Complejo();
        Complejo c3= new Complejo();
        Complejo c4= new Complejo();
        Complejo c5= new Complejo();
        
        
        do{
            System.out.println("1. Leer numeros");
            System.out.println("2. Suma Complejos A+B");
            System.out.println("3. Resta Complejos A-B");
            System.out.println("4. Multiplica Complejos A*B");
            System.out.println("5. Conjugado Complejo ");
            System.out.println("6. Modulo Complejo");
            System.out.println("7. Angulo  Complejo");
            System.out.println("8. Salir");
            System.out.println("Elija la opcion que desee:");
            opc=sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Introduzca su numero complejo A \t");
                    areal=sc.nextDouble();
                    c1.setReal(areal);
                    aimg=sc.nextDouble();
                    c1.setImg(aimg);
                    System.out.println("Introduzca su numero complejo B \t");
                    areal=sc.nextDouble();
                    c2.setReal(areal);
                    aimg=sc.nextDouble();
                    c2.setImg(aimg);
                break;
                case 2:
                    System.out.println("La suma es: ");
                    c3=c1.sumaComp(c2);
                    System.out.println(c3);
                break;
                case 3:
                    System.out.println("La resta es: ");
                    c4=c1.restaComp(c2);
                    System.out.println(c4);
                break;
                case 4:
                    System.out.println("La multiplicacion es: ");
                    c5=c1.multComp(c2);
                    System.out.println(c5);
                break;
                case 5:
                    System.out.println("El conjugado del Complejo A es: ");
                    c1.conjugadoComp();
                    System.out.println(c1);

                     System.out.println("El conjugado del Complejo B es: ");
                    c2.conjugadoComp();
                    System.out.println(c2);
                break;
                case 6:
                    System.out.println("El modulo del complejo A es: ");
                    System.out.println(c1.moduloComp());

                    System.out.println("El modulo del complejo B es: ");
                    System.out.println(c2.moduloComp());
                break;
                case 7:
                    System.out.println("El angulo del complejo A es: ");
                    System.out.println(c1.angComp()+"°");

                    System.out.println("El angulo del complejo B es: ");
                    System.out.println(c2.angComp()+"°");
                break;
            }
        }while(opc!=8);  
    }
    
}

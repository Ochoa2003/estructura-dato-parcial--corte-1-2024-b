import javax.swing.*;
import java.util.Scanner;

public class Parcial {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        String Error="Error en la entrada de datos";
        int Can =0;
        double Val=0;
        double Valt=0;
        double ValD=0;
        System.out.print("digite el nombre: ");
       String Nombre = scanner.next();

       System.out.print("nombre del producto: ");
       String NomP = scanner.next();

        System.out.print("valor del producto: ");
         Val = scanner.nextDouble();

        if (Val>0){

            System.out.print("cantidad a comprar: ");

            Can = scanner.nextInt();

            if(Can>0 && Can <10){
                Valt= Val*Can;
                System.out.print(Nombre+" su producto es: "+ NomP+ " $"+Val+"  valor total es : "+Valt);

            }else{
                if(Can>9 && Can <20){
                    Valt= Val*Can;
                    ValD= (Valt*0.05);
                    System.out.print(Nombre+" su producto es: "+ NomP+ " $"+Val+"  valor total es : "+Valt+"  valor descuento :  "+ValD);
                }
                else{
                    if(Can>19){

                        Valt= Val*Can;
                        ValD= (Valt*0.07);
                        System.out.print(Nombre+" su producto es: "+ NomP+ " $"+Val+"  valor total es : "+Valt+"  valor descuento :"+ValD);
                    }
                }

            }

        }else{
            System.out.print(Error);

        }


    }
}

package com.mycompany.fondue_savoyarde;

import java.util.Scanner;

public class Fondue_savoyarde {
    public static void main(String[] args) {
       Scanner teclado;
        int primerNumero, segundoNumero, tercerNumero, cuartoNumero;
 
        teclado = new Scanner(System.in);
        System.out.print( "Primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "Su suma es: " );       
        System.out.println( primerNumero+segundoNumero );
        
        teclado = new Scanner(System.in);
        System.out.print( "Primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "La resta es: " );
        System.out.println( primerNumero-segundoNumero );
        
        teclado = new Scanner(System.in);
        System.out.print( "Primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "La multiplicación es: " );
        System.out.println( primerNumero*segundoNumero );
        
        teclado = new Scanner(System.in);
        System.out.print( "Primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "Division es: " );
        System.out.println( primerNumero/segundoNumero );
                    
 teclado = new Scanner(System.in);
        System.out.print( "Primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Segundo número: " );
        segundoNumero = teclado.nextInt();
        System.out.print( "Tercer número: " );
        tercerNumero = teclado.nextInt();
        System.out.print( "Cuarto número: " );
        cuartoNumero = teclado.nextInt();
 
        System.out.print( "El promedio es: " );
        System.out.println( primerNumero/4+segundoNumero/4+tercerNumero/4+cuartoNumero/4);
    }
}

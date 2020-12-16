package QuadraticEquations;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        /**
         * Display an intro message :)
         */
        System.out.println("Quadratic equations -> ax^2+bx+c=0");
        /**
         * Get coefficients from the user :)
         */
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
        /**
         * Calculate the discriminant :)
         */
        double dc;
        dc = b*b - 4*a*c;

        double x1,x2; // root1,root
        double imag;  // imagine (tesevvuri) :D
        /**
         * modify output depending on sign of discriminant
         */
        if(dc > 0){
            x1 = (-b + Math.sqrt(dc))/(2*a);
            x2 = (-b - Math.sqrt(dc))/(2*a);
            System.out.println("Two real roots: " + x1 + " and " + x2);
        }else if  (dc == 0){
            x1 = -b/(2*a);
            System.out.println("One real root: " + x1);
        }
        else {
            System.out.println("Tenliyin koku yoxdur");
        }








    }
}

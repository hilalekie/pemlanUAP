package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Hilal Immawan Steven Ekie");
        System.out.println("245150707111060");
        System.out.println("=============================================");
        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius : ");
        double radiusBesar = sc.nextDouble();
        
        System.out.print("Isikan radius : ");
        double radiusKecil = sc.nextDouble();
        
        System.out.println("=============================================");
        
        Torus donatDenganLubang = new Torus(radiusBesar, radiusKecil);
        donatDenganLubang.printInfo();
        
        System.out.println("=============================================");
        
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan radius : ");
        double radiusBola = sc.nextDouble();
        
        System.out.println("=============================================");
        
        Sphere donatTanpaLubang = new Sphere(radiusBola);
        donatTanpaLubang.printInfo();
        
        System.out.println("=============================================");
        
        sc.close();
    }
}


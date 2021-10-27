/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2hue;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("zahlen.csv");
        nt.testFile();
        System.out.println("...................................................");
        
        double i = Math.sqrt(-1);
        
        CalculationOperation addRational = (a, b) -> {
            Number erg = new Number();
            erg.setA(a.getA() + b.getA());
            erg.setB(a.getB() + b.getB());
            return erg;
        };
        
        CalculationOperation subRational = (a, b) -> {
            Number erg = new Number();
            erg.setA(a.getA() - b.getA());
            erg.setB(a.getB() - b.getB());
            return erg;
        };
        
        CalculationOperation mulRational = (a, b) -> {
            Number erg = new Number();
            erg.setA(a.getA() * b.getA());
            erg.setB(a.getB() * b.getB());
            return erg;
        };
        
        CalculationOperation divRational = (a, b) -> {
            Number erg = new Number();
            erg.setA(a.getA() / b.getA());
            erg.setB(a.getB() / b.getB());
            return erg;
        };
        
        CalculationOperation addVector = (a, b) -> {
            Number n = new Number();
            n.setA(a.getA() + b.getA());
            n.setB(a.getB() + b.getB());
            return n;
        };
        
        CalculationOperation subVector = (a, b) -> {
            Number n = new Number();
            n.setA(a.getA() - b.getA());
            n.setB(a.getB() - b.getB());
            return n;
        };
        
        CalculationOperation mulVector = (a, b) -> {
            Number n = new Number();
            n.setA(a.getA() * b.getA());
            n.setB(a.getB() * b.getB());
            return n;
        };
        
        CalculationOperation divVector = (a, b) -> {
            Number n = new Number();
            n.setA(a.getA() / b.getA());
            n.setB(a.getB() / b.getB());
            return n;
        };

        //https://www.ingenieurkurse.de/hoehere-mathematik-analysis-lineare-algebra/komplexe-zahlen/grundrechenarten-der-komplexen-zahlen.html#:~:text=Zur%20Ermittlung%20der%20Summe%20zweier,Realteil%20und%20den%20Imaginärteil%20gemeinsam.
        CalculationOperation addComplex = (a, b) -> {
            Number n = new Number();
            n.setA((a.getA() + b.getA()) + (a.getB() + b.getB()) * i);
            n.setB((a.getA() + b.getA()) + (a.getB() + b.getB()) * i);
            return n;
        };
        
        CalculationOperation subComplex = (a, b) -> {
            Number n = new Number();
            n.setA((a.getA() - b.getA()) + (a.getB() - b.getB()) * i);
            n.setB((a.getA() - b.getA()) + (a.getB() - b.getB()) * i);
            return n;
        };
        
        CalculationOperation mulComplex = (a, b) -> {
            Number n = new Number();
            n.setA((a.getA() - b.getA()) + (a.getB() + b.getB()) * i);
            n.setB((a.getA() - b.getA()) + (a.getB() + b.getB()) * i);
            return n;
        };
        
        CalculationOperation divComplex = (a, b) -> {
            Number n = new Number();
            n.setA((a.getA() + i * a.getA()));
            n.setB((b.getA() + i * b.getB()));
            return n;
        };
        
        Scanner sc = new Scanner(System.in);
        
        Number n1 = new Number();
        Number n2 = new Number();
        
        int auswahlcalc = 0;
        int auswoperation = 0;
        
        System.out.println("Choose calculator:");
        System.out.println("1- Rational calculator");
        System.out.println("2- Vector calculator");
        System.out.println("3- Complex calculator");
        System.out.println("4- Exit Programm");
        
        auswahlcalc = Integer.parseInt(sc.nextLine());
        
        if (auswahlcalc == 4) {
            System.exit(0);
        }
        
        System.out.println("Enter number x a > 1");
        n1.setA(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter number x b > 1");
        n1.setB(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Enter number y a > 1");
        n2.setA(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter number y b > 1");
        n2.setB(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Choose Operation:");
        System.out.println("1- add");
        System.out.println("2- sub");
        System.out.println("3- mul");
        System.out.println("4- div");
        
        auswoperation = Integer.parseInt(sc.nextLine());
        
        if (auswahlcalc == 1) {
            RationalCalculator rCalc = new RationalCalculator(addRational, subRational, mulRational, divRational);
            if (auswoperation == 1) {
                System.out.println("L A:" + rCalc.add(n1, n2).getA());
                System.out.println("L B:" + rCalc.add(n1, n2).getB());
                
            } else if (auswoperation == 2) {
                System.out.println("L A:" + rCalc.substract(n1, n2).getA());
                System.out.println("L B:" + rCalc.substract(n1, n2).getB());
            } else if (auswoperation == 3) {
                System.out.println("L A:" + rCalc.multiply(n1, n2).getA());
                System.out.println("L B:" + rCalc.multiply(n1, n2).getB());
            } else if (auswoperation == 4) {
                System.out.println("L A:" + rCalc.divide(n1, n2).getA());
                System.out.println("L B:" + rCalc.divide(n1, n2).getB());
            } else {
                System.out.println("Machen sie gültige Eingabe");
            }
            //ausversehen falsche reihenfolge aber angepasst
        } else if (auswahlcalc == 3) {
            ComplexCalculator cCalc = new ComplexCalculator(addComplex, subComplex, mulComplex, divComplex);
            if (auswoperation == 1) {
                System.out.println("L A:" + cCalc.add(n1, n2).getA());
                System.out.println("L B:" + cCalc.add(n1, n2).getB());
                
            } else if (auswoperation == 2) {
                System.out.println("L A:" + cCalc.substract(n1, n2).getA());
                System.out.println("L B:" + cCalc.substract(n1, n2).getB());
            } else if (auswoperation == 3) {
                System.out.println("L A:" + cCalc.multiply(n1, n2).getA());
                System.out.println("L B:" + cCalc.multiply(n1, n2).getB());
            } else if (auswoperation == 4) {
                System.out.println("L A:" + cCalc.divide(n1, n2).getA());
                System.out.println("L B:" + cCalc.divide(n1, n2).getB());
            } else {
                System.out.println("Machen sie gültige Eingabe");
            }
        } else if (auswahlcalc == 2) {
            VectorCalculator vCalc = new VectorCalculator(addVector, subVector, mulVector, divVector);
            if (auswoperation == 1) {
                System.out.println("L A:" + vCalc.add(n1, n2).getA());
                System.out.println("L B:" + vCalc.add(n1, n2).getB());
                
            } else if (auswoperation == 2) {
                System.out.println("L A:" + vCalc.substract(n1, n2).getA());
                System.out.println("L B:" + vCalc.substract(n1, n2).getB());
            } else if (auswoperation == 3) {
                System.out.println("L A:" + vCalc.multiply(n1, n2).getA());
                System.out.println("L B:" + vCalc.multiply(n1, n2).getB());
            } else if (auswoperation == 4) {
                System.out.println("L A:" + vCalc.divide(n1, n2).getA());
                System.out.println("L B:" + vCalc.divide(n1, n2).getB());
            } else {
                System.out.println("Machen sie gültige Eingabe");
            }
        }        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felix
 */
public class NumberTester implements NumberTest {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    String filename;

    public NumberTester(String fileName) {
        this.filename = fileName;

    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {

        oddTester = (number) -> {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        primeTester = (number) -> {

            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;

        };

        palindromeTester = (number) -> {

            int palindrome = number;
            int reverse = 0;

            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }
            if (number == reverse) {
                return true;
            }
            return false;
        };

        try {
            Scanner sc = new Scanner(new File(filename));
            int testfälle = Integer.parseInt(sc.nextLine());
            System.out.println("Testfälle: " + testfälle);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] arr = line.split("\\s");

                int wassollgetestetwerden = Integer.parseInt(arr[0]);
                int zahlzumtesten = Integer.parseInt(arr[1]);

                switch (wassollgetestetwerden) {
                    case 1:
                        boolean b = oddTester.testNumber(zahlzumtesten);
                        if (b == true) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }
                        break;

                    case 2:
                        boolean b1 = primeTester.testNumber(zahlzumtesten);
                        if (b1 == true) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NON PRIME");
                        }
                        break;
                    case 3:
                        boolean b2 = palindromeTester.testNumber(zahlzumtesten);
                        if (b2 == true) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NON PALINDROME");
                        }
                        break;
                    default:
                        System.out.println("Vallah Krise");

                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }

    }

    @Override
    public boolean testNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

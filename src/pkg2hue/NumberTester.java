/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felix
 */
public class NumberTester implements NumberTest{
    
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    
    String filename;
    
    public NumberTester(String fileName)
    {
        this.filename = fileName;
  
    }
    
    public void setOddEvenTester(NumberTest oddTester)
    {
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester)
    {
     this.palindromeTester = palindromeTester;   
    }
    
    public void testFile()
    {
        try {
            Scanner sc = new Scanner(new File(filename));
            int testfälle = Integer.parseInt(sc.nextLine());
            System.out.println("Testfälle: " + testfälle);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    @Override
    public boolean testNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

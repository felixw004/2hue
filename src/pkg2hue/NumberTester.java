/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

/**
 *
 * @author felix
 */
public class NumberTester implements NumberTest{
    
    public NumberTester(String fileName)
    {
        
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
        
    }

    @Override
    public boolean testNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

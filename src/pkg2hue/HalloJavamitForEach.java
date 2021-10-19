/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author felix
 */
public class HalloJavamitForEach {
    
    List<String> eineListe = new ArrayList<String>();
    
    public HalloJavamitForEach(List<String> Pliste)
    {
        this.eineListe = Pliste;
    }
    
    public void listeausgeben()
    {
        for(String ausgabe : eineListe)
        {
            System.out.println(ausgabe);
        }
        
        eineListe.forEach((t) -> { System.out.println(t);});
    }
    
}

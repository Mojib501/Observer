
import Features.Feature1;
import Features.Feature2;
import observer.Buffer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masi
 */
public class ObserTestClass {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Feature1(buffer);
        new Feature2(buffer);
        
        System.out.println("Wer hört alles mit? ");
        buffer.printObserverName();
        
    }
    
}

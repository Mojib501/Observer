/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import observer.Buffer;
import observer.Observer;


/**
 *
 * @author masi
 */
public class Feature1 extends Observer {
    private Buffer buffer;
    public Feature1(Buffer buffer) {
        this.buffer = buffer;
        this.buffer.attach(this);
        
        
    }
    @Override
        public void update() {
            System.out.println("ich bin Feature 1");
    }
    
}

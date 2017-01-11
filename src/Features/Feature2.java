/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;
import observer.Observer;
import observer.Buffer;
/**
 *
 * @author masi
 */
public class Feature2 extends Observer {
    private Buffer buffer;
    public Feature2(Buffer buffer){
        this.buffer = buffer;
        this.buffer.attach(this);
    }
    @Override
        public void update(){
            System.out.println("ich bin Feature 2");
    }
    
}

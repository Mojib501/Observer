/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author masi
 */
public abstract class Observer {
    public Buffer buffer;
    public abstract void update();
  }

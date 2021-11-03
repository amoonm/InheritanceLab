/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritancelab;

/**
 *
 * @author amoonmainali
 */
public class Shape {
    
    private int brdrW;
    private String interColor;
    
    public Shape(){
        brdrW=10;
        interColor="BLUE";
    }
    
    public Shape(int b, String c) {
        brdrW = b;
        interColor = c;
        
    }
    
    public int getBrdrW()
    {
        return brdrW;
    }
    
    public void setBrdrW(int b){
        
        brdrW = b;
    }
           
    
}

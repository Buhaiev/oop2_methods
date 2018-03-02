/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2_graph.entity;

/**
 *
 * @author student
 */
public class Circle {
    public Point center;
    public int radius;
    
    public double getS(){
        return (Math.PI*radius);
    }
}

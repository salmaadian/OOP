/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Circle {
    public int r;
    public float Luas()
    {
        return (float) (Math.PI * r * r);
    }
    
    public float Keliling()
    {
        return (float) (2 * Math.PI * r);
    }
}

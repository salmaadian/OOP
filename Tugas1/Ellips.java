/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Ellips {
    public int a;
    public int b;
    
    public float Luas()
    {
        return (float) (0.5 * Math.PI * (2 * a * 2 * b));
    }
    
    public float Keliling()
    {
        return (float) (0.5 * Math.PI * (2 * a + 2 * b));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Rectangle {
    public int panjang;
    public int lebar;
    
    public int Luas()
    {
        return this.panjang* this.lebar;
    }
    
    public int Keliling()
    {
        return (this.panjang + this.lebar)*2;
    }
}

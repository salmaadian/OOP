/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class oope {
    public static void main(String[] args){
        
        //objek square
        Square square = new Square();
        square.sisi = 20;
        System.out.println("Luas persegi tersebut adalah "+square.Luas());
        System.out.println("Keliling persegi tersebut adalah "+square.Keliling());
        
        //objek rectangle
        Rectangle rectangle= new Rectangle();
        rectangle.panjang = 5;
        rectangle.lebar = 10;
        System.out.println("Luas persegi panjang tersebut adalah "+rectangle.Luas());
        System.out.println("Keliling persegi panjang tersebut adalah "+rectangle.Keliling());
                
        Circle circle = new Circle();
        circle.r = 7;
        System.out.println("Luas lingkaran tersebut adalah "+circle.Luas());
        System.out.println("Keliling lingkaran tersebut adalah "+circle.Keliling());
        
        
        Ellips ellips = new Ellips();
        ellips.a = 7;
        ellips.b = 14;
        System.out.println("Luas Ellips tersebut adalah "+ellips.Luas());
        System.out.println("Keliling Ellips tersebut adalah "+ellips.Keliling());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1java;

/**
 *
 * @author Cuong Pham
 */
public class bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       NhanVien NV1 = new NhanVien("Pham Van Cuong",21,"MY Giang",30000.0,150);
       NhanVien NV2 = new NhanVien("Do Van A",20,"MY Giang",40000.0,200);
       
       System.out.println("Nhan Vien thu 1 :");
       NV1.getThongTin();
       System.out.println("\nNhan Vien thu 2 :");
       NV2.getThongTin();
       
  
    }
}

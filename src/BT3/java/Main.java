/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.java;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    
    public static void main(String[] args) {
        SinhVienPoly SV1 = new SinhVienIT(6,7,8,"Pham Van Cuong","CNTT");
        System.out.println("SV Poly kế thừa IT ");
        SV1.Xuat();
        
        SinhVienPoly SV2 = new SinhVienBiz(7,7,"Pham Van chi","IT");
        System.out.println("SV kế thừa Biz ");
        SV2.Xuat();
    }
    
 
}

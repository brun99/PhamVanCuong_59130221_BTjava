/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2java;

import BT1java.NhanVien;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args){
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Pham Van E",21,"MY Giang1",350000.0,250);
        NhanVien NV2 = new NhanVien("Pham Van A",22,"MY Giang 2",340000.0,150);
        NhanVien NV3 = new NhanVien("Pham Van B",23,"MY Giang 3",330000.0,100);
        NhanVien NV4 = new NhanVien("Pham Van C",24,"MY Giang 4",320000.0,200);
        NhanVien NV5 = new NhanVien("Pham Van D",25,"MY Giang 5",310000.0,50);
        
        ds.Them(NV5);
        ds.Them(NV4);
        ds.Them(NV3);
        ds.Them(NV2);
        ds.Them(NV1);
        for(int i=0; i<5; i++){
            System.out.println("Nhan Vien Thu "+i);
            ds.NV[i].getThongTin();
        }
    }
}

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
public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien [100];
    int n = 0;
    
    @Override
    public void Them(NhanVien nv){
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;
    }

    @Override
    public void InDS() {
        for(int i=0; i<n; i++){
            System.out.println("Nhan Vien Thu "+ i);
        NV[i].getThongTin();
        }
    }
    
}

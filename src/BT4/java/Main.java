/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4.java;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) {
        
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        
        ChuyenXeNoiThanh CX1 = new ChuyenXeNoiThanh(30,100,"Phạm Văn Cường","CX01","59130221",200.0);
        ChuyenXeNgoaiThanh CXN1 = new ChuyenXeNgoaiThanh("NinhHoa",10,"Truong hoang khoa","CX02","59130221",300.0);
        ChuyenXeNoiThanh CX2 = new ChuyenXeNoiThanh(25,30.5,"Pham Tài","CX03","59130221",400.0);
        ChuyenXeNgoaiThanh CXN2 = new ChuyenXeNgoaiThanh("Phú Yên",24,"Lý Toàn","CX04","59130221",500.0);
        
        QLCX.themCX(CX1);
        QLCX.themCX(CXN1);
        QLCX.themCX(CX2);
        QLCX.themCX(CXN1);
        
        QLCX.inDS();
        
        
        System.out.println("tổng doanh thu ngoại thành " + QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("tổng doanh thu nội thành " + QLCX.tinhDoanhThuNoiThanh());
        
    }
    
}

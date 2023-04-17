package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class DSSV {
private ArrayList<SinhVienNhap> danhSach;
public DSSV() {
	this.danhSach=new ArrayList<SinhVienNhap>();
}
public void nhapDS(SinhVienNhap sv) {
	this.danhSach.add(sv);
}
public 	void nhapThongTinh(SinhVienNhap sv) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien: ");
        sv.setMaSV(sc.nextInt());
        ;
        sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        sv.setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        sv.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhap so dien thoai: ");
            sv.setsTD(sc.nextLine());
        } while(sv.getsTD().length()!=9);
    }	

public void inDS() {
	for (SinhVienNhap sinhviennhap: danhSach) {
		System.out.println(sinhviennhap);
	}
}
public void sapxep() {
	Collections.sort(this.danhSach, new Comparator<SinhVienNhap>() {
	@Override
	public int compare(SinhVienNhap sv1,SinhVienNhap sv2) {
		if(sv1.getMaSV()>sv2.getMaSV()) {
			return -1;
		}else {
			return 0;
		}
	}
	});
}
}

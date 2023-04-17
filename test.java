package main;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DSSV dssv=new DSSV();
		SinhVienNhap sv[]=null;
		int luaChon=0;
		int i,n;
		do {
			System.out.println("------Menu-----");
		    System.out.println("Chon chuc nang");
		    System.out.println(
		       "1.Nhap thong tin sinh vien.\n"
		      +"2.Xuat ra danh sach tang dan theo ma sinh vien.\n"
		      +"0.Thoat chuong trinh" );
		     luaChon=sc.nextInt();
		     sc.nextLine();
		     if(luaChon==1) {
		    	 System.out.println("Nhap so sinh vien can khai bao: ");
                 n = sc.nextInt();
                 sv=new SinhVienNhap[n];
                 for( i =0;i<n;i++) {
                	System.out.println("Sinh vien thu "+(i+1)+":");
                	sv[i]=new SinhVienNhap();
                	dssv.nhapThongTinh(sv[i]);
                 }
               }else if(luaChon==2) 
            	dssv.sapxep();
		        dssv.inDS();
		 
	} while (luaChon!=0);	
	}
	}
   


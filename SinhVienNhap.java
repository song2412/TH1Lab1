package main;

import java.util.Objects;

public class SinhVienNhap implements Comparable<SinhVienNhap>  {
private int maSV;
private String hoTen;
private String diaChi;
private String sTD;

public SinhVienNhap(int maSV, String hoTen, String diaChi, String sTD) {
	super();
	this.maSV = maSV;
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.sTD = sTD;
}
public SinhVienNhap() {
	
}
public int getMaSV() {
	return maSV;
}
public void setMaSV(int maSV) {
	this.maSV = maSV;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getsTD() {
	return sTD;
}
public void setsTD(String sTD) {
	this.sTD = sTD;
}
@Override
public String toString() {
	return "SinhVienNhap [maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sTD=" + sTD + "]";
}
public int compareTo(SinhVienNhap sv) {
	return maSV;
	
}
@Override
public int hashCode() {
	return Objects.hash(hoTen,diaChi,sTD);
}
}






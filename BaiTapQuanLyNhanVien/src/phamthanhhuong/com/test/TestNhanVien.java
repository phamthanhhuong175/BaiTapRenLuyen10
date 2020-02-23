package phamthanhhuong.com.test;

import java.util.Scanner;

import phamthanhhuong.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1,nv2;
		System.out.println("Mời nhập thông tin của NV1: ");
		System.out.println("Nhập họ: ");
		String ho1=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên: ");
		String ten1=new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm: ");
		int soSP1=new Scanner(System.in).nextInt();
		nv1=new NhanVien(ho1, ten1, soSP1);
		System.out.println("Mời nhập thông tin của NV2: ");
		System.out.println("Nhập họ: ");
		String ho2=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên: ");
		String ten2=new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm: ");
		int soSP2=new Scanner(System.in).nextInt();
		nv2=new NhanVien(ho2, ten2, soSP2);
		System.out.println("Lương của NV1 = "+nv1.getLuong());
		System.out.println("Lương của NV2 = "+nv2.getLuong());
		//Cách 1:
		if(nv1.lonHon(nv2))
			System.out.println("Nhân viên "+nv1.getHo()+" "+nv1.getTen()+
					" nhiều hơn nhân viên "+nv2.getHo()+" "+nv2.getTen()+" "+
					(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println("Nhân viên "+nv2.getHo()+" "+nv2.getTen()+
					" nhiều hơn nhân viên "+nv1.getHo()+" "+nv1.getTen()+" "+
					(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		//Cách 2:
		if(nv1.getSoSP()>nv2.getSoSP())
			System.out.println("Nhân viên "+nv1.getHo()+" "+nv1.getTen()+
					" nhiều hơn nhân viên "+nv2.getHo()+" "+nv2.getTen()+" "+
					(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println("Nhân viên "+nv2.getHo()+" "+nv2.getTen()+
					" nhiều hơn nhân viên "+nv1.getHo()+" "+nv1.getTen()+" "+
					(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
			
		
		
	}

}

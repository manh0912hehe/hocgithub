package tuan3LT;

public class  Ungdung implements PhepTinh {
	public static void main(String[] args ) {
		Ungdung u1=new Ungdung();
		System.out.println(u1.tinhToan());
		System.out.println(u1.xuatChuoi());
		System.out.println(u1.tinhToan(3, 4 ));
	}
	public double tinhToan() {
		int a=10;int b=5;
		return a+b;
	}
	public String xuatChuoi() {
		String s="Truong dai hoc cong nghiep";
		return s;
	}
	public double tinhToan(double a,double b) {
		return a*a+b*b;
	}
}

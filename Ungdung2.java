package tuan3LT;

public class Ungdung2 implements PhepTinh{
	public static void main(String[] args) {
		Ungdung2 u2=new Ungdung2();
		System.out.println(u2.tinhToan());
		System.out.println(u2.xuatChuoi());
	}
	public double tinhToan() {
		double a=100;
		double b=200;
		return a*b;
	}
	@Override
	public String xuatChuoi() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double tinhToan(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

}

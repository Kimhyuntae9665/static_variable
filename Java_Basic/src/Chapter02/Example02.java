package Chapter02;
import SmartPhone.*;


class Triangle{
	double base,height,diagonal;
	
	
	void createandPrint() {
		base=3;
		height = 4;
		diagonal = 5;
		
		System.out.println("=============================");
		System.out.println("base : "+base);
		System.out.println("heigth : "+height);
		System.out.println("diagonal : "+diagonal);
		System.out.println("=============================");
	}
	
}


class Pythagoras{
//	static 변수 
	static String creator = "Pythagoras";
//	밑변 
//	instance 변수 
//	instance 가 생성될때  같이 생성된다 
	double base;
//	높이
	double heigth;
//	대각선 
	double diagonal;
//	 대각선의 길이를 구하는 공식 
//	static 함수는 instance 생성과 관계없이(instance 생성 이전 부터) instance 생성 이전부터 존재하는 함수 
	static double getDiagonal(double base,double heigth) {
		return Math.sqrt(Math.pow(base,2)+Math.pow(heigth, 2));
	}
//	밑변의 길이를 구하는 공식
	double getBase() {
		return Math.sqrt(Math.pow(diagonal,2)+Math.pow(heigth, 2));
	}
//	높이의 길이를 구하는 공식 
	double getHeight() {
		return Math.sqrt(Math.pow(diagonal,2)+Math.pow(base, 2));
	}
}

public class Example02 {

	public static void main(String[] args) {
		
		
		
		SmartPhone[] phones =new SmartPhone[3];
		
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i]);
			phones[i] = new SmartPhone();
		}
		System.out.println("==================");
		System.out.println(phones);
		System.out.println("==================");
		
		for(SmartPhone phone:phones) {
			System.out.println(phone);
			phone.mynation = "United State";
			phone.myos = "iOS";
			phone.myowner = "John";
			phone.mytelNumber = "010-1111-1111";
			
		}
		
		System.out.println("====================");
		
		for(SmartPhone phone:phones) {
			System.out.println(phone.mynation);
			System.out.println(phone.myos);
			System.out.println(phone.myowner);
			System.out.println(phone.mytelNumber);
			System.out.println("=====================");
		}
		
		int a = 10;
		int b = 20;
		int c = 30;
//		Math.pow(): 정수의 거듭제곱 
//		대각선의 길이
		double r1 = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
//		밑변의 길이 
		double r2 = Math.sqrt(Math.pow(c,2)+Math.pow(b, 2));
//		높이의 길이 
		double r3 = Math.sqrt(Math.pow(c,2)+Math.pow(a, 2));
		
		Pythagoras p1 = new Pythagoras();
		p1.base = 10;
		p1.heigth = 20;
		p1.diagonal = 30;
		
		double diagonal = p1.getDiagonal(3,5);
		System.out.println(p1.creator);
		p1.creator = "NewTon"; // instance 별로 메모리 공간을 다르게 쓰므로 p1과 p2는 개별적인 결과 출력 
		System.out.println(p1.creator);
		
		Pythagoras p2 = new Pythagoras();
		System.out.println(p2.creator);
//		static 으로 선언한 변수는 변수공간을 각각의 instance가 공유하기 때문에 p1.creator를 바꾸면 p2.creator 까지도 바뀐다
		
		System.out.println(Pythagoras.creator);
//		static 변수는 instance 없이도 class 자체에서 변수 가져오기
		
		System.out.println(Pythagoras.getDiagonal(3, 4));
		
//		삼각형 instance 만들기
		Triangle triangle = new Triangle();
		
		triangle.base = 3;
		triangle.height = 4;
		triangle.diagonal = 5;
		
		System.out.println("base : " + triangle.base);
		System.out.println("height : "+triangle.height);
		System.out.println("diagonal : "+triangle.diagonal);
		
		Triangle triangle2 = new Triangle();
		Triangle triangle3 = new Triangle();
		Triangle triangle4 = new Triangle();
		Triangle triangle5 = new Triangle();
		
		triangle2.createandPrint();
		triangle3.createandPrint();
		triangle4.createandPrint();
		triangle5.createandPrint();
		

	}

}

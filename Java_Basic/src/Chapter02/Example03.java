package Chapter02;

class MyMath{ //일반적으로 class 이름 첫 글자는 대문자로 
//	정삼각형의 넓이를 구해주는 함수 
	static double getEquilateralTriangleArea(double side){
//		매개변수 검증을 먼저 해준다 
		if(side<=0) {
			return 0; //프로그램 종료 
		}
			
			
		double result = (Math.sqrt(3)/4) * Math.pow(side, 2);
		
		return result; //return 값으로 일반적으로 변수가 온다
	}
	
//	정삼각형의 높이를 구하는 메서드 
	static double getEquilateralTriangleHeight(double side) {
		if(side<=0) {
			return 0;
		}
		double equilateralTriangleHeigth = (Math.sqrt(3)/2)*side;
		return equilateralTriangleHeigth;
	}
	
//	1증가 시키는 함수
	static int increase(int number) {
		number++;
		System.out.println("In of Method");
		System.out.println(number);
		return number;
	}
	
	static void increaseTriangle(Triangle triangle) {
		triangle.base++;
		triangle.height++;
		triangle.diagonal++;
	}
}

public class Example03 {

	public static void main(String[] args) {
		double side = 10.0;
		double equilateralTriangleArea = MyMath.getEquilateralTriangleArea(side);
//		static 함수는 객체 생성없이 class.함수명 으로 호출한다
		System.out.println(equilateralTriangleArea);
		
		double equilateralTriangleHeigth = MyMath.getEquilateralTriangleHeight(-10);
		System.out.println(equilateralTriangleHeigth);
		
		int number =10;
		int afterNumber = MyMath.increase(number);
		System.out.println("Out of Method");
		System.out.println(number);
		
		Triangle triangle = new Triangle(); //이 파일에 triangle class 없지만 같은 package에 있어서 선언 가능 ㄴ
//		참조변수에는 instance 의 주소가 저장된다 
		triangle.createandPrint();
		System.out.println(triangle);
		
		MyMath.increaseTriangle(triangle); //static 함수 
		System.out.println(triangle.base);
		System.out.println(triangle);
		

	}

}

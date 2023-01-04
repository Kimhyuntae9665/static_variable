package Chapter02;

class MyMath{ //�Ϲ������� class �̸� ù ���ڴ� �빮�ڷ� 
//	���ﰢ���� ���̸� �����ִ� �Լ� 
	static double getEquilateralTriangleArea(double side){
//		�Ű����� ������ ���� ���ش� 
		if(side<=0) {
			return 0; //���α׷� ���� 
		}
			
			
		double result = (Math.sqrt(3)/4) * Math.pow(side, 2);
		
		return result; //return ������ �Ϲ������� ������ �´�
	}
	
//	���ﰢ���� ���̸� ���ϴ� �޼��� 
	static double getEquilateralTriangleHeight(double side) {
		if(side<=0) {
			return 0;
		}
		double equilateralTriangleHeigth = (Math.sqrt(3)/2)*side;
		return equilateralTriangleHeigth;
	}
	
//	1���� ��Ű�� �Լ�
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
//		static �Լ��� ��ü �������� class.�Լ��� ���� ȣ���Ѵ�
		System.out.println(equilateralTriangleArea);
		
		double equilateralTriangleHeigth = MyMath.getEquilateralTriangleHeight(-10);
		System.out.println(equilateralTriangleHeigth);
		
		int number =10;
		int afterNumber = MyMath.increase(number);
		System.out.println("Out of Method");
		System.out.println(number);
		
		Triangle triangle = new Triangle(); //�� ���Ͽ� triangle class ������ ���� package�� �־ ���� ���� ��
//		������������ instance �� �ּҰ� ����ȴ� 
		triangle.createandPrint();
		System.out.println(triangle);
		
		MyMath.increaseTriangle(triangle); //static �Լ� 
		System.out.println(triangle.base);
		System.out.println(triangle);
		

	}

}

package Chapter02;

class Manufacturer{
//	������ ��
	String name;
//	���� ���� 
	String country;
//	������ Ȩ������ �ּ�
	String webURL;
	
	void print() { //����Լ� �ظ��ϸ� ������� �ʴ´� 
		System.out.println("name : "+name+" / country : "+country+" / webURL : "+webURL);
		
		}
	
}

class Car extends Manufacturer{ 
//	������
	String manufactorString;

//	�����÷�
	String exteriorColor;
	
//	�����÷�
	String interiorColor;
	
//	�𵨸�
	String modelName;
	
	Manufacturer createManufacturer(String name , String country , String webURL) {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.name = name;
		manufacturer.country = country;
		manufacturer.webURL = webURL;
		
		System.out.println(manufacturer); //instance �ּ� ���� 
		
		return manufacturer;
	}
}

public class Example04 {

	public static void main(String[] args) {
		Car myCar = new Car();
		Manufacturer manufacturer = myCar.createManufacturer("Hyundai", "Korea", "hyundai.com");
		System.out.println("===================");
		System.out.println(manufacturer);
		System.out.println(manufacturer.name);
		System.out.println("===================");
		manufacturer.print();
		

	}

}

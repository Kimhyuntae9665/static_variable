package Chapter02;

class Manufacturer{
//	제조사 명
	String name;
//	제조 국가 
	String country;
//	제조사 홈페이지 주소
	String webURL;
	
	void print() { //재귀함수 왠만하면 사용하지 않는다 
		System.out.println("name : "+name+" / country : "+country+" / webURL : "+webURL);
		
		}
	
}

class Car extends Manufacturer{ 
//	제조사
	String manufactorString;

//	외장컬러
	String exteriorColor;
	
//	내장컬러
	String interiorColor;
	
//	모델명
	String modelName;
	
	Manufacturer createManufacturer(String name , String country , String webURL) {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.name = name;
		manufacturer.country = country;
		manufacturer.webURL = webURL;
		
		System.out.println(manufacturer); //instance 주소 찍어보기 
		
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

package Chapter02;


//������ & �����ε� 
//�����ε� : ���� �̸��� �޼��带 �Ű�������  ���¸� �ٸ��� �Ͽ� ���� ���� ���� �� �� �ֵ��� �� 

class Juice{
	
	String name;
	String company;
	int kcal;
	int volume;
	
	
public Juice() {
		
	}
	
	public Juice(String name,String company,int kcal,int volume) {
		this();
		this.name = name;
		this.company = company;
		this.kcal = kcal;
		this.volume = volume;
	}
	
	
	
	void drink(int ml) {
		System.out.println("int drink!");
		volume -= ml;
	}
//�̸� ���� �Ű������� �ٸ� �� �Լ� 
//	�����ε�
	void drink(float ml) {
		System.out.println("double drink!");
		volume-=ml;
	}
	
	void drink(int ml1,int ml2) {
		System.out.println("int int  drink!");
		volume-=(ml1+ml2);
	}
	
}

public class Example05 {

	public static void main(String[] args) {
		Juice juice = new Juice();
		juice.name ="����ȫ��";
		juice.company = "����";
		juice.kcal = 0;
		juice.volume = 500;
		
		juice.drink(100);
		juice.drink(50.5F);  //float ���´� �ڿ� F �ٿ��� �Ѵ�.
		juice.drink(10,20);
		
		Juice juice2 = new Juice("�� ����  ������","�Ե�",0,800);
		System.out.println(juice2.name);
		System.out.println(juice2.company);
		System.out.println(juice2.kcal);
		System.out.println(juice2.volume);
		
		
		

	}

}

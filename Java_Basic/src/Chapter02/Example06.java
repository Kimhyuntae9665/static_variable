package Chapter02;


import chapter002.entity.*;





public class Example06 {

	public static void main(String[] args) {
		Developer d1 = new Developer("John",null,null); //�θ� ���������� �ڽ� ��ü�� ǰ�°��� ���������� 
//		������ ������ �����Ͱ� ������ ���¿����� null
		String str = null;
		BusDriver b1 = new BusDriver();
		
//		d1 = null; //�������� d1�� �޸� �ּ� ��ſ� null�� ���� da.languageskill �� assign �Ұ� �ϴٴ�  
		
		d1.LanguageSkill=  " java" ;//�θ� ���������� �ڽ� instance ���� �� �ҷ����� ���� �Ұ��� 
		System.out.println(d1.name);
//		Developer d1 = new People(); //�ڽ� ���������� �θ� ��ü�� ǰ�� �Ŵ� �Ұ��� 
		d1.eatBreakfast();
		b1.eatBreakfast(); //�ڽ� instance �� �θ��� �Լ��� ���� ���� �翬 

	}

}

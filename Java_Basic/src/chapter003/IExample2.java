package chapter003;




//�������̽� 
//�߻󵵰� ���� ū ���赵 
//�Ϲ� �޼���, �Ϲ� ������ ��� �Ұ���
//static final �� ����� �����  / abstact�� ����� �߻� �޼��常 ���� �� �ִ� 
public interface IExample2 {
	
	
//	�������̽��� static final �� ����� ����� ���� ���� 
	public static final int num=0;
	
	
	
//	�������̽����� �߻�޼��常 ���� ���� 
//	�Լ����� public abstract ���� 
	void hello();
	
//	�������̽��� �������̽��κ��͸� ��Ӱ��� 
	
	
	

}

interface IExample03{
	public static final String Strong = "String ";
}


//  �������̽��� ��� 
//  �������̽��� �������̽��κ��͸� ��� ���� 
//  �������̽� ���� ����� extends Ű���带 ��� 
//  �������̽��� ���� ����� ���� 
interface IExample02 extends IExample2,IExample03{
	
	public static final double decimal = 10.5;
	
}


//  �������̽� ���� 
//  �������̽��� Ŭ������ ������ ���� implements Ű���带 ��� 
class Example implements IExample02{
	
	
//	�������̽��� �ۼ��� �߻� �޼���� �ݵ�� 
//	��� ���� �ؾ� �� 
	public void hello() {
		System.out.println("hello");
	}
	
}


class Example2 implements IExample02{

	@Override
	public void hello() {
		System.out.println("OK");
	}
	
	
	/*public void hello() {
		System.out.println();
	}*/
}



class Example3{
	public static void main(String[] args) {
		IExample02 exem1 = new Example();
		IExample02 exem2 = new Example2();
		
		
		
	}
}
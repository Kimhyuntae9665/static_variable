package chapter003;



// ������ 
// 
abstract class Example02 {
	
//	���� ������ ����ϴ� ����
//	 ĸ��ȭ 
//	 1. �ܺη� ���� �����͸� ��ȣ�ϱ� ���� �뵵 
//	 2. �ܺο��� ���ʿ���, ���������� ���Ǵ� �κ��� ���߱� ���� 
//	 ���� �ܺ� ����ڿ��� ���� ������ �������� �ʴ´� 
	
	
//	public ���������� 
//  ������Ʈ ��𼭵� ������ �����ϵ��� �� 
	public int number1;
	
//	protected ���������� 
//	���� ��Ű�� ���� �ְų� �ش� Ŭ������ ��ӹ��� sub Ŭ���������� ������ ����
//	�ܺ� ��Ű���� �־ ��� ������ ��� ���� 
	protected int number2;

	
//  default(package) ���� ������
//	���� �Ϲ����� ���ݱ��� ��� ���� ������ 
//	���� ��Ű�� �������� ������ ���� 
	int number3;
	
	
//  private ���� ������ 	
//  ���� class �������� ������ ����
	
	private int number4;
	
	
//	static, final
//	 static ������ : �ش� �ɹ������� �޼��带 Ŭ���� ������ �����ϱ� ���� �뵵 
//	 final �����ڴ� : �ʱ�ȭ ���� ���� ������Ű�� �ʰ��� �� �� ��� 
	static final int NUMBER_5 = 10;
	
	
//  abstract ������ 
//	�޼��带 ����θ� �ۼ��ϰ� ���� �����δ� ��ӹ޴� Ŭ������ �����ϰ��� �� �� 
//	Ŭ���� , �޼��忡���� ��밡�� instance ���������� ������� �ʴ´� 
//	abstract �Լ��� abstract Ŭ���� �ȿ����� ��밡���ϴ� 
	
//	���� abstract �����ڰ� ���� method�� �ִٸ� 
//	�ݵ�� class�� abstract �����ڰ� ���� �ؾ� �� 
	abstract void abstractMethod();
	
//	�����ڸ� �����Ҷ� ������ ���� 
//	 �ż��忡 static �� abstract�� ���ÿ� ����� �� ����
//	Ŭ������ final �� abstract �� ���ÿ� ����� �� ����
//	abstract �޼����� ���������ڴ� private�� �� ���� 
	
	public static void main(String[] args) {
		
		
//		Modifier Ŭ������ ��� public���� ���� �Ǿ��� ������ 
//		��� ��ġ���� ��� ���� 
		Modifier modifier = new Modifier("Hani","vietnam","tee9665");
		
//		The field Modifier.name is not visible
//		modifier Ŭ������ �ɹ� �������� private�� ���� �߱� ������ 
//		Ŭ���� �ܺο��� ������ �Ұ��� 
		
		modifier.setName("minji");
		System.out.println(modifier.getName());
		
		modifier.getAddress();

		modifier.print_name();

	}

}

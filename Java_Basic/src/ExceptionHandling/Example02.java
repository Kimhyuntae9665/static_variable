package ExceptionHandling;

public class Example02 {

	public static void main(String[] args) {
		String comment = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";
		
		System.out.println(comment);
		
//		���ڿ� �����ϴ� String API method ��� 
		comment = comment.concat(comment);
		System.out.println(comment);
		
//		���ڿ��� �߶󳻴� String API method 
		String substr  = comment.substring(6, 11);
		System.out.println(substr);
		
//		�ֹε�Ϲ�ȣ���� ���� - ���� - ���� - ����
		String identityNumber = "930602-111111";
		String year = identityNumber.substring(0, 2);
		String month = identityNumber.substring(2, 4);
		String day = identityNumber.substring(4, 6);
		String gender = identityNumber.substring(7, 8);
		
		System.out.println("year : "+ year+ "/ month : "+month +"/ day : "+ day +"/ gender : "+gender);
		
//		���ڿ��� ���̸� �������� String API method 
		int strLength = comment.trim().length();   //�迭.length �� �迭�� ���� 
		System.out.println("strLength : "+ strLength);
		
//		���ڿ��� ��� �빮�ڷ� ��������ִ� String API method
		comment = comment.toUpperCase();
		System.out.println(comment);
		
		comment = comment.toLowerCase();
		System.out.println(comment);
		
//		�Է� �޴� ���� ���ڿ��� �������� �� 
//		Category : TOP,Bottom -> TOP 
		
//		�ش��ϴ� �ε����ڸ��� ��ġ�� ���ڸ� ���ϴ� String API method
		char character = comment.charAt(2);
		System.out.println(character);
		
//		�ش��ϴ� ���ڿ��� ���° �ε����� �����ϴ��� ���ϴ� String API method `
//		ù������ �˻��Ǵ� �ε��� ��ġ�� ��ȯ 
		int stringIndex = comment.indexOf("dolor");
		System.out.println(stringIndex);
		
//		�ش��ϴ� ���ڿ��� ���� ���ڿ��� ���ؼ� ����� ����ϴ� String API method
		boolean flag = comment.equals(comment);
		System.out.println(flag);
		
//		���ڿ��� �յ� ������ �����ϴ� Strning API method 
		String blankStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";
		blankStr = blankStr.replaceAll(" ", "");
		System.out.println(blankStr);
		
//		Ư���� ���ڸ� �ٸ� ���ڷ� �ٲٴ� String API method 
//		replace 
		/*comment = comment.replaceAll("lorem", "merol");
		System.out.println(comment);
		
		comment = comment.replaceAll("lorem", "merol");
		System.out.println(comment);*/
	}

}

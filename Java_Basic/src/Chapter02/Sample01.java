package Chapter02;

import java.util.Scanner;

// ���ù� �ۼ� 
//���ù� ���
//�Խù� �� ����
//�Խù� ���� 

class Board{
//	����
	String title;
//	�ۼ��� 
	String writer;
//	�ۼ� ��¥ �ð�  
	String writeDate;
//	���� 
	String contents;
//	���ƿ�
	int like;
	
	void contractionPrint() { // 2ȸ�̻� ����ϴ� print���� �Լ��� ����� ���� 
		System.out.println("�Խù� ������ : "+ this.writer+" / �Խù� ���� "+ this.title+" / �ۼ��� : "+this.writer);
	}

	
}


public class Sample01 {
	
	final static Board[] Board_List = new Board[3]; //global ��ü�� ���� 
//     public static void main() �Լ����� ������ static ��ü ������ �־�� �Ѵ�
	
	public static void main(String[] args) {
//		���α׷��� ����ڰ� ���Ḧ �ϱ� ������ ��� ���� �Ǿ�� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while(power) {
			
//			����ڷ� ���� �Է��� �޾� �Խù� �ۼ�, �Խù� ��� ����� ������ �� ����
			System.out.println("1.�Խù� �ۼ� / 2. �Խù� ��� / 0. ���� ");
			int mainSelect_num = sc.nextInt();

			//	input �Է� �޾����� input ��ȿ�� �˻��� ��� �Ѵ�.
//			��ȿ�� ������ �ʹݿ� �ϴ� ���� ȿ�����̴�.
			if(mainSelect_num<0 || mainSelect_num>2) {
				System.out.println("�ٽ� �� �� Ȯ���� �ֽʽÿ�.");
				continue; // ���ǹ� ó������ ���ư��� 
			}
			
//			�Խù� �ۼ��� �����ϸ� Ÿ��Ʋ,�ۼ���,�ۼ� ��¥ �� �ð� , ������ �Է��� �� ���� 
			if(mainSelect_num==1) {
//				�Է��� �Ϸ�Ǹ� �Խù��� �ڵ� ��ϵ� 
//				����� �Ϸ�Ǹ� ó��ȭ������ ���ƿ� 
				
				for(Board board:Board_List) {
					if(board!=null) continue;
					
					Scanner scanner = new Scanner(System.in);
					board = new Board();
				
				
				
				System.out.println("Ÿ��Ʋ : ");
				board.title = sc.nextLine();
				sc.nextLine(); // �Է� buffer�� �����ִ� ���� ����� �ϳ��� �ǳ� 
				System.out.println("�ۼ��� : ");
				board.writer = sc.nextLine();
				
				System.out.println("�ۼ� ��¥ �� �ð� : ");
				board.writeDate = sc.nextLine();
				
				System.out.println("���� : ");
				board.contents = sc.nextLine();
				
				board.contractionPrint();
				
				break;
			}
				
		}
//			��
			
//			�Խù� ����� �����ϸ� �ۼ��� �Խù��� ��� ������(�Խù� �����ڿ� �Խù� ���� �ۼ��ڸ� ���)
			if(mainSelect_num==2) {
				System.out.println("�Խù� ��� ");
				
//				Board_List �迭���� ��Ҹ� �ϳ��� ������ 
				for(Board board:Board_List) { //���� for������ ��ü �־��ֱ� 
//					���� board ��Ұ� null�� �ƴҶ��� ���
					
					if(board == null) { // �ڵ� �帧���� ����� ���� if�� ���� ����ó�� �Ѵ� 
						continue;	
					}
					
					board.contractionPrint();
					
					
//					
				}
//				�Խù� ��Ͽ��� Ư�� �Խù� �����ڸ� �Է��ϸ� �ش� �Խù��� �� ������ ������ 
//				�Խù� �󼼿��� �����ϱ⸦ �����ϸ� ������ �� �� ���� 
//				������ �Ϸ�Ǹ� ó��ȭ������ ���ƿ� 
				
				
			}
//			
			
//			ó��ȭ���� �� ���Ḧ �����ϸ� ���α׷��� ����� 
			if(mainSelect_num==0) {
				System.out.println("���α׷� ����");
				power = false;
//				1.while ���� ������ false�� �ٲٱ� 
//				2.break������ while ���� ���� ���� ��Ű��
//				break;
//				3.return������ main �޼��带 ����
//				return;
			}
			
		}

		
	}

}

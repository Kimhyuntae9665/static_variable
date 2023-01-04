package Chapter02;

import java.util.Scanner;

// ���ù� �ۼ� 
//���ù� ���
//�Խù� �� ����
//�Խù� ���� 

class Board{
	int id;
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
	
	void detailPrint() {
		System.out.println("title : "+title);
		System.out.println("writer : "+writer);
		System.out.println("writeDate : "+writeDate);
		System.out.println("contents : "+this.contents);
		System.out.println("like : "+this.like);
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
				
				for(int i=0;i<Board_List.length;i++) {
					
//				for(Board board:Board_List) {
					if(Board_List[i]!=null) continue;
					
					Board_List[i] = new Board();
				System.out.println("������ id : ");
				Board_List[i].id = i;
				sc.nextLine();
				System.out.println("Ÿ��Ʋ : ");
				Board_List[i].title = sc.nextLine();
				sc.nextLine(); // �Է� buffer�� �����ִ� ���� ����� �ϳ��� �ǳ� 
				System.out.println("�ۼ��� : ");
				Board_List[i].writer = sc.nextLine();
				System.out.println("�ۼ� ��¥ �� �ð� : ");
				Board_List[i].writeDate = sc.nextLine();
				System.out.println("���� : ");
				Board_List[i].contents = sc.nextLine();
				Board_List[i].contractionPrint();
				
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
				
				Scanner selector = new Scanner(System.in);
//				�Խù� ��Ͽ��� Ư�� �Խù� �����ڸ� �Է��ϸ� �ش� �Խù��� �� ������ ������
				System.out.println("�Խù��� �����ϼ���. (-1�� �Է��ϸ� ó�� ȭ������ ���ư��ϴ�.)");
				int selectBoardId = selector.nextInt();
				
//				-1�� �Է��ϸ� ó�� ȭ������ ���ư���.
				if(selectBoardId == -1) continue;
				Board_List[selectBoardId].detailPrint();
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

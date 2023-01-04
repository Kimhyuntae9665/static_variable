package Chapter02;

import java.util.Scanner;

// 개시물 작성 
//개시물 목록
//게시물 상세 보기
//게시물 수정 

class Board{
//	제목
	String title;
//	작성자 
	String writer;
//	작성 날짜 시간  
	String writeDate;
//	내용 
	String contents;
//	좋아요
	int like;
	
	void contractionPrint() { // 2회이상 사용하는 print문은 함수로 만들어 놓기 
		System.out.println("게시물 구분자 : "+ this.writer+" / 게시물 제목 "+ this.title+" / 작성자 : "+this.writer);
	}

	
}


public class Sample01 {
	
	final static Board[] Board_List = new Board[3]; //global 객체로 선언 
//     public static void main() 함수에서 쓸려면 static 객체 변수로 있어야 한다
	
	public static void main(String[] args) {
//		프로그램은 사용자가 종료를 하기 전까지 계속 실행 되어야 한다.
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while(power) {
			
//			사용자로 부터 입력을 받아 게시물 작성, 게시물 목록 기능을 선택할 수 있음
			System.out.println("1.게시물 작성 / 2. 게시물 목록 / 0. 종료 ");
			int mainSelect_num = sc.nextInt();

			//	input 입력 받았으면 input 유효성 검사해 줘야 한다.
//			유효성 검증은 초반에 하는 것이 효과적이다.
			if(mainSelect_num<0 || mainSelect_num>2) {
				System.out.println("다시 한 번 확인해 주십시오.");
				continue; // 조건문 처음으로 돌아가기 
			}
			
//			게시물 작성을 선택하면 타이틀,작성자,작성 날짜 및 시간 , 내용을 입력할 수 있음 
			if(mainSelect_num==1) {
//				입력이 완료되면 게시물이 자동 등록됨 
//				등록이 완료되면 처음화면으로 돌아옴 
				
				for(Board board:Board_List) {
					if(board!=null) continue;
					
					Scanner scanner = new Scanner(System.in);
					board = new Board();
				
				
				
				System.out.println("타이틀 : ");
				board.title = sc.nextLine();
				sc.nextLine(); // 입력 buffer를 지워주는 역할 출력이 하나씩 되네 
				System.out.println("작성자 : ");
				board.writer = sc.nextLine();
				
				System.out.println("작성 날짜 및 시간 : ");
				board.writeDate = sc.nextLine();
				
				System.out.println("내용 : ");
				board.contents = sc.nextLine();
				
				board.contractionPrint();
				
				break;
			}
				
		}
//			입
			
//			게시물 목록을 선택하면 작성돤 게시물을 모두 보여줌(게시물 구분자와 게시물 제목 작성자만 출력)
			if(mainSelect_num==2) {
				System.out.println("게시물 목록 ");
				
//				Board_List 배열에서 요소를 하나씩 꺼내옴 
				for(Board board:Board_List) { //향상된 for문으로 객체 넣어주기 
//					꺼낸 board 요소가 null이 아닐때만 출력
					
					if(board == null) { // 코드 흐름에서 벗어나는 놈을 if문 으로 예외처리 한다 
						continue;	
					}
					
					board.contractionPrint();
					
					
//					
				}
//				게시물 목록에서 특정 게시물 구분자를 입력하면 해당 게시물의 상세 내용을 보여줌 
//				게시물 상세에서 수정하기를 선택하면 수정을 할 수 있음 
//				수정이 완료되면 처음화면으로 돌아옴 
				
				
			}
//			
			
//			처음화면일 시 종료를 선택하면 프로그램이 종료됨 
			if(mainSelect_num==0) {
				System.out.println("프로그램 종료");
				power = false;
//				1.while 문의 조건을 false로 바꾸기 
//				2.break문으로 while 문을 강제 종료 시키기
//				break;
//				3.return문으로 main 메서드를 종료
//				return;
			}
			
		}

		
	}

}

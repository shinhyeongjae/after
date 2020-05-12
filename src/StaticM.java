package homework0428;

import java.util.Scanner;

public class StaticM {
	
	Scanner sc = new Scanner(System.in);
	boolean check=true;
	StaticUtil stackUtil = new StaticUtil();
	public void stackStart() {
		System.out.println("Stack 입력 방식을 선택했습니다.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력([0]~[size()-1)");
		System.out.println("4. 종료");
		System.out.println("원하는 기능을 선택하세요(1~4)");
	}
	
	public void execute() {
		stackStart();		
		while(check) {
			int select3 = sc.nextInt();
			switch(select3) {
			case 1:
				stackUtil.push();
				break;
			case 2:
				stackUtil.pop();
				break;
			case 3:
				stackUtil.print();
				break;
			case 4:
				System.out.println("종료합니다.");
				check=false;
				break;
			default :
				System.out.println("다시 입력하세요.(1~4 사이)");
				break;
			}
		}
		
	}
}

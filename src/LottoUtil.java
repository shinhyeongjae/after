package homework0428;

import java.util.Scanner;
import java.util.Random;

public class LottoUtil {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int coin;
	
	
	public void execute() {
		coin = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		int[] lottoArr = new int[7];
		
		System.out.println("번호\t 1번\t2번\t3번\t4번\t5번"
								+ "\t6번\t+보너스 번호");
		for(int i = 1; i<=coin; i++) {
			System.out.printf("게임 %d\t ", i);
			for(int j = 0; j<7; j++) {
				int lottoNum = r.nextInt(45)+1;
				lottoArr[j] = lottoNum;
				if(j==0) {
					System.out.print("[" + lottoArr[j]+",\t");
				}else if(j!=6) {
					System.out.print(lottoArr[j]+",\t");
				}else if(j==6){
					System.out.print(lottoArr[j]+"]");
				}	
			}
			System.out.println();
		}
		
//		for(int i = 1; i<=coin; i++) {
//			System.out.print("게임 " + i);
//			for(int j = 1; j<=coin*7; j++) {
//				int cnt = 0;
//				System.out.print(lottoArr[i-1]);
//				cnt++;
//				if(cnt % 7 == 0) {
//					System.out.println();
//				}
//			}
//		}
		
	}
}

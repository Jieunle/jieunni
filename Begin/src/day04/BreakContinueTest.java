package day04;



public class BreakContinueTest {
	
	public static void main(String[] args) {
		System.out.println("1.----------------");
		//결과 예측해보기
		for(int i=0;i<3;i++) {
			if(i==1)
				break;//가장 가까운 반복문을 벗어난다
			System.out.println("i="+i);
		}//for-----------
		
		System.out.println("2.----------------");
			//결과 예측해보기
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;//조건에 맞으면 아래 문장을 실행하지 않고 반복문을 계속 수행하라
			System.out.println("i="+i);
		}//for-----------
			
		System.out.println("3.----------------");
		for(int i=0;i<3;i++){
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("i="+i+", k="+k);
			}//for-----------
		}
			
				System.out.println("4.----------------");
				for(int i=0;i<3;i++){
					for(int k=0;k<3;k++) {
						if(k==1) continue;
						System.out.println("i="+i+", k="+k);
				}//for-----------
			}
		

				System.out.println("5.----------------");
				outer: //label
				for(int i=0;i<3;i++) {
					inner:
					for(int k=0;k<3;k++) {
						if(k==1) break outer;
						System.out.println("i="+i+", k="+k);
					}//for-----------
				}//for---------
				
				System.out.println("6.----------------");
				outer:
				for(int i=0;i<3;i++) {
					inner:
					for(int k=0;k<3;k++) {
						if(k==1) continue outer;
						System.out.println("i="+i+", k="+k);
					}//for-----------
				}//for--------
					
	}
}
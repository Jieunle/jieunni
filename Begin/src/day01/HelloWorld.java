package day01;

public class HelloWorld //클래스명과 파일명이 동일해야 함
{
	//단문 주석: 한줄 짜리 주석
	/*복문 주석: 여러 줄을
	 			주석처리 합니다
	 */
	/**문서화 주석: javadoc라는 유틸을 이용해 api문서를
	 			만들 때 이용
	 			() 소괄회
	 			{} 중괄호
	 			[] 대괄호
	 			: 콜론
	 			; 세미콜론
	 			. 마침표
	 */
	//main()메소드 구성

	public static void main(String[] args) 
	{
		System.out.println("Hello World~~");
		System.out.print("안녕하세요");
		System.out.println("반갑습니다.");
		//누구누구 입니다. 출력하고 컴파일(havac)한뒤에 실행(java)시켜 보세요
		System.out.println("저는 멀티캠퍼스의\n이지은입니다.");
		System.out.println("국여\t영어\t수학");
		System.out.println("----------------");
		System.out.println("99\t88\t77");
		
		System.out.println("역슬래시(\\)");
		System.out.println("\'김소월\'님의 \"진달래꽃\"");
		/*특수제어문자 (Excape문자)
		 \n 줄바꿈
		 \t 탭키 설정한 만큼 띄어쓰기를 한다
		 \\ 역슬래시(\)를 출력하고자 할 때
		 \" 쌍따옴표(")
		 \' 홑따옴표(')
		 
		 "역슬래시(\)"
		 
		 '김소월'님의 "진달래꽃"
		 
		 */
	}

}

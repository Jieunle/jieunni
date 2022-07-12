//import java.util.Date;
import java.util.*;

public class DataType
{
	//main
	public static void main(String[] b)
	{
		//참조형
		Date d=new Date(); //java.util패키지에 있는 클래스
		System.out.println(d);
		System.out.println("2.자료형-실수형------");
		//float(4byte) < double (8byte)-default
		//float : 단정밀도 소수점이하 7자리 정도
		//double : 배정밀도 소수점이하 15~17자리 정도
		float ft1=12.34F;
		//float은 부동소수점일 경우 반드시 접미사 f를 붙여주어야 한다
		System.out.println(ft1);
		float ft2=321; //321.0
		System.out.println(ft2);
		//promotion: 작은 자료형에서 큰 자료형으로 자동으로 형변환이 일어나는 것
		//byte < short < int < long < float < double
		//	     char  <

		double d1=100.123456789111D;
		System.out.println(d1);
		byte i=9;
		double d2=i;
		System.out.println(d2);//9.0
		//과학적 지수 표기법: e+4==> 10^4, e-4==>10^-4
		double d3=200e-4;//200 x 1/10000
		System.out.println(d3);

		float ft3=200e+4f; //200 x 10000
		System.out.println(ft3);

		float ft4=3.69f;
		int k=(int)ft4; 
		//casting(강제형변환): 큰자료형을 작은 자료형으로 변환하고자 할 때 사용
		//변수=(자료형)값 => 주의 값의 손실이 발생할 수 있다.

		System.out.println(ft4);
		System.out.println(k);

		byte x=(byte)128;
		System.out.println(x);
		/*   128 
			  64 ... 0
			  32 ... 0
			  16 ... 0
			   8 ... 0
			   4 ... 0
			   2 ... 0
			   1 ... 0

			   128 : 00000000  00000000  00000000  10000000
		*/
	
		System.out.println("3. 자료형-char(문자형)");
		//문자형: character ==> char : 문자 1개를 저장할 수 있다 (기본자료형) '가'
		//문자열: String ==>문자 여러개를 저장할 수 있다. (참조형) "문자열"
		//char(2byte) : 0 ~ 2^16-1  ==> 0 ~65535  모든 국가의 언어 표현 가능. 유니코드 체계를 사용
		//short(2byte) : -2^15 ~ 2^15-1
		char ch='A';
		//char ch2='AB'; [x]
		String str="AB";
		System.out.println(ch);
		System.out.println(str);
		char ch3='한';
		char ch4='\uff57';
		System.out.println("ch3="+ch3);// 문자열에 + 연산자를 사용하면 문자열 결합이 일어난다.
		System.out.println("ch4="+ch4);

		System.out.println("4. 논리형 -boolean");
		//boolean(1) : true, false값만 갖는다
		boolean bool=true;
		boolean bool2=2>5;
		System.out.println("bool="+bool);
		System.out.println("bool2="+bool2);
		//int a=(int)bool;[x] //자바의 논리형은 형변환 할 수 없다. 0이나 1로 호환되지 않는다.

		/*int 형 미만의 자료형 데이터들이 연산에 사용될 경우 그 결과는 int형으로 자동 형변환이 일어난다
			byte
			short
			char
		*/
		byte m1=1;
		byte m2=2;
		//byte result=m1+m2;
		int result=m1+m2;
		System.out.println("result="+result);
		
		char c='A';
		System.out.println(c);//A==> 65, B=>66
		System.out.println((char)(c+1));//66
		//B가 출력되도록 해보세요
	}
}




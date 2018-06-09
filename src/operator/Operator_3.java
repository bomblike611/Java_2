package operator;

public class Operator_3 {

	
	public static void main(String [] args) {
		//나이를 받아서 성년인지 아닌지를 판단
		//성년의 조건 - 나이가 20살
		
		int age=28;
		String result;
		result= age>=20?"성년입니다.":"미성년입니다.";
		
		//성년입니다. 미셩년입니다.
		System.out.println(result);
		
		//확장된 대입 연산자
		//1~10까지의 합을 구하세요
		//0+1+2+3+4+5+6+7+8+9+10
		int num=0;
		num=num+1;//1 0+1
		num=num+2;//3 0+1+2
		num=num+3;//6 0+1+2+3
		System.out.println(num);
		
		num=num+1;
		num+=1;//num=num+1
		num=num*3;
		num*=3;
		num=num/8;
		num/=8;
		
	}
}

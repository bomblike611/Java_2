package operator;

public class Operator_4 {

	public static void main(String[] args) {
		int num=1;
		num=num+1;//2
		num+=1;//3
		
		//단항 연산자
		++num;//선행 num=num+1, num+=1, 4
		num++;//후행 num=num+1, num+=1, 5
		System.out.println(num);
		
		num=0;
		int number=0;
		number=num++;
		System.out.println(num);//1
		System.out.println(number);//0
		System.out.println(++num);//2
		System.out.println(num++);//2
		System.out.println(num);//3
		
		num=0;
		
		num= ++num+ num++;
		System.out.println(num);
		System.out.println(num);
		

	}
	
}

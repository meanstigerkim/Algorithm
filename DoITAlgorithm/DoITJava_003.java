import java.util.*;
public class DoITJava_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//입력을 String 변수 sNum에 저장한 한 char[]형을 변수로 변환하기
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] = '0'; //아스키코드로 char -> '0'뺴서 숫자를 변환 
		}
		System.out.print(sum);		
	}
}

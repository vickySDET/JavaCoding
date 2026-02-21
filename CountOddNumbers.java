package javaCoding;

public class CountOddNumbers {

	public static void main(String[] args) {

		int count=0;
		for(int i=0;i<=101;i++){
			if(i%2!=0) {
				count++;
			}
			System.out.println(count);
		}
	}

}

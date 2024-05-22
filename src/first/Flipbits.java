package first;

public class Flipbits {

	public static int minFlips(String pwd) {
		
		
		int flipsNeeded = 0;
		for(int i=0;i<pwd.length()-1;i+=2) {
			{
				if(pwd.charAt(i)!=pwd.charAt(i+1))
					flipsNeeded++;
			}
		}
		
		return flipsNeeded;
		
	}
	
	public static void main(String[] args) {
		
		String pwd = "1011110";
		int count = minFlips(pwd);
		System.out.println(count);
		

	}

}

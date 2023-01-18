
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,20,30,40};
		for(int ele:a)
		{
			System.out.println(ele);
		}
		
		String name ="sachin";
		int count=name.toUpperCase().length();
		System.out.println("the length of the string is:"+count);
		
		StringBuffer sb=new StringBuffer("viratkohli");
		int length= sb.append("INDRCB").reverse().length();
		System.out.println(length);
	}

}

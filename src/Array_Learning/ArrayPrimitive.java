package Array_Learning;

public class ArrayPrimitive{
public static void main (String[] args) {
	int[] rollNumber = new int[10];
	for(int i=0;i<10;i++)
	{
		rollNumber[i]=i+100;
	}
	String[] names = new String[10];
	names[0]= "prathamesh";
	names[1]= "ramesh";
	names[2]= "krishna";
	names[3]= "sagar";
	names[4]= "sushant";
	names[5]= "sudesh";
	names[6]= "pratik";
	names[7]= "vrushabh";
	names[8]= "salman";
	names[9]= "gaurav";
	
	String[] address = new String[10];
	address[0]= "solapur";
	address[1]= "pune";
	address[2]= "satara";
	address[3]= "sangli";
	address[4]= "nagar";
	address[5]= "beed";
	address[6]= "latur";
	address[7]= "kolhapur";
	address[8]= "jalgaon";
	address[9]= "mumbai";
	
	for(int i = 0;i<10;i++)
	{
		System.out.println("RollNumber:"+rollNumber[i]+" "+"Address:"+address[i]);
	}
	
	

}
}
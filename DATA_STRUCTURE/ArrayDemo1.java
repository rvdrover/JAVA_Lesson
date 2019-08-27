import java.util.*;
class ArrayDemo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int array[] =new int[5];
		
		for(int i=0; i<5; i++){
			System.out.print("Enter the Number :");
			array[i]=sc.nextInt();
		
		}
		int max=0;
		for (int j=0; j<5; j++){
			if(max<array[j]){
				max=array[j];
			}
			
	    }
	   System.out.print("max :"+ max );
	}
}
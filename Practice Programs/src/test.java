
public class test {
	
	static int k=0;   
	public static void main(String [] args)     {         
		for(int i=2;i<5;i++)       {       
			for(int j=2;j<5; j+=3)        {        
				System.out.println((k+=3) *(++i));     
				}   
		}
	}
}

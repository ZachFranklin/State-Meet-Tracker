
public class Reserve {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//column 1 = ID Number
		//column 2 = First Name
		//column 3 = Last Name
		//column 4 = number of events participated in
		String reserve[][] = new String[1][4];
		while(cont==true)
		{
			for(int rows = 0; rows<reserve.length; rows++)
			{
				for(int columns = 0; columns <reserve[0].length; columns++)
				{
					System.out.format("%d \t", reserve[rows][columns]);
				}
				System.out.println("");
			}
		}
	}

}

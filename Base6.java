import java.util.*;
class Base6
{
public static void main(String[] args) 
{	int input;
	
	//System.out.print("Enter the decimal number : ");
	Scanner sc = new Scanner(System.in);
	//Number Of input
	System.out.println("Input");
	String input1=sc.nextLine();
	input=Integer.parseInt(input1);
	if(input>50)
	{
		return;
	}
	String s = sc.nextLine();
	String array[] = s.split(",");
	int party[] = new int[input];
	for(int i=0; i<input; i++)
	{
		party[i]=Integer.parseInt(array[i]);
		if(party[i]>127)
		{
			return;
		}
	}	

	int b=6;	//CONERSION TAKING FOR 6
	int q[]=new int[input];
	int r;
	int answ[] = new int[input];
		for(int i=0; i<input; i++)
	{
		q[i] = party[i];
		String ans="";
		while(q[i]!=0)
		{
			r=q[i]%b;
			ans=r+ans;
			q[i]=q[i]/b;
		}
		answ[i]=Integer.parseInt(ans);
	}



	
/*for(int i=0; i<input; i++)
{
	System.out.println(answ[i]);
}


*/

	//code for making sum of digits
	int sum[] = new int[input];
	int n;
	for(int i=0; i<input; i++)
	{
		while(answ[i] > 0)
        {
            n = answ[i] % 10;
            sum[i] = sum[i] + n;
            answ[i] = answ[i] / 10;
        }
	}

	/*for(int i=0; i<input; i++)
{
	System.out.println(sum[i]);
}*/


	//Code for Inversion
	int count = 0;
	for(int i=0; i<input; i++)
	{	
			for(int j=i; j<input; j++)
				
			{	if(sum[i]>sum[j])
				{
					count++;
				}
			}
	}
	System.out.println(count);
}
}

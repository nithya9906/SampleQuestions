import java.util.Scanner;
public class MonsterMain{
	public static void main(String[] args)
	{
		int noOfMonster=0,initialExperience=0,i=0,count=0,loopCount=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of monsters:");
		noOfMonster=in.nextInt();
		System.out.println("Enter person's initial experience:");
		initialExperience=in.nextInt();
		int[] power=new int[noOfMonster];
		System.out.println("Enter the power of each monster:");
		for(i=0;i<noOfMonster;i++)
		{
			System.out.print("For monster "+(i+1)+":");
			power[i]=in.nextInt();
		}
		int[] bonus=new int[noOfMonster];
		System.out.println("Enter the bonus for defeating of each monster:");
		for(i=0;i<noOfMonster;i++)
		{
			System.out.print("For monster "+(i+1)+":");
			bonus[i]=in.nextInt();
		}
		do{
			loopCount=0;
			for(i=0;i<noOfMonster;i++)
			{
				if((initialExperience>=power[i]) && power[i]!=-99)
				{
					power[i]=-99;
					
					initialExperience+=bonus[i];
					bonus[i]=-99;
					count++;
				}
				else if((initialExperience<power[i]) || power[i]==-99)
				{
					loopCount++;
				}
			}
		}while(loopCount<noOfMonster);
		System.out.println("Maxinum no of monster defeated :"+count);
		
		
	}
}
import java.util.*;
public class Day1Script extends Thread
{
	int count=0;
	int startPoint=0;
	public Day1Script()
	{

		ArrayList<Thread> threadList = new ArrayList<Thread>();
		for(int i=0;i<1000;i++)
		{
			threadList.add(new Thread(){

				public void run()
				{
					for(int j=startPoint;j<1_000_000;j++)
					{
						count+=j;

					}
					startPoint+=1_000_000;
				}


			});

		}
		for(int i=0;i<threadList.size();i++)
		{
			threadList.get(i).start();

		}





	}
	public static void main(String[] args)
	{
		Day1Script app=new Day1Script();
	}
}
import java.util.*;
public class Day1Script extends Thread
{
	public Day1Script()
	{
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		for(int i=0;i<1000;i++)
		{
			threadList.add(new Thread(){

				public void run()
				{

				}


			});

		}



	}
	public static void main(String[] args)
	{
		Day1Script app=new Day1Script();
	}
}
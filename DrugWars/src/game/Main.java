package game;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Player player = createPlayer();
		
	}	
	public static void createDay(int day)
	{
		Drug[] drugs = new Drug[6];
		for(int i = 0;i < 6;i++)
		{
			String drugNames[] = {"Weed", "Shrooms", "Opium", "Meth", "Coke", "Heroin"};
			drugs[i].setDrugName(drugNames[i]);
			drugs[i].setDrugCost(setPrice(i));
		}
		
	}
	public static int setPrice(int index)
	{
		Random rand = new Random();
		int price = rand.nextInt() * 1000 * index;
		return price;
	}
	public static Player createPlayer()
	{
		System.out.println("What is your name?");
		String pName = input.next();
		System.out.println("Hello " + pName + " you will start out with 10000 dollars, good luck.");
		Player player = new Player(pName, 10000);
		return player;
	}
}

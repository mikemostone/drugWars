package game;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Player player = createPlayer();
		Drug[] d = createDay();
		for(int i = 0;i < d.length;i++)
		{
			System.out.println(d[i].getDrugName() + "\t\t\t" + d[i].getDrugCost());
		}
	}	
	public static Drug[] createDay()
	{
		Drug[] drugs = new Drug[6];
		
		//System.out.println("Drugs\t\t\tPrices");
		
		String drugNames[] = {"Weed", "Shrooms", "Opium", "Meth", "Coke", "Heroin"};
		
		for(int i = 0;i < 5;i++)
		{
			drugs[i].setDrugName("Drug");
			drugs[i].setDrugCost(setPrice(10));
			
		}
		return drugs;
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

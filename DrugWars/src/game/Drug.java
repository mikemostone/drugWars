package game;

public class Drug 
{
	private String drugName;
	private int drugCost;
	//default constructor
	public Drug(){}
	//argument constructor
	public Drug(String drugName, int drugCost)
	{
		this.drugName = drugName;
		this.drugCost = drugCost;
	}
	public String getDrugName() 
	{
		return drugName;
	}
	public void setDrugName(String drugName) 
	{
		this.drugName = drugName;
	}
	public int getDrugCost() 
	{
		return drugCost;
	}
	public void setDrugCost(int drugCost) 
	{
		this.drugCost = drugCost;
	}
}

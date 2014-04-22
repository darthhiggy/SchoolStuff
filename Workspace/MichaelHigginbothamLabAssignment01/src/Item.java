import java.text.*;
public class Item 
{
	private double StorageCost, ManufacturingCost, SellingCost;
	private int BoxQuantity, considq;
	
	public Item()
	{
		StorageCost = 0;
		ManufacturingCost = 0;
		SellingCost = 0;
		BoxQuantity = 0;
		considq = 0;
	}
	
	
	public void SetStorageCost(double s)
	{
		StorageCost = s;
	}
	
	public double GetManufacturingCost()
	{
		return ManufacturingCost;
	}
	
	public void SetManufacturingCost(double s)
	{
		ManufacturingCost = s;
	}
	
	public double GetSellingCost()
	{
		return SellingCost;
	}
	
	public void SetSellingCost(double s)
	{
		SellingCost = s;
	}
	
	public int GetBoxQuantity()
	{
		return BoxQuantity;
	}
	
	public void SetBoxQuantity(int s)
	{
		BoxQuantity = s;
	}
	
	public void SetConsidQ(int q)
	{
		considq = q;
	}
	
	public int GetTotalBoxes()
	{
		
		return considq/BoxQuantity;
		
	}
	
	public double GetShippableInventoryIncome()
	{
		return (GetTotalBoxes() * BoxQuantity) * SellingCost;
	}
	
	public double GetTotalManufacturingCost()
	{
		return considq * ManufacturingCost;
	}
	
	public double GetStorageCost()
	{
		return (considq - (GetTotalBoxes() * BoxQuantity)) * StorageCost; 
	}
	
	public double GetOverallProfit()
	{
		return (GetShippableInventoryIncome() - GetTotalManufacturingCost() - GetStorageCost() );
	}
	
	DecimalFormat df = new DecimalFormat("#.##");
	public String ToString()
	{
		String msg = "Income From Shippable Inventory $" + GetShippableInventoryIncome() + "\nStorage Cost: $" + df.format(GetStorageCost()) 
				+ "\nOverall profit: $" + df.format(GetOverallProfit());
		return msg;
	}
}

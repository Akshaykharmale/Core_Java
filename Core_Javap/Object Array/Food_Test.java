package object_array;

import java.util.Scanner;

class Food
{
	private int foodId,foodQuantity,foodPrice;
	private String foodType,foodName;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public Food(int foodId, int foodQuantity, int foodPrice, String foodType, String foodName) {
		super();
		this.foodId = foodId;
		this.foodQuantity = foodQuantity;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
		this.foodName = foodName;
	}
	
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" +  foodName + ",foodType="+ foodType 
							+ ", foodQuantity=" + foodQuantity + ", foodPrice=" + foodPrice + "]";
	}	
}

public class Food_Test {

	public static void main(String[] args) 
	{
		Food f[]=new Food [5];
		Scanner scn=new Scanner(System.in);
		int foodId,foodQuantity,foodPrice,choice=0,count=0;
		String foodType,foodName;
		
		do
		{
			System.out.println(" 1.Add Food Items \n 2.Update Items \n 3.Delete Items \n 4.Search Items \n 5.View All \n 6.Exit");
			System.out.println("Enter your choice : ");
			choice=scn.nextInt();
			
			switch (choice) {
			case 1:System.out.println("Add your food details here : ");
					System.out.println("Enter the food Id : ");
					foodId=scn.nextInt();
					System.out.println("Enter the food name : ");
					foodName=scn.next();
					System.out.println("Enter the food type : ");
					foodType=scn.next();
					System.out.println("Enter the food Quantity : ");
					foodQuantity=scn.nextInt();
					System.out.println("Enter the food price : ");
					foodPrice=scn.nextInt();
					
					f[count]=new Food(foodId, foodQuantity, foodPrice, foodType, foodName);
					count ++;
					System.out.println("Food details added successfully");
					break;
					
			case 2:System.out.println("Enter the food id want to be update : ");
					foodId=scn.nextInt();
					for(int i=0;i<count;i++)
					{
						if(f[i]!=null && f[i].getFoodId()==foodId)
						{
							System.out.println("Enter the food name : ");
							foodName=scn.next();
							f[i].setFoodName(foodName);
							System.out.println("Enter the food type : ");
							foodType=scn.next();
							f[i].setFoodType(foodType);
							System.out.println("Enter the food Quantity : ");
							foodQuantity=scn.nextInt();
							f[i].setFoodQuantity(foodQuantity);
							System.out.println("Enter the food price : ");
							foodPrice=scn.nextInt();
							f[i].setFoodPrice(foodPrice);
						}
					}
					System.out.println("Updated Successfully\n");
					break;
					
			case 3:System.out.println("Enter the food id want to be delete : ");
					foodId=scn.nextInt();
					for(int i=0;i<count;i++)
					{
						if(f[i]!=null && f[i].getFoodId()==foodId)
						{
							f[i]=null;
						}
					}
					System.out.println("Deleted successfully\n");
					break;
			
			case 4:System.out.println("Enter the food id want to be search : ");
					foodId=scn.nextInt();
					for(int i=0;i<count;i++)
					{
						if(f[i]!=null && f[i].getFoodId()==foodId)
						{
							System.out.println(f[i]);
						}
					}
					System.out.println();
					break;
			
			case 5:System.out.println("***** All Food Details *****");
					
					for(int i=0;i<count;i++)
					{
						if(f[i]!=null)
						{
							System.out.println(f[i].toString());
						}
					}
					System.out.println();
					break;
			
			case 6:System.out.println("----- Exited Successfully -----");
					System.exit(0);
					
			default:System.out.println("Invalid choice");
				break;
			}
			
		}while(choice!=6);
		scn.close();
	}

}

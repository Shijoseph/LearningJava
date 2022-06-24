package basicsObjectOriented;

public class FoodMain {

	public static void main(String[] args) {
		
		Food [] fridge = new Food[4];
		
		Food food1 = new Food("apple","tomato");
		Food food2 = new Food("orange","brinjal");
		Food food3 = new Food("grapes","onion");
		Food food4 = new Food("mango","pumkin");
		
		fridge[0]=food1;
		fridge[1]=food2;
		fridge[2]= food3;
		fridge[3]= food4;
		
		System.out.println( fridge[0].typeOfFruit);
		System.out.println( fridge[1].typeOfVegetable);
		System.out.println( fridge[2].typeOfFruit);
		System.out.println( fridge[3].typeOfVegetable);
		// TODO Auto-generated method stub

	}

}

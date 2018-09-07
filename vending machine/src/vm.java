import java.util.Scanner;
class vm {
	public static int choice=0;
public static void main(String[] args) {
    int Food = runMenu();
    int Price = retrievePrice(Food);
    int money= moneyInserted(Price);
}
public static int runMenu(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\n\nPlease enter your selection:"
                + "\n1: Snickers \t 125"
                + "\n2: Reeses Cup \t 130"
                + "\n3: Doritoes \t 150"
                + "\n4: Pepsi \t 185"
                + "\n5: Exit ");
    choice = keyboard.nextInt();
    return choice;        
}
public static int retrievePrice(int menuChoice){
    if (menuChoice == 1)
        return 125;
    if (menuChoice == 2)
        return 130;
    if (menuChoice == 3)
        return 150;
    if (menuChoice == 4)
        return 185;
    else return 0;
}

public static int moneyInserted(int Price){
    Scanner keyboard = new Scanner(System.in);
    int money = 0,change;
    System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
    money = keyboard.nextInt();
    while (money < Price){
        System.out.println("Please insert sufficient funds");
        money = money + keyboard.nextInt();
    }
       while(money>Price)
       {
    	   change=money-Price;
    	   System.out.println("Take your change:" + change);
            	   System.out.println("Collect your item,Please visit again!");
           	 return change;
       }
       System.out.println("Collect your item,Please visit again!");
        return 0;
}
}

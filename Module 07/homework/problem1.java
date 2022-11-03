package Module 07.homework;

public class problem1 {
    public static void main(String [] args) {
        piggybank bank = new piggybank();
        bank.addNickels(7);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.addPennies(11);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.addPennies(-8);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.addDimes(5);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.addQuarters(6);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.addQuarters(-3);
		System.out.println("Bank has $"+bank.getContents()+" in it");
		bank.breakTheBank();
		System.out.println("Bank has $"+bank.getContents()+" in it");
    }
}

class piggybank {
    int pennies;
    int dimes;
    int quarters;
    int nickels;

    piggybank();
    {
        this.pennies=0;
        this.dimes=0;
        this.quarters=0;
        this.nickels=0;
    }
    void addPennies(int pennies)
    {
        System.out.println("You have added"+Pennies+"pennies")
        if(pennies=0) {
            this.pennies+= pennies;
        }
        else {
            System.out.println("No pennies added");
        }
    }
    void addDimes(int dimes)
    {
        System.out.println("You have added"+Dimes+"dimes")
        if(dimes=0) {
            this.dimes+= dimes;
        }
        else {
            System.out.println("No dimes added");
        }
    }
    void addQuarters(int quarters)
    {
        System.out.println("You have added"+Quarters+"quarters")
        if(quarters=0) {
            this.quarters+= quarters;
        }
        else {
            System.out.println("No quarters added");
        }
    }
    void addNickels(int nickels)
    {
        System.out.println("You have added"+Nickels+"nickels")
        if(nickels=0) {
            this.nickels+= nickels;
        }
        else {
            System.out.println("No nickels added");
        }
    }


    int getPennies()
    {
        return pennies;
    }
    int getNickels()
    {
        return nickels;
    }
    int getDimes()
    {
        return dimes;
    }
    int getQuarters()
    {
        return quarters;
    }

    float getContents()
    {
        double dollarAmount=0;
        dollarAmount=0.05*getNickels()+0.01*getPennies()+0.1*getDimes()+0.25*getQuarters();
		return (float)dollarAmount;
    }
    void getTotal()
    {
        float getTotal+getContents();
        System.out.println("The total cash $"+dollarAmount+" from piggybank");
        this.pennies=0;
        this.dimes=0;
        this.pennies=0;
        this.nickels=0; 
    }

}
package main;

import ships.BigCargo;
import ships.BigShip;
import ships.CommandShip;
import ships.SmallCargo;
import ships.SmallShip;

public class Battlefield {

	public static void main(String[] args) {
		
		
		CommandShip c1 = new CommandShip();
		SmallShip s1 = new SmallShip();
		BigCargo bcg1 = new BigCargo();
		BigShip bs1 = new BigShip();
		SmallCargo scg1 = new SmallCargo();
		
		
	
		
		c1.Attack(s1);
		c1.Attack(s1);
		bcg1.heal(s1);
		s1.showHealt();
		bs1.Attack(c1);
		c1.Attack(bs1);
		bs1.Attack(c1);
		s1.Attack(c1);
		bs1.Attack(c1);
		bs1.Attack(c1);
		bs1.Attack(c1);
		scg1.heal(c1);
		c1.showHealt();
		
		
	}

}

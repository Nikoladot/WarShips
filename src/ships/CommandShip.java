package ships;

public class CommandShip extends BattleShip{
	protected int shield;
	
	
	public CommandShip() {
		 name = "Command Ship";
		 demage = 150;
		 healt = 1000;
		 shield = 20;	
	}
	
	
	@Override
	protected void getDemage(int demage) {
		if(healt>0) {
			this.healt = this.healt - demage + shield;
			System.out.println("CommandShip Healt: " + this.healt);
		}
		
		if (healt <= 0) {
			System.out.println("Command ship is destroyed!!!");
		}
	}

	
	@Override
	public void Attack(Ship ship) {
		if(healt>0) {
		super.Attack(ship);
		}
		else {
			System.out.println("You cant attack with destroyed ship." );

		}

	}
	
	@Override
	public void showHealt() {
		System.out.println("Command ship healt is: " + this.healt);
	}
	
}

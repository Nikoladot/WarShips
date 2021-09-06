package ships;

public class SmallCargo extends Cargo {
	
	
	public SmallCargo() {
		name = "Small Cargo";
		healt = 100;
		capacity = 1000;
	
	}
	
		@Override
		public void getDemage(int demage) {
			if(healt>0) {
				this.healt = this.healt - demage;
				System.out.println("SmallCargo healt: " + this.healt);
			}
			
			if (healt <= 0) {
				System.out.println("SmallCargo ship is destroyed!!!");
			}
	}
		
	@Override
	public void heal(Ship ship) {
		
		heal = 50;
		
			ship.healt = ship.healt + heal;
		System.out.println(ship.name + " has healed 50 healt!");
		
	}
	
	@Override
	public void showHealt() {
		System.out.println("Small Cargo ship healt is: " + this.healt);
	}
		
}

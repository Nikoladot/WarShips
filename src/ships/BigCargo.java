package ships;

public class BigCargo extends Cargo {
	int shield;
	
	public BigCargo() {
		name = "Big Cargo";
		healt = 200;
		capacity = 5000;
		shield = 10;
	
	}
	
		@Override
		protected void getDemage(int demage) {
			if(healt>0) {
				this.healt = this.healt - demage + shield;
				System.out.println("BigCargo healt: " + this.healt);
			}
			
			if (healt <= 0) {
				System.out.println("BigCargo ship is destroyed!!!");
			}
		}
		
		@Override
		public void heal(Ship ship) {
			heal = 100;
			
				ship.healt = ship.healt + heal;
				System.out.println(ship.name + " has healed 100 healt!");
		}
		
		@Override
		public void showHealt() {
			System.out.println("Big Cargo ship healt is: " + this.healt);
		}
}

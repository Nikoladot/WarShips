package ships;

public class SmallShip extends BattleShip {
		
	public SmallShip() {
		name = "Small Ship";
		demage = 50;
		healt = 300;
	}
	
		@Override
		protected void getDemage(int demage) {
			if(healt>0) {
				this.healt = this.healt - demage;
				System.out.println("SmallShip healt: " + this.healt);
			}
			
			if (healt <= 0) {
				
				System.out.println("Small ship is destroyed!!!");
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
			System.out.println("Small ship healt is: " + this.healt);
		}
}

package ships;

public class BigShip extends BattleShip {

	
	public BigShip() {
		name = "Big Ship";
		demage = 100;
		healt = 500;
	}
	
		@Override
		protected void getDemage(int demage) {
			if(healt>0) {
				this.healt = this.healt - demage;
				System.out.println("BigShip healt: " + this.healt);
			}
			
			if (healt <= 0) {
				System.out.println("Big ship is destroyed!!!");
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
			System.out.println("Big ship healt is: " + this.healt);
		}
}

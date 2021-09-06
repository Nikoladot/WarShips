package ships;

public abstract class Ship {

	protected int healt;
	protected int speed;
	protected String name;

	
		
	protected void getDemage(int demage) {
		if(healt>0) {
			this.healt = this.healt - demage;
		}
		
		if (healt <= 0) {
		}
	} 
	
protected void showHealt() {
		
	}
}

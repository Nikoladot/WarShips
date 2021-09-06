package ships;

public abstract class BattleShip extends Ship{
	
	protected int demage;


	protected void Attack(Ship ship) {
		ship.getDemage(demage);
	}
	
	@Override
	protected void showHealt() {
		// TODO Auto-generated method stub
		super.showHealt();
	}
	
}

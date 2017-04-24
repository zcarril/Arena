
//diagonal moving creatures

public class CrookedCreature extends Movement
{//uses the template of Movement abstract class to function
	public CrookedCreature(Map map, int r, int c) {
		super(map, r, c);

	}


	protected void chase (Player player)
	{//method to chase Player, by first creating a variable that colDelta and rowDelta
	 //   these variables hold the creature's position minus the players position
		int colDelta = super.getPos().c - player.getPos().c;
		int rowDelta = super.getPos().r - player.getPos().r;

		boolean horzMove = (Math.abs(colDelta) > Math.abs(rowDelta));
		// the actual move, which is dependent on the variables just assigned
		//	each move (1,2,3, or 4) is referred to below and will move it on step toward the Player position
		if (horzMove)
		{
			if (colDelta > 0 && rowDelta > 0 ){
				move (1);
				move (3);
			}
			else if (colDelta < 0 && rowDelta < 0){
				move (2);
				move (4);	
			}
		}
		else
		{
			if (colDelta > 0 && rowDelta < 0){
				move (1);
				move (4);
			}
			else if (colDelta < 0 && rowDelta > 0 ){
				move (2);
				move (3);
			}
		}
	}

	

}
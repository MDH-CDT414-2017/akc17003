import java.util.ArrayList;
/** BowlingGame Score calculator 
 *
 * @author CDT414 Student: 
 * @version 1.0 
 * @date 2016-11-24
 */
public class BowlingGame {

	String game;
	ArrayList<Integer> scoresList;
	 
	public BowlingGame(String game)
	{	
		this.game = game;
		this.scoresList = new ArrayList<Integer>();
	}
	
	public String GetGame()
	{
		return this.game;
	}
	
	public boolean checkGameFormat()
	{
		if (this.game.charAt(0) != '[' && this.game.charAt(this.game.length()-1)!=']')
			return false;
		
		String score = this.game.replace("][", "-");
        score = score.replace("]", "");
		score = score.replace("[", "");
		
        String[] numbersArray = score.split("-");
        
        if(numbersArray.length<20 || numbersArray.length>22 )
            return false;
        else
        {
        	for (int i=0; i<numbersArray.length;i++) {
        		try
        		{
        			Integer scoreint = Integer.parseInt(numbersArray[i]);
        			if (scoreint<0||scoreint>10)
        				return false;
        			this.scoresList.add(scoreint);
        		}
        		catch (NumberFormatException e){
        			return false;
        		}
        	}	
        }
        
        for (int i=0; i<scoresList.size()-1; i=i+2){
        	if ((this.scoresList.get(i) + this.scoresList.get(i+1))>10)
        		return false;
        }
        
        if(this.scoresList.size()==22) {
            if(this.scoresList.get(this.scoresList.size()-4)!=10 && this.scoresList.get(this.scoresList.size()-3)!=0)
            	return false;         
        }
        
		return true;
	}
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	
	public int getScore() {
		int TotalScore=-1;
		return TotalScore;
	}
	
}

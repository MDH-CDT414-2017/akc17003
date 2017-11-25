import java.util.ArrayList;
/** BowlingGame Score calculator 
 *
 * @author CDT414 Student: 
 * @version 1.0 
 * @date 2016-11-24
 */
public class BowlingGame {

	String game;
	ArrayList<Integer> frames;
	 
	public BowlingGame(String game)
	{	
		this.game = game;
		this.frames = new ArrayList<Integer>();
	}
	
	public boolean checkGameFormat()
	{
		if (this.game=="")
			return false;
		if ((this.game.charAt(0) != '[') && ((this.game.charAt(this.game.length()-1)) != ']'))
			return false;
		
		String score = this.game.replace("][", "-");
		
        score = score.replace(",", "-");
        
        score = score.substring(1, score.length()-1);
        System.out.println(score);
        
        String[] numbersArray = score.split("-");
        
        if (numbersArray.length<20 || numbersArray.length>22)
            return false;
        else
        {
        	for (int i=0; i<numbersArray.length; i++) {
        		try
        		{
        			Integer scoreInt = Integer.parseInt(numbersArray[i]);
        			if (scoreInt<0 || scoreInt>10)
        				return false;
        			this.frames.add(scoreInt);
        		}
        		catch (NumberFormatException e)
        		{
        			return false;
        		}
        	}	
        }
        
        if (this.frames.size()==20)
        {
        	for (int i=0; i<this.frames.size(); i=i+2)
        	{
        		if (((this.frames.get(i)+this.frames.get(i+1))<0) || ((this.frames.get(i)+this.frames.get(i+1))>10))
        			return false;
        		if (i==18) //spare in the last frame, bonus throw
        		{
        			if (this.frames.get(i)+this.frames.get(i+1)==10)
						return false;
        		}
        	}
        }
        
        if (this.frames.size()==21)
        {
        	if ((this.frames.get(this.frames.size()-2)+this.frames.get((this.frames.size()-3)) != 10) || (this.frames.get(this.frames.size()-3) == 10) || (this.frames.get(this.frames.size()-2) == 10))
        		return false;
        }
        
        if (this.frames.size()==22) 
        {
        	if((this.frames.get(this.frames.size()-4))!=10)
            {
        		if((this.frames.get(this.frames.size()-3))!=10)
            		return false;
            }
            if((this.frames.get(this.frames.size()-4))==10)
            {
            	if ((this.frames.get(this.frames.size()-3))!=0)
            		return false;
            }
            if((this.frames.get(this.frames.size()-3))==10)
            {
            	if ((this.frames.get(this.frames.size()-4))!=0)
            		return false;
            }
        }
        
		return true;
	}
	
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	
	public int getScore() 
	{
		int score=0;
		if(!checkGameFormat())
			return -1;
		
		for(int i=0; i<20; i=i+2)
		{
			if (this.frames.get(i)==10) //strike
			{
				if(this.frames.get(i+2)==10) //multiple strike
				{
					if(i!=18) //not last frame
						score=score+this.frames.get(i)+this.frames.get(i+2)+this.frames.get(i+4);
					else
						score=score+this.frames.get(i)+this.frames.get(i+2)+this.frames.get(i+3);
				}
				else
					score=score+this.frames.get(i)+this.frames.get(i+2)+this.frames.get(i+3);
			} 
			else if ((this.frames.get(i)+this.frames.get(i+1))==10) //spare
				score=score+10+this.frames.get(i+2);
			else //open
				score=score+this.frames.get(i)+this.frames.get(i+1);
		}
		return score;
	}
}


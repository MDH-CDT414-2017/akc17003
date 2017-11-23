/** BowlingGameTest 
 *
 * @author CDT414 Student:
 * @version 1.0 
 * @date 2016-11-24
 */
import junit.framework.TestCase;

/** BowlingGame Score calculator test cases 
 *  
 */	 
public class BowlingGameTest extends TestCase {
        
	/** test01 
	 * 	
	 *  If no game is provided, score should be -1 (error)   
	 */	     
	public void test01() {
        BowlingGame bowlingGame = new BowlingGame("");
        assertEquals(-1, bowlingGame.getScore());
    }	
	public void testGame1() {
        BowlingGame bowlingGame = new BowlingGame("1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }
	public void testGame2() {
        BowlingGame bowlingGame = new BowlingGame("[[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }	
	public void testGame3() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][3.6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6][9,1]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }

}
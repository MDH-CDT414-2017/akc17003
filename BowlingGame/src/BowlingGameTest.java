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
	BowlingGame bowlingGame = new BowlingGame("");
	
	public void test01() {
        assertEquals(-1, bowlingGame.getScore());
    }	
	public void testGame1() {
        bowlingGame.game = ("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(true, bowlingGame.checkGameFormat());
    }
	public void testGame2() {
        bowlingGame.game = ("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6],");
        assertEquals(false, bowlingGame.checkGameFormat());
    }	
	public void testGame3() {
        bowlingGame.game = ("[10,0][3.6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6][9,1]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }
	public void testGame4() {
        bowlingGame.game = ("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,5]");
        assertEquals(true, bowlingGame.checkGameFormat());
    }
	public void testGame5() {
        bowlingGame.game = ("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,10]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }
	public void testGame6() {
        bowlingGame.game = ("[1,5][3,6][7,2][2,5][4,4][5,3][3,3][4,5][8,1][2,8][7]");
        assertEquals(true, bowlingGame.checkGameFormat());
    }
	public void testGame7() {
        bowlingGame.game = ("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertEquals(true, bowlingGame.checkGameFormat());
    }
	public void testGame8() {
        bowlingGame.game = ("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10][10,10]");
        assertEquals(false, bowlingGame.checkGameFormat());
    }
	public void testGame9() {
        bowlingGame.game = ("[1,5][3,6][7,2][2,5][4,4][5,3][3,3][4,5][8,1][2,8][7,1]");
        assertEquals(false, bowlingGame.checkGameFormat());
	}
	public void testGame10() {
        bowlingGame.game = ("[1,5][3,6][7,2][2,5][4,4][5,3][3,3][4,5][8,1][2,8]");
        assertEquals(false, bowlingGame.checkGameFormat());
	}
	public void testGame11() {
        bowlingGame.game = ("[1,5][3,6][7,2][2,5][4,4][5,3][3,3][4,5][8,1][2,8][10]");
        assertEquals(true, bowlingGame.checkGameFormat());
    }
	
	public void testScore1() {
        bowlingGame.game = ("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertEquals(300, bowlingGame.getScore());
    }
	public void testScore2() { 
		bowlingGame.game = ("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(98, bowlingGame.getScore());
	}
	public void testScore3() { 
		bowlingGame.game = ("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(103, bowlingGame.getScore());
	}
	public void testScore4() { 
		bowlingGame.game = ("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]");
		assertEquals(90, bowlingGame.getScore());
	}
	public void testScore5() {
        bowlingGame.game = ("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(112, bowlingGame.getScore());
    }
	public void testScore6() {
        bowlingGame.game = ("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(81, bowlingGame.getScore());
    }
	public void testScore7() {
        bowlingGame.game = ("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(94, bowlingGame.getScore());
    }
	public void testScore8() {
        bowlingGame.game = ("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(88, bowlingGame.getScore());
    }
	public void testScore9() {
        bowlingGame.game = ("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]");
        assertEquals(93, bowlingGame.getScore());
    }
	public void testScore10() {
        bowlingGame.game = ("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]");
        assertEquals(92, bowlingGame.getScore());
    }
	
}
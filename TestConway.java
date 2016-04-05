import static org.junit.Assert.*;

import org.junit.Test;

public class TestConway {

	//Tests three scenarios of convertToInt()
	//convertToInt() has been refactored and is ultimately never necessary
	@Test
	public void testConvertInt(){
		MainPanel test = new MainPanel(10);

		int oldInt = test.originalConvertToInt(100);
		int newInt = test.convertToInt(100);
		assertEquals(oldInt,newInt);

		oldInt = test.originalConvertToInt(1000);
		newInt = test.convertToInt(1000);
		assertEquals(oldInt,newInt);

		oldInt = test.originalConvertToInt(0);
		newInt = test.convertToInt(0);
		assertEquals(oldInt,newInt);
	}

	//Test toString() on MainPanel
	@Test
	public void testPanelToString(){
		MainPanel test = new MainPanel(10);

		String oldString = test.oldToString();
		String newString = test.toString();

		assertEquals(oldString,newString);
	}

	//Test true and false toString()'s in Cell
	@Test
	public void testCellToString(){
		Cell trueCell = new Cell(true);
		Cell falseCell = new Cell(false);

		assertEquals(trueCell.toString(),trueCell.oldToString());
		assertEquals(falseCell.toString(),falseCell.oldToString());
		assertNotEquals(trueCell.toString(),falseCell.toString());
		assertNotEquals(trueCell.oldToString(),falseCell.oldToString());
	}

}

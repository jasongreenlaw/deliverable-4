import java.util.Random;
import java.util.Arrays;
import java.lang.Integer;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/*
 * PropertyTests - Tests the following properties of sorted arrays ...
 * 1) Output array is same size as input array
 * 2) Every element in the input array is in the output array
 * 3) Values in output array are always increasing or equal
 */
public class PropertyTests {
	
	private int[][] arrays = new int[100][];
	
	/*
	 * Generate random arrays and store them in the 
	 * private arrays variable before running tests
	 */
	@Before
	public void setUpArrays() 
	{
		Random r = new Random();

		for(int i = 0; i < arrays.length; i++) 
		{
			// allocate array to be anywhere from 0 to 99
			int[] tempArray = new int[r.nextInt(100)];

			for(int k = 0; k < tempArray.length; k++) 
			{
				tempArray[k] = r.nextInt(Integer.MAX_VALUE);
			}
			arrays[i] = tempArray;
		}
	}
	
	@Test
	public void testSameArrayEl() 
	{
		boolean same = true;
		
		for(int i = 0; i < arrays.length; i++) 
		{
			int[] inputArray = Arrays.copyOf(arrays[i], arrays[i].length);
			Arrays.sort(arrays[i]);
			for(int j = 0; j < originalArray.length; j++) 
			{
				// search sorted array for original values
				if(Arrays.binarySearch(arrays[i], inputArray[j]) < 0) 
				{
					same = false;
					break;
				}
			}
			
			if(!same) 
			{
				break;
			}
		}
		
		assertTrue(same);
	}

	@Test
	public void testArrayIncreasingOrEqual() 
	{
		boolean inOrEq = true;
		
		for(int i = 0; i < arrays.length; i++) 
		{
			Arrays.sort(arrays[i]);
			
			for(int k = 0; k < arrays[k].length - 1; j++) 
			{
				if(arrays[i][k] > arrays[i][k+1]) 
				{
					inOrEq = false;
					break;
				}
			}
			
			if(!increasingOrEqual) 
			{
				break;
			}
		}
		
		assertTrue(increasingOrEqual);
	}

	@Test
	public void testEqualArrayLen() 
	{
		boolean equalLen = true;
		
		for(int i = 0; i < arrays.length; i++) 
		{
			int inputLength = arrays[i].length;
			
			Arrays.sort(arrays[i]);
			
			int sortedLength = arrays[i].length;
			
			if(inputLength != sortedLength) 
			{
				equalLen = false;
				break;
			}
		}
		assertTrue(equalLengths);
	}
}
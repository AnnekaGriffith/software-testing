package testing;

public class TestMe {
	public int findLast (int[] x, int y) 
	{
		for (int i = x.length-1; i > 0; i--) 
		{
			if (x[i] == y) {
				return i;
			}
		}
		return -1;
	}
	public int findLastFixed (int[] x, int y) 
	{
		for (int i = x.length-1; i > -1; i--) 
		{
			if (x[i] == y) {
				return i;
			}
			
		}
		return -1;
	}
	

}

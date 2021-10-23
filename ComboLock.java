package comboLockProj;

public class ComboLock 
{
	private int[] code = new int[3];
	private int index;
	private int[] numsEnter;
	
	public ComboLock(int num1, int num2, int num3) 
	{
		code[0] = num1;
		code[1] = num2;
		code[2] = num3;
		reset();
	}
	
	public void reset() 
	{
		index = 0;
		numsEnter = new int[] {0, 0, 0};
	}
	
	public void tickLeft(int tick) 
	{
		index = index - tick;
		if(index < 0)
		{
			index = 39 + index;
		}
		numsEnter[1] = index;
	}
	
	public void tickRight(int tick) 
	{	
		if(numsEnter[0] == 0)
		{
			index += tick;
			numsEnter[0] = index;
		}
		else if(numsEnter[0] != 0 && numsEnter[2] == 0)
		{
			index += tick;
			if(index > 39)
			{
				index = (0 + (index - 39));
				numsEnter[2] = index;
			}
			else
			{
				numsEnter[2] = index;
			}
				
		}
	}
	
	public boolean canOpen() 
	{	
		if(numsEnter[0] == code[0] && numsEnter[1] == code[1] && numsEnter[2] == code[2])
		{
			return true;
		}
		return false;
	}
}
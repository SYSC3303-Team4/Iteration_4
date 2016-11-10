/**
*Class:             Input.java
*Project:           TFTP Project - Group 4
*Author:            Jason Van Kerkhoven                                             
*Date of Update:    10/11/2016                                              
*Version:           1.0.0                                                      
*                                                                                   
*Purpose:           Basically an Enum
* 
* 
*Update Log:		v1.0.0
*						- null
*/
package inputs;


public class Input 
{
	//declaring local instance variables
	private int blockNum;
	private int mode;
	private int delay;
	
	
	//generic constructor
	Input(int mode, int blockNum, int delay)
	{
		this.mode = mode;
		this.blockNum = blockNum;
		this.delay = delay;
	}
	
	
	//generic accessors
	public int getBlockNum()
	{
		return blockNum;
	}
	public int getMode()
	{
		return mode;
	}
	public int getDelay()
	{
		return delay;
	}
	
	
	@Override
	//print as string
	public String toString()
	{
		return ("BlockNum: " + blockNum + " || Mode: " + mode + " || Delay: " + delay);
	}
}

package MainPackage;
// Kathryn Nichols

public class MyInteger {
	private int value;
	
public int getValue() {
		return value;
	}
private void setValue(int value)
{
	this.value = value;
}
public MyInteger (int value) {
	setValue(value);
}
public boolean isEven()
{
	if (this.getValue() %2 == 0)
	{
		return true;
		}
	else
	{
			return false;}
	}

public boolean isOdd()
{
	if (this.getValue() %2 != 0)
	{
		return true;
		}
	else
	{
		return false;
		} 
	}

public boolean isPrime() 
{
    if (this.getValue()%2==0) return false;
    for(int i=3;i*i<=this.getValue();i+=2) {
        if(this.getValue() %i ==0)
            return false;
    }
    return true;
}
public static boolean isEven(int value)
{
	if (value % 2 == 0)
	{
		return true;
	}
	else 
	{	
		return false;
	}
	}
public static boolean isOdd(int value)
{
	if (value % 2 != 0)
	{
		return true;
	}
	else 
	{	
		return false;
	}
	}
public static boolean isPrime(int value)
{
	if (value %2==0) return false;
    for(int i=3;i*i<=value;i+=2) {
        if(value %i==0)
            return false;
    }
    return true;
}
public static boolean isPrime(MyInteger myInt)
{
	    if (myInt.getValue() %2==0) return false;
	    for(int i=3;i*i<=myInt.getValue();i+=2) {
	        if(myInt.getValue()%i==0)
	            return false;
	    }
	    return true;
	}
	
public static boolean isEven(MyInteger myInt)
{
	if (myInt.getValue() %2 == 0)
		{
		return true;
		}
	else 
	{ 
		return false;
		}
	}
public static boolean isOdd(MyInteger myInt)
{
	if (myInt.getValue() %2 != 0)
		{
		return true;
		}
	else 
	{ 
		return false;
		}
	}

public boolean equals(int value)
{
	if (value == this.getValue())
		{
		return true;
		}
	else 
	{ 
		return false;
		}
	}

public boolean equals(MyInteger value)
{
	return equals(this.getValue());
			
	}

public static int parseInt(char[] s)
{
	return parseInt(new String(s));	
}

public static int parseInt (String s)
{
    return Integer.parseInt(s);
}
}

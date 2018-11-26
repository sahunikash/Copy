
public class SingletonPattern
{
	private static SingletonPattern s =null;
	
	private SingletonPattern()
	{}
	
	public static SingletonPattern get()
	{
		if(s==null)
		{
			s=new SingletonPattern();
		}
		return s;
	}

}

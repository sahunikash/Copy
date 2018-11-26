interface Observble
{
	public void add(Observer A);
	public void remove(Observer R);
	public void  Notify();
	
}
interface Observer
{
	public void update();
	
}

class whetherstation implements Observble
{
	private Object obervers;
	public void add(Observer A)
	{
		((Observble) this.obervers).add(A);
	}
	public void remove(Observer R)
	{
		
	}
	public void Notify()
	{
		 
	}
	public int GetTemperature()
	{
		return 1;
	}
	
}
class PhoneDisplay implements Observer
{
	
	whetherstation station;
	public void phonedisplay(whetherstation station)
	{
		this.station=station;
	}
	public void update()
	{
		this.station.GetTemperature();
	}
	
}

public class ObserverPattern 
{
public static void main(String[] args) {
	
}
}

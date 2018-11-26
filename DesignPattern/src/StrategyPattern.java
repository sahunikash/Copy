
interface IFlyBehavior
{
	
	public void fly();
	}

interface IQuackBehavior
{
	public void quack();
	}

interface  IDisplayBehavior
{
	
	public void display();
	}

class displayText implements IDisplayBehavior
{
	public void display()
	{
	System.out.println("text format display");	
	}
	
}

class displayGraphics implements IDisplayBehavior
{
	public void display()
	{
		System.out.println("graphics format display");
	}
	
}


class simpleQuackBehavior implements IQuackBehavior
{
	public void quack()
	{
		System.out.println("simple quack");
	}
	
}

class noQuackBahavior implements IQuackBehavior
{
	public void quack()
	{
		System.out.println("no quack");
	}
	}

class simpleflyBahavior implements IFlyBehavior
{
	public void fly()
	{
	System.out.println("simple fly");	
	}
	
}
class JetflyBehavior implements IFlyBehavior
{
	public void fly()
	{
		System.out.println("jet fly");
	}
	
}

class NoflyBehavior implements IFlyBehavior

{
	public void fly()
	{
		System.out.println("No fly");
	}
	}


class Duck 
{
	IFlyBehavior fb;
	IQuackBehavior qb;
	IDisplayBehavior db;
	
	
	
	public IFlyBehavior getFb() {
		return fb;
	}
	public void setFb(IFlyBehavior fb) {
		this.fb = fb;
	}
	public IQuackBehavior getQb() {
		return qb;
	}
	public void setQb(IQuackBehavior qb) {
		this.qb = qb;
	}
	public IDisplayBehavior getDb() {
		return db;
	}
	public void setDb(IDisplayBehavior db) {
		this.db = db;
	}
	public void fly()
{
		this.fb.fly();
		
}
	public void quack()
	{
		this.qb.quack();
	}
	
	public void display()
	{
		this.db.display();
	}
	
	}

public class StrategyPattern 
{
;

public static void main(String[] args) 
{
	Duck dc = new Duck();
	
	
	
}
}

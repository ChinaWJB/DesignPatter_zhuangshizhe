

/**
 * 一种调料，Soy豆浆
 * @author hp
 *
 */
public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + "Soy ,";
	}
	
	public double cost(){
		return 0.15 + beverage.cost();
	}
}



/**
 * һ�ֵ��ϣ�Mocha
 * @author hp
 *
 */
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + "Mocha, ";
	}
	
	public double cost(){
		return 0.2 + beverage.cost();
	}
}

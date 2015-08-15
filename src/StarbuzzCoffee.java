

/**
 * 测试代码
 * @author hp
 *
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		//一杯浓咖啡什么都不加
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//一杯深焙咖啡加两份摩卡，一份奶泡
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
	}
}

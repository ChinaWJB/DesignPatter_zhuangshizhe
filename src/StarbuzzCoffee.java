

/**
 * ���Դ���
 * @author hp
 *
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		//һ��Ũ����ʲô������
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//һ������ȼ�����Ħ����һ������
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
	}
}

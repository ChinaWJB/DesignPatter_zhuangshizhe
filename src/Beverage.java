

/**
 * 各种饮料的超类，调料也继承它 
 * @author hp
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}

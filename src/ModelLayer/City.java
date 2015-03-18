/**
 * 
 */
package ModelLayer;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class City {
	public String name;
	
	/**
	 * Create an instance of this City
	 * @param city current city name
	 */
	public City(String city)
	{
		this.city = city;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}

/**
 * 
 */
package ModelLayer;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class Country {
	private String name;
	
	/**
	 * Create a instance of Country
	 * @param zipCode current zipCode
	 * @param name current city name
	 */
	public Country(String name)
	{
		this.name = name;
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

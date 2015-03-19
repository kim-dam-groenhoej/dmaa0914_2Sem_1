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
	private int id;
	
	/**
	 * Create a instance of Country
	 * @param zipCode current zipCode
	 * @param name current city name
	 */
	public Country(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public int getId(){
		return id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}

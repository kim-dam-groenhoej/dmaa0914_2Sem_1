/**
 * 
 */
package ModelLayer;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class Country {
	private int zipCode;
	private String name;
	
	/**
	 * Create a instance of Country
	 * @param zipCode current zipCode
	 * @param name current city name
	 */
	public Country(int zipCode, String name)
	{
		this.zipCode = zipCode;
		this.name = name;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
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

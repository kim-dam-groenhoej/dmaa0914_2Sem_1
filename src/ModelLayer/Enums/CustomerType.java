package ModelLayer.Enums;

public enum CustomerType {
	PRIVATE(1), CLUB(2);
	
	private final int value;
	private CustomerType(int value){
		this.value = value;
	}
	public int getvalue() {
		return value;
	}
}

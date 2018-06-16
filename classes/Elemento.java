
abstract public class Elemento {
	private protected int id;
	
	public Elemento() {
	}
	
	public Elemento (int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

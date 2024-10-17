
public class UniqueList extends IntegerList {

	
	public UniqueList(){
		super();
	}
	public UniqueList(int capacity) {
		super(capacity);
	}
	@Override
	 public int add(int integer) {
	        if (indexOf(integer) != -1) {
	            throw new IllegalArgumentException("The integer " + integer + " is already in the list.");
	        }
	        super.add(integer);
	        return integer;
	    }
	 @Override
	    public int insert(int index, int integer) {
	        if (indexOf(integer) != -1) {
	            throw new IllegalArgumentException("The integer " + integer + " is already in the list.");
	        }
	        return super.insert(index, integer);
	    }
	
}


public class SortedList extends IntegerList {

	public SortedList() {
		super();
	}
	 public SortedList(int capacity) {
	        super(capacity);
    }
	 @Override
	    public int add(int integer) {
		 int index = 0;
		    while (index < size() && get(index) < integer) {
		        index++;
		    }
		    internalInsert(index, integer);
		    return index; 
		}

	 @Override
	 public int insert(int index, int integer) {
	     throw new UnsupportedOperationException("Insert is not supported in SortedList.");
	 }

	   
	}



public class RangeList extends IntegerList {

	private int lowBound;
	private int highBound;


	public RangeList() {
		super();
		this.lowBound = Integer.MAX_VALUE; 
	    this.highBound = Integer.MIN_VALUE;
	}
		
	public RangeList(int lowBound, int highBound) {
		super();  

        if (lowBound > highBound) {
            throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
        }

        this.lowBound = lowBound;
        this.highBound = highBound;

        for (int i = lowBound; i <= highBound; i++) {
            internalInsert(size(), i);  
        }
    }
	public void add(int lowBound, int highBound) {
		 if (lowBound > highBound) {
	            throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
	        }

	        if (size() == 0) {
	          

	            for (int i = lowBound; i <= highBound; i++) {
	                internalInsert(size(),i);
	            }
	            return;
	        }

	        if (lowBound < this.lowBound) {
	         
	            for (int i = lowBound; i < this.lowBound; i++) {
	                internalInsert(0, i); 
	            }
	            this.lowBound = lowBound; 
	        }

	        if (highBound > this.highBound) {
	          
	            for (int i = this.highBound + 1; i <= highBound; i++) {
	                internalInsert(size(),i);
	            }
	            this.highBound = highBound; 
	        }
	    }
    

   
    public void remove(int lowBound, int highBound) {
    	 if (lowBound > highBound) {
             throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
         }

         if (size() == 0) {
             throw new UnsupportedOperationException("Cannot remove range from an empty list.");
         }

         if (lowBound < this.lowBound || highBound > this.highBound) {
             throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");
         }
         boolean lowTerminal = lowBound == get(0); // Checks if lowerBound is the first element
         boolean highTerminal = highBound == get(size() - 1);
         if (!lowTerminal && !highTerminal) {
             throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
         }

         for (int i = lowBound; i <= highBound; i++) {
            
             int index = indexOf(i); 
             if (index != -1) { 
                 super.remove(index);
     }
         }
    }
    
    
    @Override
    public int insert(int index, int integer) {
        throw new UnsupportedOperationException("Insert is not supported in RangeList.");
    }

   
    @Override
    public int add(int integer) {
        throw new UnsupportedOperationException("Add method is not supported in RangeList. Use add(int, int) for ranges.");
    }

	}


class IntegerType implements AnyType {

	//This class creates new IntegerType implemented from AnyType Interface   
	private int number;

	   public IntegerType() {
	       number = 0;
	   }
	   
	   public IntegerType(int i) { 
	       number = i;
	   }

	   public boolean isBetterThan(AnyType datum) {
		return (this.number > ((IntegerType)datum).number);
	   }

	   public int toInteger() {
		return number;
	   }
	}
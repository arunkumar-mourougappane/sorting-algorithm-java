enum ArrayOrder_e {
    ASCENDING(0),
    DESCENDING(1),
    RANDOM(2)
};

public class AlgorithmData {

    protected int[] unsortedArray;
    protected boolean isAscending;
    protected static final int SAMPLE_ARRAY_SIZE = 10000;
    private ArrayOrder_e populateArrayOrder;

    public Object getPopulateArrayOrder() {
        return this.populateArrayOrder;
    }

    public void setPopulateArrayOrder(Object populateArrayOrder) {
        this.populateArrayOrder = populateArrayOrder;
    }

    public boolean isIsAscending() {
        return this.isAscending;
    }

    public void setIsAscending(boolean isAscending) {
        this.isAscending = isAscending;
    }


    public int[] getUnsortedArray() {
        return this.unsortedArray;
    }

    public void setUnsortedArray(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }
    public AlgorithmData()
    {
        unsortedArray = new int[SAMPLE_ARRAY_SIZE]; 
        isAscending = false;
        populateArrayOrder = ArrayOrder_e::RANDOM;
    }

}

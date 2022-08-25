package sarkar.dsa.ds.list;

public interface List<T> {

    public boolean add(T data);

    public Object get(int i);
    
    //returns the index of the data if available
    public int isAvailable(T date);

    public int size();

    public void display();

}

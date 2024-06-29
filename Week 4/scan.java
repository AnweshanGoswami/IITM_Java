

interface Iterator{
    public boolean has_next();
    public Object get_next();
}

class Sequence{
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
//implement the parameterized constructor to initialize size
public Sequence(int s){
    this.size = s;
    this.iArr = new int[maxLimit];
     _iter = new SeqIterator();
}
//implement addTo(elem) to add an int elem to the sequence
public void addTo(int elem){
    // Ensure _iter is initialized and indx is within bounds
    if (_iter == null || _iter.indx >= size) {
        System.out.println("Sequence is full, cannot add more elements.");
        return;
    }
    iArr[_iter.indx++] = elem; // Add element to the array and increment index
}

  
//implement get_Iterator() to return Iterator object
public SeqIterator get_Iterator(){
    // Ensure _iter is initialized before returning
    if (_iter == null) {
        _iter = new SeqIterator();
    }
    return _iter;
}

private class SeqIterator implements Iterator{
    int indx;
    public SeqIterator(){
        indx = 0;
    }
    //implement has_next()
    public boolean has_next(){
        return (indx < size);
    }
    //implement get_next()
    public Object get_next(){
        return (iArr[indx++]); //increments the index after the operation
    }
}
}


public class scan{
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
       sObj.addTo(1);
       sObj.addTo(2);
       sObj.addTo(3);
       sObj.addTo(4);
       sObj.addTo(5);
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}
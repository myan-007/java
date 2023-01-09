public class List {
    public int info;
    public List next;
    public List(int element, List list) {
        info = element;
        next = list;
    }
    public List(int element) {
        info = element;
        next = null;
    }
    public void insert(int element) {
        next = new List(element, next);
    }
    // removes the next element, if available
    public void delete() {
        if (next != null) {
            next = next.next;
        }
    }
    public String toString() {
        String result = "[" + info;
        for(List list = next; list != null; list = list.next) {
            result = result + ", " + list.info;
        }
        return result + "]";
    }
}
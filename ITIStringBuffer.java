public class ITIStringBuffer {

    private SinglyLinkedList<Character> list;

    public ITIStringBuffer() {
        list = new SinglyLinkedList<Character>();
    }

    public ITIStringBuffer(String  firstString){
        list = new SinglyLinkedList<Character>();
        char[] arr = firstString.toCharArray();
        for (char c : arr) {
            list.add(c);
        }
    }

    public void append(String nextString){
        char[] arr = nextString.toCharArray();
        for (char c : arr) {
            list.add(c);
        }
    }

    public String toString(){
        char[] arr = new char[list.size()];
        int index = 0;
        for (Character c : list) {
            arr[index] = c;
            index++;
        }
        return new String(arr);
    }   
}

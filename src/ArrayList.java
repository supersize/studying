/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 4/23/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/23/26        kimjaehyeong       created
 */
public class ArrayList<T> {
    private Object[] ele;
    private int size;

    public ArrayList(Object[] ele, int size) {
        this.ele = new Object[10];
        this.size = 0;
    }

    public void add(T value) {
        if(size == ele.length) resize();

        ele[size++] = value;
    }

    public T get(int idx) {
        checkIdx(idx);

        return (T) ele[idx];
    }

    private void checkIdx(int idx) {
        if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
    }

    private boolean checkValue(T value){
        for (Object target : ele)
            if(target.equals(value)) return true;
        return false;
    }

    public boolean contains(T value) {
        return checkValue(value);
    }

    private void resize(){
        Object[] newEle = new Object[ele.length * 2];
        for(int i = 0; i < size; i++){
            newEle[i] = ele[i];
        }

        ele = newEle;
    }

    public void removeIdx (int idx) {
        checkIdx(idx);
        for (int i = idx; i < size - 1; i++) {
            ele[i] = ele[i + 1];
        }

        ele[size] = null;
        size--;
    }

    public void removeValue (T value) {
        if(!checkValue(value)) throw new IllegalArgumentException();
        for (int i = 0; i < size; i++)
            if(ele[i].equals(value)) removeIdx(i);
    }

    public int size() {return size;}

    public void set(int idx, T value) {
        if(idx >= size) throw new IndexOutOfBoundsException();
        ele[idx] = value;
    }

    public void clear () {
        ele = new Object[10];
        size = 0;
    }


}

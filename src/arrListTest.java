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
public class arrListTest<T> {
    // get, add, getSize, resize, checkIdx
    private Object[] objects;
    private int size;

    arrListTest () {
        objects = new Object[10];
        size = 0;
    }

    public void add (T value) {
        if (size == objects.length) resize();

        objects[size++] = value;
    }

    public T get(int idx) {
        checkIdxForSet(idx);

        return (T) objects[idx];
    }

    public int getSize() {return size;}


    public void resize(){
        Object[] newObj = new Object[objects.length * 2];
        for(int i = 0; i < objects.length; i++){
            newObj[i] = objects[i];
        }

        objects = newObj;
    }

    private void checkIdxForSet(int idx) {
        if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
    }

    private void checkIdxForSet(int idx, int size) {
        if(idx < 0) throw new IndexOutOfBoundsException();
    }

    private boolean checkValue (T value){
        for (int i = 0; i < size; i++)
            if(objects[i] != null && objects[i].equals(value)) return true;
        return false;
    }

    // remove, set, contains, clear

    public void removeIdxForSet(int idx) {
        checkIdxForSet(idx);
        for (int i = idx; i < size - 1; i++)
            objects[i] = objects[i + 1];

        objects[size - 1] = null;
        size--;
    }

    public void removeIdxForSet(int idx, int size) {
        checkIdxForSet(idx, size);
        for (int i = idx; i < size - 1; i++)
            objects[i] = objects[i + 1];

        objects[size - 1] = null;
        size--;
    }


    /**
     * remove value found at first. this is started from 0
     * @param value
     */
    public void removeValue(T value) {
        checkValue(value);
        for (int i = 0; i < size; i++)
            if( objects[i].equals(value)) {
                removeIdxForSet(i);
                return;
            }
    }

    public boolean contains(T value) {
        return checkValue(value);
    }

    public void clear() {
        size = 0;
        Object[] newObj = new Object[10];
        objects = newObj;
    }

    public void set (int idx, T value) {
        if (idx >= size) throw new IndexOutOfBoundsException();

        objects[idx] = value;
    }
}

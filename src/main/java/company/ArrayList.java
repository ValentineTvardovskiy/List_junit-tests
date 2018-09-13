package company;

public class ArrayList<T> {
    private Object[] array;
    private final static int INITIAL_LENGTH = 16;
    private int size = 0;
    private int currentLenght;
    private static final double LOAD_FACTOR = 1.25;

    public ArrayList() {
        this.array = new Object[INITIAL_LENGTH];
        currentLenght = INITIAL_LENGTH;
    }

    public void add(T value) {
        if (size * LOAD_FACTOR >= currentLenght)
            increaseLength();
        array[size] = value;
        size++;

    }

    public void add(int index, T t) {
        checkCurrentLength();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = t;
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size);
        size--;

        if (size * LOAD_FACTOR <= currentLenght) {
            decreaseLength();
        }
    }

    private void checkCurrentLength() {
        if (size * LOAD_FACTOR >= currentLenght) {
            increaseLength();
        }
    }

    private void decreaseLength() {
        currentLenght /= LOAD_FACTOR;
        Object[] newArray = new Object[currentLenght];

        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;
    }



    private void increaseLength() {
        currentLenght *= LOAD_FACTOR;
        Object[] newArray = new Object[currentLenght];

        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;
    }


}

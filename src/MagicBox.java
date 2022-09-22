import java.util.Random;

public class MagicBox<T> {

    protected T[] items;

    public MagicBox(int maxNumber) {
        items = (T[]) new Object[maxNumber];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить " + items.length + " ячеек");
            } else {
                Random random = new Random();
                int randomInt = random.nextInt(items.length);
            }
        }
        return null;
    }
}

package behavioral.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        return hasNext() ? items.get(position++) : null;
    }
}

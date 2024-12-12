/**
 * Клас ConcreteIterator. Реалізація інтерфейсу Iterator.
 * <p>
 * Використовується для обходу елементів списку.
 * </p>
 */

import java.util.List;
import java.util.NoSuchElementException;

class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int currentIndex = 0;

    /**
     * Конструктор, який приймає список елементів для ітерації.
     * @param items Список елементів для обходу.
     */
    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    /**
     * Перевіряє, чи є ще елементи в списку.
     * @return {@code true}, якщо є наступний елемент; {@code false}, якщо елементи закінчилися.
     */
    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    /**
     * Повертає поточний елемент і переміщує ітератор до наступного.
     * <p>
     * Якщо ітератор вже досяг кінця списку, буде викинуто виключення {@code NoSuchElementException}.
     * </p>
     * @return Поточний елемент списку.
     * @throws java.util.NoSuchElementException якщо немає більше елементів.
     */
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return items.get(currentIndex++);
    }
}
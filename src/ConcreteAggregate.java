/**
 * Клас ConcreteAggregate. Реалізація інтерфейсу Aggregate.
 * <p>
 * Зберігає список елементів і створює ітератори для роботи з ними.
 * </p>
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class ConcreteAggregate<T extends Comparable<T>> implements Aggregate<T> {
    private final List<T> items = new ArrayList<>();

    /**
     * Додає новий елемент до колекції.
     * @param item Елемент для додавання.
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Створює звичайний ітератор для доступу до елементів у порядку їх додавання.
     * @return Ітератор, що забезпечує послідовний доступ до елементів.
     */
    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }

    /**
     * Створює ітератор для доступу до елементів у відсортованому порядку.
     * <p>
     * Елементи сортуються перед створенням ітератора.
     * </p>
     * @return Ітератор, що забезпечує доступ до відсортованих елементів.
     */
    @Override
    public Iterator<T> createSortedIterator() {
        List<T> sortedItems = new ArrayList<>(items);
        Collections.sort(sortedItems);
        return new ConcreteIterator<>(sortedItems);
    }
}

/**
 * Головний клас.
 */

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>();
        aggregate.add(5);
        aggregate.add(2);
        aggregate.add(9);

        System.out.println("Звичайний обхід:");
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nВпорядкований обхід:");
        Iterator<Integer> sortedIterator = aggregate.createSortedIterator();
        while (sortedIterator.hasNext()) {
            System.out.println(sortedIterator.next());
        }
    }
}
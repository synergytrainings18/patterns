package iterator;

/**
 * Created by astghik.mamunc on 6/19/2018.
 */
public interface Iterable<T extends Iterator> {

    T createIterator();

}

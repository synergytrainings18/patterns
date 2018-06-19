package iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Iterator i = tasks.getIterator();

        while (i.hasNext()){
            String task = (String) i.next();
            System.out.println(task);
        }
    }
}

interface Iterator{
    boolean hasNext();
    Object next();
}

interface Iterable{
    Iterator getIterator();
}

class Tasks implements Iterable{
    private String[] tasks = {"Task 1", "Task 2" , "Task 3"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

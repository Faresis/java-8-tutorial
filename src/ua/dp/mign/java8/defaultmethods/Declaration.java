package ua.dp.mign.java8.defaultmethods;

public interface Declaration {
    void process();
    public String newWord();
    public abstract int count();
    abstract public void close();

    default boolean isEmpty() {
        return this.count() > 0;
    }

    default boolean isSilent() {
        return this.newWord() == null;
    }

    public static void printNewWord() {
        System.out.println("newWord");
    }
}

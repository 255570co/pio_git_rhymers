package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer jest bazową klasą wyliczanki.
 * Implementuje strukturę typu stos o stałej pojemności do przechowywania liczb całkowitych.
 */
public class DefaultCountingOutRhymer {

    /** Maksymalna pojemność tablicy z liczbami. */
    public static final int CAPACITY = 12;

    /** Wartość informująca o tym, że wyliczanka jest pusta. */
    public static final int EMPTY_RHYMER_INDICATOR = -1;

    /** Domyślna wartość zwracana w przypadku błędnych operacji (np. pobierania z pustego stosu). */
    public static final int DEFAULT_VALUE = -1;

    /** Tablica przechowująca liczby w wyliczance. */
    private final int[] numbers = new int[CAPACITY];

    /** Indeks wskazujący na aktualnie ostatni element w wyliczance. */
    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Zwraca aktualny indeks ostatniego elementu.
     * @return wartość zmiennej total.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę do wyliczanki, jeśli nie jest ona pełna.
     * @param in liczba całkowita do dodania.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * @return true, jeśli wyliczanka nie zawiera elementów; false w przeciwnym razie.
     */
    public boolean checkCall() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna (osiągnęła limit CAPACITY).
     * @return true, jeśli wyliczanka jest pełna; false w przeciwnym razie.
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca ostatnio dodaną wartość bez usuwania jej z wyliczanki.
     * @return wartość ostatniego elementu lub DEFAULT_VALUE, jeśli wyliczanka jest pusta.
     */
    protected int peekaboo() {
        if (checkCall())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodaną wartość i usuwa ją z wyliczanki (zdejmuje ze stosu).
     * @return wartość zdjętego elementu lub DEFAULT_VALUE, jeśli wyliczanka jest pusta.
     */
    public int countOut() {
        if (checkCall())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
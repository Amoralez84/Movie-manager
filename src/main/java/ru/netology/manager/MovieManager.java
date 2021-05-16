package ru.netology.manager;

import net.sf.saxon.expr.Component;
import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] items = new Movie[0];
    private int number = 10;
    private int userNumber;

    public MovieManager() {
    }

    public MovieManager(int userNumber) {
        this.userNumber = userNumber;
    }

    public void add(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Object getMovie() {
        if (userNumber > number) {
            Movie[] result = new Movie[10];
        } else {
            Movie[] result = new Movie[userNumber];
        }
        Movie[] result = new Movie[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

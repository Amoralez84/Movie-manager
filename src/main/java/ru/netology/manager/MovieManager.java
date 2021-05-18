package ru.netology.manager;

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

    public Movie[] getMovie() {
        int temp = items.length;
        if (userNumber <= 0) {
            if (number < temp) {
                temp = number;
            }
        } else {
            if (userNumber < temp) {
                temp = userNumber;
            }
        }
        Movie[] result = new Movie[temp];
        return result;
    }
}


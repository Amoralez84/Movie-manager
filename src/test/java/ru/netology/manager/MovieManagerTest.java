package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private Movie first = new Movie(1, "Бладшот", "боевик");
    private Movie second = new Movie(2, "Вперёд", "мультфильм");
    private Movie third = new Movie(3, "Отель «Белград»", "комедия");
    private Movie fourth = new Movie(4, "Джентльмены", "боевик");
    private Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
    private Movie sixth = new Movie(6, "Тролли. Мировой тур", "мультфильм");
    private Movie seventh = new Movie(7, "Номер один", "комедия");
    private Movie eighth = new Movie(8, "Паразиты", "триллер");
    private Movie ninth = new Movie(9, "Один вдох", "драма");
    private Movie tenth = new Movie(10, "Хороший доктор", "комедия");
    private Movie eleventh = new Movie(11, "Тьма", "триллер");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
    }
}

package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTestNonEmptyWithSetup {
  private MovieManager manager = new MovieManager();
  private Movie first = new Movie(1, "Бладшот", "Боевик");
  private Movie second = new Movie(2, "Вперед", "Мультфильм");
  private Movie third = new Movie(3, "Отель <<Белград>>", "Комедия");
  private Movie fourth = new Movie(4, "Джентльмены", "Боевик");
  private Movie fifth = new Movie(5, "Человек-неведимка", "Ужасы");
  private Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм");
  private Movie seventh = new Movie(7, "Номер один", "Комедия");


  @BeforeEach
  public void setUp() {
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
  }


}
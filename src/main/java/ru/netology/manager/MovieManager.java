package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
  private Movie[] items = new Movie[0];

  public void add(Movie item) {
    // создаём новый массив размером на единицу больше
    int length = items.length + 1;
    Movie[] tmp = new Movie[length];
    // itar + tab
    // копируем поэлементно
    // for (int i = 0; i < items.length; i++) {
    //   tmp[i] = items[i];
    // }
    System.arraycopy(items, 0, tmp, 0, items.length);
    // кладём последним наш элемент
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public Object getMovie() {
    Movie[] result = new Movie[items.length];
    // перебираем массив в прямом порядке
    // но кладём в результаты в обратном
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
      if (index>10){
        return result[10];
      }
      if (index<=10){
        return result;
      }
    }
    return result;
  }

}

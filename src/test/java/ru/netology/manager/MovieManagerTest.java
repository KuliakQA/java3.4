package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterObject;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    PosterObject movie1 = new PosterObject(1, 1, "URL", "Бладшот", "боевик");
    PosterObject movie2 = new PosterObject(2, 2, "URL", "Вперёд", "мультфильм");
    PosterObject movie3 = new PosterObject(3, 3, "URL", "Отель Белград", "комедия");
    PosterObject movie4 = new PosterObject(4, 4, "URL", "Джентльмены", "боевик");
    PosterObject movie5 = new PosterObject(5, 5, "URL", "Человек-невидимка", "ужасы");
    PosterObject movie6 = new PosterObject(6, 6, "URL", "Тролли. Мировой тур", "мультфильм");
    PosterObject movie7 = new PosterObject(7, 7, "URL", "Номер один", "комедия");
    PosterObject movie8 = new PosterObject(8, 8, "URL", "Властелин колец", "фэнтези");
    PosterObject movie9 = new PosterObject(9, 9, "URL", "Розовая пантера", "комедия");
    PosterObject movie10 = new PosterObject(10, 10, "URL", "Человек-паук", "боевик");
    PosterObject movie11 = new PosterObject(11, 11, "URL", "Лука", "мультфильм");

    @Test
    public void lastMovies11() {
        PosterManager manager = new PosterManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        PosterObject[] actual = manager.getLastMovies();
        PosterObject[] expected = new PosterObject[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovies10() {
        PosterManager manager = new PosterManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        PosterObject[] actual = manager.getLastMovies();
        PosterObject[] expected = new PosterObject[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies5() {
        PosterManager manager = new PosterManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        PosterObject[] actual = manager.getLastMovies();
        PosterObject[] expected = new PosterObject[]{movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Movies3() {
        PosterManager manager = new PosterManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        PosterObject[] actual = manager.getLastMovies();
        PosterObject[] expected = new PosterObject[]{movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void viewMovie() {
        PosterManager manager = new PosterManager();
        manager.add(movie2);
        manager.add(movie7);
        PosterObject[] actual = manager.getLastMovies();
        PosterObject[] expected = new PosterObject[]{movie7, movie2};
        assertArrayEquals(expected, actual);
    }
}
package ru.netology.manager;
import ru.netology.domain.PosterObject;

public class PosterManager {
    private PosterObject[] movies = new PosterObject[0];
    private int MovieAmount = 10;

    public PosterManager() {
    }

    public PosterManager(int MovieAmount) {
        this.MovieAmount = MovieAmount;
    }

    public void add(PosterObject item) {
        int length = movies.length + 1;
        PosterObject[] tmp = new PosterObject[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

//    public PosterObject[] getLastMovies() {
//        int resultLength;
//        if (MovieAmount > movies.length) {
//            resultLength = movies.length;
//        } else {
//            resultLength = MovieAmount;
//        }
//
//        PosterObject[] result = new PosterObject[resultLength];
//        for (int i = 0; i < resultLength; i++) {
//            int index = movies.length - i - 1;
//            result[i] = movies[index];
//        }
//        return result;
//    }

    public PosterObject[] getLastMovies() {
        int resultLength = Math.min(MovieAmount, movies.length);
        PosterObject[] result = new PosterObject[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        }
    }

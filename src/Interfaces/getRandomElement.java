package Interfaces;

import java.util.List;
import java.util.Random;

public interface getRandomElement {
    static <T> T getRandomElement(List<T> list) {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
    }


}

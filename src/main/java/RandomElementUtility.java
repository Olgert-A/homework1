import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Содержит вспомогательные методы для получения случайного элемента array или List
 */
public final class RandomElementUtility {
    private static final Random random = new Random();

    private RandomElementUtility() {}

    private static int getRandomIndex(int size) {
        if(size <= 0)
            throw new IllegalArgumentException("Size must be more than 0");

        return random.nextInt(size);
    }

    public static <T> T get(T[] array) {
        int randomIndex = RandomElementUtility.getRandomIndex(array.length);
        return array[randomIndex];
    }

    public static <T> T get(List<T> list) {
        int randomIndex = RandomElementUtility.getRandomIndex(list.size());
        return list.get(randomIndex);
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[] {1, 2, 3, 4, 5};
        String[] stringArray = new String[] {"this", "is", "the", "best", "code", "ever"};

        List<Integer> integerList = Arrays.asList(intArray);
        List<String> stringList = Arrays.asList(stringArray);

        System.out.println(RandomElementUtility.get(intArray));
        System.out.println(RandomElementUtility.get(integerList));
        System.out.println(RandomElementUtility.get(stringList));
    }
}

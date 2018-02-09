package utils;

import java.util.Random;

/**
 * @author huhongsen
 * @date 2018/2/7
 * 随机数工具类
 */
public class RandomUtils {

    /**
     * 获取随机数数组(不重复)
     *
     * @param size       数组大小 必须奥比randomSize小或相等
     * @param randomSize 随机范围 [0,randomSize)
     * @return
     */
    public static int[] randomIndex(int size, int randomSize) {
        if (size > randomSize) {
            throw new RuntimeException("size > randomSize err...");
        }
        int[] randomIndex = new int[size];
        boolean[] randomFlag = new boolean[randomSize];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomCount = random.nextInt(size);
            if (randomFlag[randomCount]) {
                i--;
                continue;
            }
            randomFlag[randomCount] = true;
            randomIndex[i] = randomCount;
        }
        return randomIndex;
    }

    /**
     * 获取随机数数组
     *
     * @param size       数组大小
     * @param randomSize 随机数范围 [)
     * @return
     */
    public static int[] randomNumber(int size, int randomSize) {
        int[] randomNumber = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomCount = random.nextInt(randomSize);
            randomNumber[i] = randomCount;
        }
        return randomNumber;
    }

}

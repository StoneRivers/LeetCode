package me.stonerivers.util;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Zhangyuanan
 * @version 1.0
 * @since 2019-07-14
 */
public class ListUtil {

    public static <T> LinkedList<T> makeLinkedList(T... array) {
        LinkedList<T> result = new LinkedList<T>();
        result.addAll(Arrays.asList(array));
        return result;
    }

}

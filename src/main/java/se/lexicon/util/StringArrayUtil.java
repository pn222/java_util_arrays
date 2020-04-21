package se.lexicon.util;

import java.util.Arrays;

public class StringArrayUtil {

    public static String[] add(final String[] source, String toAdd){
        String[] newArray = Arrays.copyOf(source, source.length + 1);
        int offSet = newArray.length-1;
        newArray[offSet]=toAdd;
        return newArray;

    }
    //[A, B] [C, D, E]
    // 0 1   2    3    4
    //[A, B, null, null, null]
    public static String[] addMany(String[] source, String[] toAdd){
        String[] newArray = Arrays.copyOf(source, source.length + toAdd.length);
        int offSet = source.length;
        for(int write= offSet, read = 0; write<newArray.length; write++, read++){
            newArray[write] = toAdd[read];
        }
        return newArray;
    }

    public static String[] addAndSort(final String[] source, String toAdd){
        source = add(source, toAdd);
        sort(source);
        return source;

    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }
}

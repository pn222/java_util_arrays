package se.lexicon.util;

import org.junit.Assert;
import org.junit.Test;

public class StringArrayUtilTest {

    @Test
    public void given_empty_array_and_string_add_return_array_with_string(){
        String string = "Test";
        String[] emptyArray = new String[0];
        String[] expected = {"Test"};

        String[] result = StringArrayUtil.add(emptyArray, string);

        Assert.assertArrayEquals(expected, result);

    }
    @Test
    public void test_addAndSort(){
        String string2 = "Albert";
        String string1 = "Martin";
        String[] source = new String[0];
        String[] expected = {"Albert", "Martin"};

        String[]result = StringArrayUtil.addAndSort(source, string1);
        result = StringArrayUtil.addAndSort(result, string2);

        Assert.assertArrayEquals(expected, result);

    }
    @Test
    public void test_addMany(){
        String[] source = {"Erik", "Carl"};
        String[] toAdd = {"Mattias", "Georgi", "Huiyi"};
        String[] expected = {"Erik", "Carl", "Mattias", "Georgi", "Huiyi"};

        String[] result = StringArrayUtil.addMany(source,toAdd);
        Assert.assertArrayEquals(expected, result);

    }
}

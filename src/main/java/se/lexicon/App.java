package se.lexicon;

import se.lexicon.util.StringArrayUtil;

import java.util.Arrays;

/**
 @author blubb
 * 1. Create expanding array
 * 2. Sort array
 * 3. toString representation
 * 4.
 */
public class App 
{
    public static void main( String[] args ) {
        String[] names = new String[0];
        names = StringArrayUtil.add(names, toAdd: "Mattias Andersson");
        names = StringArrayUtil.add(names, toAdd: "Michelle Johansson");
        names = StringArrayUtil.addAndSort(names, toAdd: "Ameer Rasheed");

        System.out.println(Arrays.toString(names));

    }
}

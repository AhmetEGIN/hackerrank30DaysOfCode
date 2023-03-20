package day27_Testing;

import java.util.Arrays;
import java.util.LinkedHashSet;

class TestDataEmptyArray{
    public static int[] get_array(){
        int[] array = new int[0];
        return array;
    }
}
class TestDataUniqueValues{
    static int[] array = {2,4,5,6,7,9};
    
    public static int[] get_array(){
        return array;
    }
    public static int get_expected_result(){
        int temp = array[0];
        int tempIndex = 0;
        for(int i =1 ; i<array.length; i++){
            if (array[i] < temp) {
                temp = array[i];
                tempIndex = i;
            }
            
        }
        return tempIndex;
        
    }
    
}

class TestDataExactlyTwoDifferentMinimums{
    static int[] array = {2,2,4,5,6,7,9};
    
    public static int[] get_array(){
        return array;
    }
    public static int get_expected_result(){
        int temp = array[0];
        int tempIndex = 0;
        for(int i =1 ; i<array.length; i++){
            if (array[i] < temp) {
                temp = array[i];
                tempIndex = i;
            }
            
        }
        return tempIndex;
        
    }
}

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    
	public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}

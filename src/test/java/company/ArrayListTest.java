package company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {

    private ArrayList<Integer> arrayList;

    @Before
    public void setUp() throws Exception {
        arrayList = new ArrayList<>();
    }

    @Test
    public void testAddToTheEndOfArrayList() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int expectedResult = 5;
        int actualResult = arrayList.size();
        Assert.assertEquals(expectedResult,  actualResult);

    }

    @Test
    public void testAddByIndex() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int index = 3;
        Integer value = 5;
        arrayList.add(index, value);
        Assert.assertEquals(value, arrayList.get(index));
    }

    @Test
    public void testGetByIndex() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Integer expectedResult = 2;
        Assert.assertEquals(expectedResult, arrayList.get(1));
    }

    @Test
    public void testRemoveByIndex() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Integer expectedResult = 3;
        arrayList.remove(1);
        Assert.assertEquals(expectedResult, arrayList.get(1));
    }

}
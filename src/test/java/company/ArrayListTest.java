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
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
    }

    @Test
    public void testSizeIncrease() {
        arrayList.add(7);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, arrayList.size());
    }

    @Test
    public void testSizeDecrease() {
        arrayList.remove(4);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, arrayList.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSizeByNegativeScenario() {
        int expectedResult = 0;
        arrayList.remove(0);
        arrayList.remove(1);
        arrayList.remove(2);
        arrayList.remove(3);
        arrayList.remove(4);
        arrayList.size();
    }

    @Test
    public void testAddToTheEndOfArrayList() {
        arrayList.add(6);
        int expectedResult = 6;
        int actualResult = arrayList.get(arrayList.size() - 1);
        Assert.assertEquals(expectedResult,  actualResult);

    }

    @Test
    public void testAddByIndex() {
        int index = 3;
        Integer value = 5;
        arrayList.add(index, value);
        Assert.assertEquals(value, arrayList.get(index));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddByNegativeScenario() {
        int index = 6;
        Integer value = 5;
        arrayList.add(index, value);
    }

    @Test
    public void testGetByIndex() {
        Integer expectedResult = 2;
        Assert.assertEquals(expectedResult, arrayList.get(1));
    }

    @Test
    public void testGetByNegativeScenario() {
        Assert.assertEquals(null, arrayList.get(6));
    }

    @Test
    public void testRemoveByIndex() {
        Integer expectedResult = 3;
        arrayList.remove(1);
        Assert.assertEquals(expectedResult, arrayList.get(1));
    }

    @Test
    public void testRemoveByNegativeScenario() {
        arrayList.remove(4);
        Assert.assertEquals(null, arrayList.get(4));
    }

}
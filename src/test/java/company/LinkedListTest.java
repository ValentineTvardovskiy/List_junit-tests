package company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
    }

    @Test
    public void testSizeIncrease() {
        linkedList.add(4);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, linkedList.size());
    }

    @Test
    public void testSizeDecrease() {
        linkedList.remove(1);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, linkedList.size());
    }

    @Test
    public void testAddByValue() {
        int expectedResult = 3;
        int actualResult = linkedList.size();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGetByIndex() {
        Integer expectedResult = 3;
        Assert.assertEquals(expectedResult, linkedList.get(2));
    }

    @Test
    public void testRemoveByIndexThatLastElementShifted() {
        Integer expectedResult = 3;
        linkedList.remove(1);
        Assert.assertEquals(expectedResult, linkedList.get(1));
    }

    @Test
    public void testRemoveByValue() {
        Integer expectedResult = 3;
        linkedList.remove(Integer.valueOf(2));
        Assert.assertEquals(expectedResult, linkedList.get(1));
    }

}
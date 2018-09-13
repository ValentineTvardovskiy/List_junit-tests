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
    }

    @Test
    public void testAddByValue() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int expectedResult = 3;
        int actualResult = linkedList.size();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGetByIndex() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Integer expectedResult = 3;
        Assert.assertEquals(expectedResult, linkedList.get(2));
    }

    @Test
    public void testRemoveByIndexThatLastElementShifted() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Integer expectedResult = 3;
        linkedList.remove(1);
        Assert.assertEquals(expectedResult, linkedList.get(1));
    }

    @Test
    public void testRemoveByValue() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        Integer expectedResult = 3;
        linkedList.remove(Integer.valueOf(2));
        Assert.assertEquals(expectedResult, linkedList.get(1));
    }

}
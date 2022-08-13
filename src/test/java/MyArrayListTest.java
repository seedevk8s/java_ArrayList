import kr.ac.ezenac.list.IList;
import kr.ac.ezenac.list.MyArrayList;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void add() {
        IList<Integer> ezen = new MyArrayList<>();
        for (int i=0; i<50; i++) {
            ezen.add(i);
            assertEquals(i+1, ezen.size());
            assertEquals(i, ezen.get(i));
        }
    }

    @Test
    public void clear() {
        IList<Integer> ezen =  new MyArrayList<>();

        for (int i = 0; i < 100; i++) {
            ezen.add(i);
        }

        assertEquals(100, ezen.size());
        assertFalse(ezen.isEmpty());
        ezen.clear();
        assertEquals(0, ezen.size());
        assertTrue(ezen.isEmpty());
    }

    @Test
    public void deleteByIndex() {
        IList<Integer> ezen = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            ezen.add(i);
        }

        Random random = new Random();
        int ezenIndex = random.nextInt(99);
        int expected = ezen.get(ezenIndex + 1);
        ezen.deleteByIndex(ezenIndex);
        assertEquals(expected, ezen.get(ezenIndex));
    }
}
















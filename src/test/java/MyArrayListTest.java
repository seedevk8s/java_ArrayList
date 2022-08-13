import kr.ac.ezenac.list.IList;
import kr.ac.ezenac.list.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

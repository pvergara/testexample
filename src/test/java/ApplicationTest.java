import com.nttdata.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {
    @Test
    void theNumberTwoIsEven(){
        //Arrange
        int number = 2;

        //Act
        boolean result = Util.isEvenNumber(number);

        //Assertion
        assertTrue(result);
    }

    @Test
    void theNumberOneIsOdd(){
        //Arrange
        int number = 1;

        //Act
        boolean result = Util.isEvenNumber(number);

        //Assertion
        assertFalse(result);
    }

}

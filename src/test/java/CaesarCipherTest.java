import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberOfTimesAtEndOfAlphabet_char(){
        char input='x';
        char expectedOutput='h';
        assertEquals(expectedOutput, CaesarCipher.cipher(input, 10));
    }
    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberOfTimes_char(){
        char input='b';
        char expectedOutput='i';

        assertEquals(expectedOutput, CaesarCipher.cipher(input, 7));
    }
}
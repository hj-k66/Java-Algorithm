package week5.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    void bracket(){
        SolveBracket solveBracket = new SolveBracket();

        assertTrue(solveBracket.solution("()()"));
        assertTrue(solveBracket.solution("(())()"));
        assertFalse(solveBracket.solution(")()("));
        assertFalse(solveBracket.solution("(()("	));

    }


}
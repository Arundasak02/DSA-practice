package dev.practice.deliveryhero.strings.p39;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.math.*;

@Tag("practice")
@Tag("strings")
@Timeout(10)
class MaskAlternateCharactersTest {
    private final MaskAlternateCharacters sut = new MaskAlternateCharacters();
    @Test
    void twoWords() throws Exception {
        assertEquals("h*l*o w*r*d",sut.mask("hello world",'*'));
    }

    @Test
    void whitespace() throws Exception {
        assertEquals(" a*\tb*d \n",sut.mask(" ab\tbed \n",'*'));
    }

    @Test
    void empty() throws Exception {
        assertEquals("",sut.mask("",'*'));
    }

    @Test
    void singleLetters() throws Exception {
        assertEquals("a b c",sut.mask("a b c",'#'));
    }

    @Test
    void punctuation() throws Exception {
        assertEquals("a#b#",sut.mask("a,b!",'#'));
    }

    @Test
    void unicode() throws Exception {
        assertEquals("ab".charAt(0)+"*\u2003c*",sut.mask("ab\u2003cd",'*'));
    }
}

package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    static final Sample sample = new Sample();

    @org.junit.jupiter.api.Test
    void Multiplication() {
        assertEquals(81, sample.op(Sample.Operation.MULT, 9, 9));
    }

    @org.junit.jupiter.api.Test
    void Addition() {
        assertEquals(25, sample.op(Sample.Operation.ADD, 15,10));
    }

    @Test
    void factorielZero() {
        assertEquals(6, sample.fact(3));
    }

    @Test
    void factorielNegatif() {
        assertThrows(IllegalArgumentException.class, () -> sample.fact(-1));
    }
}

package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testIfWillThrowException() {

        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 6));
    }
    @Test
    void testIfWontThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 6));
    }
    @Test
    public void testThrowExceptionAllCase() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(5, 6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 6)));

    }
}


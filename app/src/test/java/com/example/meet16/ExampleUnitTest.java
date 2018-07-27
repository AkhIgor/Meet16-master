package com.example.meet16;

import android.app.Instrumentation;
import android.arch.persistence.room.Database;
import android.content.Context;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void write_isCorrect() throws Exception {
        MainActivity mainActivity = new MainActivity();
        Class factoryClass = mainActivity.getClass();

        int result = -1;
        try {
            Field field = factoryClass.getDeclaredField("resultView");
            field.setAccessible(true);
            result = (int) field.get(mainActivity);
            field.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            fail(e.getMessage());
        }

        assertEquals(result, 0);
    }
}
package io.github.the28awg.okato;

import org.junit.Test;

/**
 * Copyright (c) 2016 Ruslan Gabdrafikov <the28awg@gmail.com>
 * You may obtain a copy of the License at LICENSE.txt
 * <p>
 * Created by The28AWG on 01.10.16.
 */
public class AppTest {

    private static final String TOKEN = "";
    @Test
    public void test_1_find_city() {
        String[] args = new String[] {"-token", TOKEN, "-t", "city", "-q", "Уфа"};
        App.main(args);
    }

    @Test
    public void test_1_find_street() {
        String[] args = new String[] {"-token", TOKEN, "-t", "street", "-c", "0200000100000", "-q", "Байкаринская"};
        App.main(args);
    }
}

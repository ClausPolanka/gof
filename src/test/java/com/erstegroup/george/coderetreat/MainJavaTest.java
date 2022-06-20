package com.erstegroup.george.coderetreat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainJavaTest {

    @Test
    public void test() {
        assertThat("Hello George").hasSize(12);
    }

}
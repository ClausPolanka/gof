package com.erstegroup.george.coderetreat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MainKotlinKtTest {

    @Test
    fun test() {
        assertThat("Hello George").hasSize(12)
    }
}

package com.rstraub.sandbox.yahtzee

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class YahtzeeTest {
  @Test
  fun `chance returns sum of all dices`() {
    Yahtzee.score(1, 2, 3, 4, 5) shouldBe 15
  }
}

object Yahtzee {
  fun score(dice1: Int, dice2: Int, dice3: Int, dice4: Int, dice5: Int): Int {
    return dice1 + dice2 + dice3 + dice4 + dice5
  }
}

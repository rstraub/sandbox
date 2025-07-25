package com.rstraub.sandbox.yahtzee

import com.rstraub.sandbox.yahtzee.ScoreType.CHANCE
import com.rstraub.sandbox.yahtzee.ScoreType.YAHTZEE
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class YahtzeeTest {
  @Test
  fun `chance returns sum of all dices`() {
    Yahtzee.score(1, 2, 3, 4, 5, CHANCE) shouldBe 15
  }

  @Test
  fun `yahtzee returns score of 50 given all the same numbers`() {
    Yahtzee.score(1, 1, 1, 1, 1, YAHTZEE) shouldBe 50
  }

  @Test
  fun `yahtzee returns score of 0 given the numbers are not the same`() {
    Yahtzee.score(1, 1, 1, 1, 2, YAHTZEE) shouldBe 0
  }
}

enum class ScoreType {
  CHANCE,
  YAHTZEE
}

object Yahtzee {
  fun score(dice1: Int, dice2: Int, dice3: Int, dice4: Int, dice5: Int, scoreType: ScoreType): Int {
    val dices = listOf(dice1, dice2, dice3, dice4, dice5)

    if (scoreType == CHANCE) return dices.sum()

    val isYahtzee = dices.distinct().size == 1
    if (isYahtzee) return 50

    return 0
  }
}

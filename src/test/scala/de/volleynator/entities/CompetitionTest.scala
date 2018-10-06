package de.volleynator.entities

import java.time.LocalDateTime

import de.volleynator.events.{CompetitionCreated, CompetitionType}
import org.scalatest.{FlatSpecLike, Matchers}

class CompetitionTest extends FlatSpecLike with Matchers {

  val competitionCreated = CompetitionCreated(name = "CompetitionName", season = "2018/2019", CompetitionType("", ""), "", LocalDateTime.MIN)
  val competition = Competition("", "", true, "", "", "", LocalDateTime.MAX)


  "A Competition" should "merge updatedAt" in {
    val mergedCompetition = competition + competitionCreated

    mergedCompetition.updatedAt shouldBe LocalDateTime.MIN
  }

  it should "merge name" in {
    val mergedCompetition = competition + competitionCreated

    mergedCompetition.name shouldBe "CompetitionName"
  }

  it should "merge season" in {
    val mergedCompetition = competition + competitionCreated

    mergedCompetition.season shouldBe "2018/2019"
  }
}

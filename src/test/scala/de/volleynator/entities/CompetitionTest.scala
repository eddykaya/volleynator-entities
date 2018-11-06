package de.volleynator.entities

import java.time.LocalDateTime

import de.volleynator.events.{CompetitionCreated, CompetitionEvent, CompetitionType}
import org.scalatest.{FlatSpecLike, Matchers}

class CompetitionTest extends FlatSpecLike with Matchers {

  val competitionCreated = CompetitionCreated(id = "1", name = "CompetitionName", season = "2018/2019", CompetitionType("", ""), "", LocalDateTime.MIN)
  val competition = Competition("", "", true, "", "", "", new CompetitionType("",""))(LocalDateTime.MAX)


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

  it should "return itself for unknown event" in {
    val mergedCompetition = competition + new CompetitionEvent {}

    mergedCompetition shouldBe competition
  }

  it should "ignore updated at on equality check" in {
    val competition1 = Competition("", "", true, "", "", "", new CompetitionType("",""))(LocalDateTime.MAX)
    val competition2 = Competition("", "", true, "", "", "", new CompetitionType("",""))(LocalDateTime.MIN)

    competition1 shouldBe competition2
  }
}

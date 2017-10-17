package de.volleynator.entities

import java.time.{LocalDate, LocalTime}

import org.scalatest.{FlatSpecLike, Matchers}

class MatchPlanTest extends FlatSpecLike
  with Matchers {

  "A MatchPlan" should "add a match to itself" in {
    val m1: Match = Match("","", "", LocalDate.now(), "", "", "", "", "", LocalTime.now())
    val mp1: MatchPlan = MatchPlan(Set())
    val mp2: MatchPlan = MatchPlan(Set(m1))

    val mergedMatchPlans = mp1 + mp2

    mergedMatchPlans.matches should contain allElementsOf Set(m1)
  }

  it should "add the newer match if already there" in {
    val m1: Match = Match("1","", "", LocalDate.now(), "", "", "", "", "", LocalTime.now())
    val m2: Match = Match("1","", "", LocalDate.now(), "", "", "", "3:0 (25:0,25:0,25:0)", "", LocalTime.now())

    val mp1: MatchPlan = MatchPlan(Set(m1))
    val mp2: MatchPlan = MatchPlan(Set(m2))

    val mergedMatchPlans = mp1 + mp2

    mergedMatchPlans.matches should contain allElementsOf Set(m2)
    mergedMatchPlans.matches shouldNot contain allElementsOf Set(m1)
  }

  it should "add different matches together" in {
    val m1: Match = Match("1", "", "", LocalDate.now(), "", "", "", "", "", LocalTime.now())
    val m2: Match = Match("2", "", "", LocalDate.now(), "", "", "", "3:0 (25:0,25:0,25:0)", "", LocalTime.now())

    val mp1: MatchPlan = MatchPlan(Set(m1))
    val mp2: MatchPlan = MatchPlan(Set(m2))

    val mergedMatchPlans = mp1 + mp2

    mergedMatchPlans.matches should contain allElementsOf Set(m1, m2)
  }

}

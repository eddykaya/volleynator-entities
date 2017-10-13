package de.volleynator.entities

import de.volleynator.entities.Match

import scala.collection.mutable.ListBuffer

case class MatchPlan(matches: Set[Match]) {
  def +(matchPlan: MatchPlan): MatchPlan = {

    val mergedMatches: ListBuffer[Match] = ListBuffer()

    mergedMatches ++= matchPlan.matches

    mergedMatches ++= matches.filter(m => !mergedMatches.map(_.matchNumber).contains(m.matchNumber))

    MatchPlan(mergedMatches.toSet)
  }
}

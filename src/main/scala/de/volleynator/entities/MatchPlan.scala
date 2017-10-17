package de.volleynator.entities

import scala.collection.mutable.ListBuffer

case class MatchPlan(matches: Set[Match]) {
  def +(matchPlan: MatchPlan): MatchPlan = {

    val mergedMatches: ListBuffer[Match] = ListBuffer()

    mergedMatches ++= matchPlan.matches

    mergedMatches ++= matches.filter(m => !mergedMatches.map(_.matchId).contains(m.matchId))

    MatchPlan(mergedMatches.toSet)
  }
}

package de.volleynator.events

import akka.persistence.journal.Tagged

case class CompetitionCreated(name: String, season: String, competitionType: CompetitionType) {

  def +(other: CompetitionCreated):CompetitionCreated = {
    CompetitionCreated(other.name, other.season, other.competitionType)
  }

  def tagged: Tagged = {
    return Tagged(this, Set("Competition", "CompetitionCreated"))
  }

}
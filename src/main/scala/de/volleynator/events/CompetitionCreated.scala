package de.volleynator.events

import akka.persistence.journal.Tagged

case class CompetitionCreated(name: String, season: String, competitionType: CompetitionType, association: String) {

  def +(other: CompetitionCreated):CompetitionCreated = {
    CompetitionCreated(other.name, other.season, other.competitionType, other.association)
  }

  def tagged: Tagged = {
    return Tagged(this, Set(association,"Competition", "CompetitionCreated"))
  }

}
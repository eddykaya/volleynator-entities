package de.volleynator.events

import java.time.LocalDateTime

import akka.persistence.journal.Tagged
import de.volleynator.entities.Competition

case class CompetitionUpdated(name: String, season: String, competitionType: CompetitionType, association: String, updatedAt: LocalDateTime) {
  def tagged: Tagged = {
    Tagged(this, Set(association,"Competition", "CompetitionCreated"))
  }

  def +(other: CompetitionCreated):CompetitionUpdated = {
    CompetitionUpdated(other.name, other.season, other.competitionType, other.association, other.updatedAt)
  }

  def +(other: CompetitionUpdated):CompetitionUpdated = {
    CompetitionUpdated(other.name, other.season, other.competitionType, other.association, other.updatedAt)
  }

}

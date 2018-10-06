package de.volleynator.events

import java.time.LocalDateTime

import akka.persistence.journal.Tagged

case class CompetitionCreated(name: String, season: String, competitionType: CompetitionType, association: String, updatedAt: LocalDateTime) {

  def +(other: CompetitionCreated):CompetitionCreated = {
    CompetitionCreated(other.name, other.season, other.competitionType, other.association, other.updatedAt)
  }

  def +(other: CompetitionUpdated):CompetitionCreated = {
    CompetitionCreated(other.name, other.season, other.competitionType, other.association, other.updatedAt)
  }

  def tagged: Tagged = {
    Tagged(this, Set(association,"Competition", "CompetitionCreated"))
  }

}
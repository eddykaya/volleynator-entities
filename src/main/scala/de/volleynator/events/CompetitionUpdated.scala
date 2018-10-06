package de.volleynator.events

import java.time.LocalDateTime

import akka.persistence.journal.Tagged

case class CompetitionUpdated(name: String, season: String, competitionType: CompetitionType, association: String, updatedAt: LocalDateTime) extends CompetitionEvent {
  def tagged: Tagged = {
    Tagged(this, Set(association,"Competition", "CompetitionCreated"))
  }
}

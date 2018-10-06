package de.volleynator.events

import java.time.LocalDateTime

import akka.persistence.journal.Tagged

case class CompetitionCreated(name: String, season: String, competitionType: CompetitionType, association: String, updatedAt: LocalDateTime) {
  def tagged: Tagged = {
    Tagged(this, Set(association, "Competition", "CompetitionCreated"))
  }
}
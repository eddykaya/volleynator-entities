package de.volleynator.entities

import java.time.LocalDateTime

import de.volleynator.events.{CompetitionCreated, CompetitionEvent, CompetitionType, CompetitionUpdated}

case class Competition(
                        id: String,
                        name: String,
                        season: String,
                        active: Boolean,
                        leagueUrl: String,
                        matchPlanUrl: String,
                        leagueName: String,
                        competitionType: CompetitionType
                      )(val updatedAt: LocalDateTime) {

  def +(competitionEvent: CompetitionEvent) = {
    competitionEvent match {
      case c: CompetitionCreated => Competition(c.id, c.name, c.season, true, "", "", c.name, c.competitionType)(c.updatedAt)
      case u: CompetitionUpdated => Competition(u.id, u.name, u.season, true, "", "", u.name, u.competitionType)(u.updatedAt)
      case _ => this
    }
  }

}


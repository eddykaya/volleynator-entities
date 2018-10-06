package de.volleynator.entities

import java.time.LocalDateTime

import de.volleynator.events.{CompetitionCreated, CompetitionEvent, CompetitionType, CompetitionUpdated}

case class Competition(
                        name: String,
                        season: String,
                        active: Boolean,
                        leagueUrl: String,
                        matchPlanUrl: String,
                        leagueName: String,
                        updatedAt: LocalDateTime,
                        competitionType: CompetitionType
                      ) {

  def +(competitionEvent: CompetitionEvent) = {
    competitionEvent match {
      case c: CompetitionCreated => Competition(c.name, c.season, true, "", "", c.name, c.updatedAt, c.competitionType)
      case u: CompetitionUpdated => Competition(u.name, u.season, true, "", "", u.name, u.updatedAt, u.competitionType)
      case _ => this
    }
  }

}


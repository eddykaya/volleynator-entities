package de.volleynator.entities

import java.time.LocalDateTime

import de.volleynator.events.{CompetitionCreated, CompetitionUpdated}

case class Competition(
                        name: String,
                        season: String,
                        active: Boolean,
                        leagueUrl: String,
                        matchPlanUrl: String,
                        leagueName: String,
                        updatedAt: LocalDateTime
                      ) {

  def +(competitionCreated: CompetitionCreated) = {
    Competition(competitionCreated.name, competitionCreated.season, true, "", "", competitionCreated.name, competitionCreated.updatedAt)
  }

  def +(competitionCreated: CompetitionUpdated) = {
    Competition(competitionCreated.name, competitionCreated.season, true, "", "", competitionCreated.name, competitionCreated.updatedAt)
  }

}


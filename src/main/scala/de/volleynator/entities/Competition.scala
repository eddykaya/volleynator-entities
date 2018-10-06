package de.volleynator.entities

import java.time.LocalDateTime

case class Competition(
                        name: String,
                        season: String,
                        active: Boolean,
                        leagueUrl: String,
                        matchPlanUrl: String,
                        leagueName: String,
                        updatedAt: LocalDateTime
                      )


package de.volleynator.entities

case class Competition(
                        name: String,
                        season: String,
                        active: Boolean,
                        leagueUrl: String,
                        matchPlanUrl: String,
                        leagueName: String
                      )


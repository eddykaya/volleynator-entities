package de.volleynator.entities

import java.time.{LocalDate, LocalTime}

case class Match(matchId: String,
                 matchNumber: String,
                 matchDay: String,
                 matchDate: LocalDate,
                 home: String,
                 guest: String,
                 venue: String,
                 resultSets: String,
                 resultPoints: String,
                 startTime: LocalTime)

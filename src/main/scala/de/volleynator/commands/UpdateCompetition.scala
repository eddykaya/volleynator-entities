package de.volleynator.commands

import java.time.LocalDateTime

import de.volleynator.events.CompetitionType

case class UpdateCompetition(id: String, name: String, season: String, competitionType: CompetitionType, association: String,updatedAt: LocalDateTime)

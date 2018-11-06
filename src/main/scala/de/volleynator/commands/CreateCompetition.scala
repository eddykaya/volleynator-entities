package de.volleynator.commands

import de.volleynator.events.CompetitionType

case class CreateCompetition(id: String, association: String, league: String, name: String, season: String, competitionType: CompetitionType)

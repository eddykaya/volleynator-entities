package de.volleynator.commands

import at.volleynator.events.CompetitionType

case class CreateCompetition(association: String, league: String, name: String, season: String, competitionType: CompetitionType)

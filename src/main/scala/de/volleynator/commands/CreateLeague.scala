package de.volleynator.commands

import de.volleynator.entities.Association

case class CreateLeague(association: Association, leagueName: String, season: String)

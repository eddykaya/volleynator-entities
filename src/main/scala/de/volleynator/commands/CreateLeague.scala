package de.volleynator.commands

import at.volleynator.entities.Association

case class CreateLeague(association: Association, leagueName: String, season: String)

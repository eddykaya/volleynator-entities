package de.volleynator.commands

import de.volleynator.entities.Match

case class UpdateMatchPlan(matches: Set[Match], season: String)

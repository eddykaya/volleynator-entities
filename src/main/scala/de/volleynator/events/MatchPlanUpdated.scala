package de.volleynator.events

import de.volleynator.entities.Match

case class MatchPlanUpdated(matches: Set[Match], season: String)

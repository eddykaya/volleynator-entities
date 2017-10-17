package de.volleynator.events

import de.volleynator.entities.Association

case class LeagueCreated(association: Association, leagueName: String, season: String) {

  def +(other: LeagueCreated): LeagueCreated = {
    LeagueCreated(other.association, other.leagueName, other.season)
  }

}
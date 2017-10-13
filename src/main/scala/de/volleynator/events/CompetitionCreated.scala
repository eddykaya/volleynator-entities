package de.volleynator.events

case class CompetitionCreated(name: String, season: String, competitionType: CompetitionType) {

  def +(other: CompetitionCreated):CompetitionCreated = {
    CompetitionCreated(other.name, other.season, other.competitionType)
  }

}
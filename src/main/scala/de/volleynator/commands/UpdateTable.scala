package de.volleynator.commands

import de.volleynator.entities.TableEntry

case class UpdateTable(tableEntries: List[TableEntry],association: String, league: String, competitionName: String)
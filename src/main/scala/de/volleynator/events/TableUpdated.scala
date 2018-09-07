package de.volleynator.events

import de.volleynator.entities.TableEntry

case class TableUpdated(tableEntries: Seq[TableEntry], season: String) {

  def +(tableUpdated: TableUpdated): TableUpdated = {
    tableUpdated
  }
}
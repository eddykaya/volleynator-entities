package de.volleynator.events

import de.volleynator.entities.TableEntry

case class TableUpdated(tableEntries: Seq[TableEntry]) {

  def +(tableUpdated: TableUpdated): TableUpdated = {
    tableUpdated
  }
}
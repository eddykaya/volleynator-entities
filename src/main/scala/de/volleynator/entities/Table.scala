package de.volleynator.entities

import java.time.{LocalDateTime, ZoneId}

case class Table(entries: Seq[TableEntry], dateTime: LocalDateTime = LocalDateTime.now(ZoneId.of("UTC")))

package de.volleynator.events

import akka.persistence.journal.Tagged

case class AssociationCreated(id: String, name: String) {
  require(id != null)
  require(name != null)

  def +(association: AssociationCreated): AssociationCreated = {
    association
  }

  def tagged: Tagged = {
    Tagged(this, Set(id,"Association", "AssociationCreated"))
  }

}
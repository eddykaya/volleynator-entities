package de.volleynator.events

case class AssociationCreated(id: String, name: String) {
  require(id != null)
  require(name != null)

  def +(association: AssociationCreated): AssociationCreated = {
    association
  }

}
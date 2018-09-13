package de.partyschaum.akka.iot

import akka.actor.{ActorSystem, Props}

object Main extends App {
  val system = ActorSystem("testSystem")

  val firstRef = system.actorOf(Props[PrintMyActorRefActor], "first-actor")
  println(s"First: $firstRef")

  firstRef ! "printit"

  system.terminate()
}

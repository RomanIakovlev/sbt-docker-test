package net.iakovlev.sbtdockertest

import sbt._
import sbt.Keys._
import sbtdocker._

object DockerScope {
  val dockerTask = taskKey[Unit]("")
}

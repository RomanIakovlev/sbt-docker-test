package net.iakovlev.sbtdockertest

import sbt._
import sbt.Keys._
import sbtdocker._

object DockerScope {
  lazy val dockerConfig = config("dockerConfig")
}

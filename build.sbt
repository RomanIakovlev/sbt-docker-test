import net.iakovlev.sbtdockertest.DockerScope._

scalaVersion := "2.11.8"

name := "sbt-docker-test"

enablePlugins(DockerPlugin)

inTask(dockerTask)(sbtdocker.DockerSettings.baseDockerSettings)

dockerfile in docker in dockerTask := new Dockerfile {
	from("busybox")
	entryPoint("echo", "scoped")
}

dockerfile in docker := new Dockerfile {
	from("busybox")
	entryPoint("echo", "unscoped")
}

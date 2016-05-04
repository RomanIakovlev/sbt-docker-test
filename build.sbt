import net.iakovlev.sbtdockertest.DockerScope._

scalaVersion := "2.11.8"

name := "sbt-docker-test"

enablePlugins(DockerPlugin)

inConfig(dockerConfig)(sbtdocker.DockerSettings.baseDockerSettings)

imageName in docker in dockerConfig := ImageName("sbt-docker-test-scoped")
imageName in docker := ImageName("sbt-docker-test-unscoped")

dockerfile in docker in dockerConfig := new Dockerfile {
	from("busybox")
	entryPoint("echo", "scoped")
}

dockerfile in docker := new Dockerfile {
	from("busybox")
	entryPoint("echo", "unscoped")
}

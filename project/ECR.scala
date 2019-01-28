import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import com.typesafe.sbt.packager.NativePackagerKeys

object ECR extends NativePackagerKeys {

  val registryUri = "804222503008.dkr.ecr.ap-northeast-1.amazonaws.com"

  def containerSettings = Seq(
    dockerBaseImage := "java:8-jdk-alpine",
    maintainer in Docker := "hoge",
    dockerRepository := Some(registryUri)
  )
}

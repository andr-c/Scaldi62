import com.typesafe.config.{ConfigFactory, ConfigResolveOptions}
import play.api.Environment
import play.modules.reactivemongo.ReactiveMongoApi
import scaldi.Injectable
import scaldi.play.ScaldiApplicationBuilder
import scala.collection.JavaConversions._

object Test extends App with Injectable {

  val conf = play.api.Configuration.from(ConfigFactory.load("test.conf")     .resolve(ConfigResolveOptions.defaults()).entrySet().map(e => (e.getKey, e.getValue.unwrapped)).toMap)

  implicit val injector = new ScaldiApplicationBuilder(Environment.simple(), conf).buildInj()
  val rm1 = inject[ReactiveMongoApi]
  val rm2 = inject[ReactiveMongoApi]
  println(rm1 == rm2)
}
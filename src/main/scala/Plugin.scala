import io.github.gitbucket.solidbase.model.Version
import io.github.mistier.kanban.controller.KanbanController

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "kanban"
  override val pluginName: String = "Kanban Plugin"
  override val description: String = "My First example of GitBucket plug-in"
  override val versions: List[Version] = List(new Version("1.0.0"))

  override val controllers = Seq(
    "/kanban" -> new KanbanController()
  )
}

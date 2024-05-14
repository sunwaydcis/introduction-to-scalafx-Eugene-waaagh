import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

object MyApp extends JFXApp {
  stage = new PrimaryStage() {
    title = "First Scala"

    scene = new Scene(500, 500) {

    }
  }

}
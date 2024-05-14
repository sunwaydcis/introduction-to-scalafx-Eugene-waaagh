import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage

object MyApp extends JFXApp {
  stage = new PrimaryStage() {
    title = "First Scala"
    width = 500
    height = 500
  }
}
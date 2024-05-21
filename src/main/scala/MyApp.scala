import scalafx.animation.FadeTransition
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.{Group, Scene}
import scalafx.scene.effect.DropShadow
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.{Font, Text}
import scalafx.util.Duration
import scalafx.Includes._
import scalafx.scene.image.{Image, ImageView}

object MyApp extends JFXApp {
  stage = new PrimaryStage() {
    title = "First Scala"

    val myFont = new Font("Candara", 24)
    val myDropShadow = new DropShadow(5, -4, 4, Color.Purple)
    val lecturer = new Image(getClass.getResourceAsStream("image.jpg"))
    scene = new Scene(500, 500) {
      content = List(
        new Group(
          new Text(30, 30, "hello how are you") {
            font = myFont
            effect = myDropShadow},
          new Text(30, 80, "good") {
            font = myFont
            effect = myDropShadow
          },
          new Rectangle() {
            x = 30
            y = 100
            width = 100
            height = 100
            fill = Color.Purple
            arcWidth = 20
            arcHeight = 30
          },
          new ImageView(lecturer) {
            x = 30
            y = 300
            fitWidth = 150
            fitHeight = 150
          }
        )
      )
      val myFadeTransition = new FadeTransition(new Duration(1000), content.get(0)) {
        fromValue = 0
        toValue = 1
        cycleCount = -1
        autoReverse = true
      }
      myFadeTransition.play()
    }


  }

}
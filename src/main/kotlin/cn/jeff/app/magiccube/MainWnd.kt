package cn.jeff.app.magiccube

import javafx.fxml.FXMLLoader
import javafx.scene.layout.BorderPane
import tornadofx.*

class MainWnd : View("3D魔方") {

	override val root: BorderPane
	private val j: MainWndJ

	init {
		primaryStage.isResizable = true

		val loader = FXMLLoader()
		root = loader.load(
			javaClass.getResourceAsStream(
				"MainWnd.fxml"
			)
		)
		j = loader.getController()
		j.k = this
	}

}

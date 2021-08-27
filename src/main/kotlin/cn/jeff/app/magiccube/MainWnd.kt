package cn.jeff.app.magiccube

import javafx.event.ActionEvent
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

	fun btnClick(actionEvent: ActionEvent) {
		when (actionEvent.source) {
			j.btn01 -> {
				j.label1.text = "点击了按钮。"
			}
			else -> {
				// 不会运行到这里
				throw Exception("意外！")
			}
		}
	}

}

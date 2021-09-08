package cn.jeff.app.magiccube

import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Group
import javafx.scene.PerspectiveCamera
import javafx.scene.SubScene
import javafx.scene.layout.BorderPane
import javafx.scene.paint.Color
import javafx.scene.paint.PhongMaterial
import javafx.scene.shape.Box
import javafx.scene.transform.Rotate
import javafx.scene.transform.Translate
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

		root.center {
			group {
				add(SubScene(Group().apply {
					// add(cam1)	// 这句有或者没有都一样行，例子中是有的，不明所以。
					add(Box(4.0, 5.0, 6.0).apply {
						material = PhongMaterial(Color.RED)
					})
				}, 640.0, 480.0).apply {
					fill = Color.AQUA
					camera = PerspectiveCamera(true).apply {
						transforms.addAll(
							Rotate(-30.0, Rotate.Y_AXIS),
							Rotate(-20.0, Rotate.X_AXIS),
							Translate(-0.0, 0.0, -15.0)
						)
					}
				})
			}
		}
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

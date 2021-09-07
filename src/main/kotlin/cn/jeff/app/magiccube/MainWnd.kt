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

//		j.myBox.material = PhongMaterial(Color.RED)
//		val camera = PerspectiveCamera().apply {
//			transforms.addAll(
//				Rotate(-30.0, Rotate.Y_AXIS),
//				Rotate(-20.0, Rotate.X_AXIS),
//				Translate(0.0, 0.0, -15.0)
//			)
//		}
//		j.mainGroup.add(camera)
//		j.mainGroup.add(SubScene(j.mainGroup, 300.0, 300.0).apply {
//			fill = Color.ALICEBLUE
//			this.camera = camera
//		})

		j.subScn.root = group {
			add(Box(4.0, 5.0, 6.0).apply {
				material = PhongMaterial(Color.RED)
			})
		}
		j.subScn.camera = PerspectiveCamera(true).apply {
			transforms.addAll(
				Rotate(-30.0, Rotate.Y_AXIS),
				Rotate(-20.0, Rotate.X_AXIS),
				Translate(0.0, 0.0, -15.0)
			)
		}

		/*
		val cam1 = PerspectiveCamera(true).apply {
			transforms.addAll(
				Rotate(-30.0, Rotate.Y_AXIS),
				Rotate(-20.0, Rotate.X_AXIS),
				Translate(-0.0, 0.0, -15.0)
			)
		}
		val g1 = Group().apply {
			// add(cam1)	// 这句有或者没有都一样行，例子中是有的，不明所以。
			add(Box(4.0, 5.0, 6.0).apply {
				material = PhongMaterial(Color.RED)
			})
		}

		root.center {
			group {
				add(SubScene(g1, 300.0, 300.0).apply {
					fill = Color.AQUA
					camera = cam1
				})
			}
		}
		*/
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

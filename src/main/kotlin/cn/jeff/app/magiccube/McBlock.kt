package cn.jeff.app.magiccube

import javafx.scene.Group
import javafx.scene.paint.Color
import javafx.scene.paint.PhongMaterial
import javafx.scene.shape.Box
import javafx.scene.transform.Translate
import tornadofx.*

class McBlock : Group() {

	init {
		add(Box(5.0, 5.0, 2.0).apply {
			transforms.add(Translate(0.0, 0.0, 1.5))
			material = PhongMaterial(Color.GREEN)
		})
		add(Box(5.0, 5.0, 2.0).apply {
			transforms.add(Translate(0.0, 0.0, -1.5))
			material = PhongMaterial(Color.BLUE)
		})
	}

}

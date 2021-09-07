package cn.jeff.app.magiccube;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Box;

public class MainWndJ {

	public MainWnd k;

	public Label label1;
	public Button btn01;
	public Group mainGroup;
	public Box myBox;
	public Box box2;
	public SubScene subScn;

	public void btnClick(ActionEvent actionEvent) {
		k.btnClick(actionEvent);
	}

}

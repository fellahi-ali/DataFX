package org.datafx.controller.flow.action;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that adds a back action to the annotated node. The action will navigate to the last view in a flow.
 * The node value must be injected from fxml. Therefore the BackAction should be always used in combination with the
 * {@link javafx.fxml.FXML} annotation.
 * If a node that extends {@link javafx.scene.control.ButtonBase} or {@link javafx.scene.control.MenuItem} then the back
 * action will be triggered whenever the node fires an action event. Otherwise the action will be triggered when the
 * node is clicked.
 */
@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BackAction {

}

/**
 * 
 */
/**
 * @author Dell
 *
 */
module AimsProject {
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.swing;
	requires java.desktop;
	opens hust.soict.dsai.aims.screen to javafx.graphics,javafx.fxml;
	opens hust.soict.dsai.aims.media to javafx.base;
}

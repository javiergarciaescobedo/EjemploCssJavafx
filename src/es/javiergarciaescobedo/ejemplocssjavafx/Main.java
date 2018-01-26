package es.javiergarciaescobedo.ejemplocssjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        Button btnEstilo1 = new Button();
        btnEstilo1.setText("Estilo 1");
        // Asignar un identificador para la hoja de estilos
        btnEstilo1.setId("boton1"); 
        btnEstilo1.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                // Limpiar los estilos que tuviera anteriormente
                scene.getStylesheets().clear();
                // Aplicar la hoja de estilos
                scene.getStylesheets().add(
                    getClass().getResource("resources/css/estilo1.css").toExternalForm());                 
            }
        });
        
        Button btnEstilo2 = new Button();
        btnEstilo2.setText("Estilo 2");
        // Asignar un identificador para la hoja de estilos
        btnEstilo2.setId("boton2"); 
        btnEstilo2.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                // Limpiar los estilos que tuviera anteriormente
                scene.getStylesheets().clear();
                // Aplicar la hoja de estilos
                scene.getStylesheets().add(
                    getClass().getResource("resources/css/estilo2.css").toExternalForm());                 
            }
        });
        
        Button btnEstilo3 = new Button();
        btnEstilo3.setText("Sin estilo");
        // Asignar un identificador para la hoja de estilos
        btnEstilo3.setId("boton3"); 
        btnEstilo3.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                // Limpiar los estilos que tuviera anteriormente
                scene.getStylesheets().clear();
            }
        });
        
        // Organizar los elementos en la ventana
        HBox panelBotones = new HBox();
        panelBotones.setSpacing(20);
        panelBotones.setAlignment(Pos.CENTER);
        root.getChildren().add(panelBotones);
        panelBotones.getChildren().add(btnEstilo1);
        panelBotones.getChildren().add(btnEstilo2);
        panelBotones.getChildren().add(btnEstilo3);
        
        primaryStage.setTitle("Ejemplo de uso de CSS en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

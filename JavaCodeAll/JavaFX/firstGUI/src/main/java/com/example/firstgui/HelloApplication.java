package com.example.firstgui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args); // launch which a static method form application will automatically call start method
    }

    // cause Application is abstract class so we have to override start method
    @Override
    public void start(Stage stage) throws Exception {
    // Class 01
        /*
        Group root  = new Group(); // Group is one type of root
        Scene scene = new Scene(root, Color.BLACK); // scene need root

        stage.setTitle("Stage Demo Program!!!");
//        stage.getIcons();  <- 用於設定window 下視窗左上角的圖示  但mac沒有
        // 設定show完之後視窗大小 可以在Scene丟參數如上
        stage.setWidth(420);
        stage.setHeight(420);
        // 不想讓視窗可以縮放 不打是默認可以縮放
        stage.setResizable(false);
        // 設定show完之後視窗顯示在螢幕的什麼位置 不打默認在中間
        stage.setX(50);
        stage.setX(50);

        // 全螢幕
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press \"q\" to escape full screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); // 設定跳出按鍵

        stage.setScene(scene);
        stage.show(); // show on the screen

         */

        // Class 02
    /*
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.SKYBLUE);

    // Text
        Text text = new Text();
        text.setText("Wooooo!!!");
        // Test location
        text.setX(50);
        text.setY(50);
        // Font
        text.setFont(Font.font("Verdana", 50)); // 字型 大小
        text.setFill(Color.LIGHTSEAGREEN); // 字的顏色

        root.getChildren().add(text); // 將text放入root中

    // Line
        Line line = new Line();
        // 兩點畫一線
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);

        line.setStroke(Color.RED);
        line.setStrokeWidth(5);
        // 透明度
        line.setOpacity(0.5); // 0~1
        line.setRotate(50); // 旋轉50度

        root.getChildren().add(line);

    // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(300);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.GRAY);

        root.getChildren().add(rectangle);

    // 用Polygon 畫triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll( // 必須為Double
                200.0, 200.0,  //  第一個點
                300.0, 300.0, // 第二個點
                200.0, 300.0 // 第三個點
        );
        triangle.setFill(Color.YELLOW);

        root.getChildren().add(triangle);

    // Circle
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(400);
        circle.setFill(Color.BROWN);
        circle.setRadius(90);

        root.getChildren().add(circle);

    // Image  目前不清楚為何圖片會失效
//        Image image = new Image("/Users/lindazhong/Documents/JavaCodeAll/JavaFX/firstGUI/src/main/java/image001.png");
//        // 必需放入 ImageView裡
//        ImageView imageView = new ImageView(image);
//        imageView.setX(400);
//        imageView.setY(400);
//
//        root.getChildren().add(imageView);



        stage.setScene(scene);
        stage.show();

     */
    }
}
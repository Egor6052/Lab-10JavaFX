package com.example.laba10javafx;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Семенов Егор АТ-212
 *
 * Добавить GUI отображения данных
 * в виде отдельного класса (использовать JavaFX или Swing).
 * Добавить в виде отдельного класса GUI для табличного отображения полученных данных.
 * Использовать шаблон MVC или MVP.
 * Реализовать возможность поиска (фильтрации) табличных данных по нескольким
 * столбцам из GUI и отображения результатов в той же таблице.
 *
 */
public class HelloApplication extends Application {
    TrianglesList usualTrianglesList = new TrianglesList();
    TrianglesList usualRightTrianglesList = new TrianglesList();

    @Override
    public void start(Stage stage) {
        TableView<Triangle> table = new TableView<Triangle>();

        TableColumn<Triangle, String> coordinatesCol = new TableColumn<Triangle, String>("Coordinates");
        TableColumn<Triangle, String> x1Col = new TableColumn<Triangle, String>("x1");
        TableColumn<Triangle, String> y1Col = new TableColumn<Triangle, String>("y1");
        TableColumn<Triangle, String> x2Col = new TableColumn<Triangle, String>("x2");
        TableColumn<Triangle, String> y2Col = new TableColumn<Triangle, String>("y2");
        TableColumn<Triangle, String> x3Col = new TableColumn<Triangle, String>("x3");
        TableColumn<Triangle, String> y3Col = new TableColumn<Triangle, String>("y3");
        TableColumn<Triangle, String> aSideCol = new TableColumn<Triangle, String>("aSide");
        TableColumn<Triangle, String> bSideCol = new TableColumn<Triangle, String>("bSide");
        TableColumn<Triangle, String> cSideCol = new TableColumn<Triangle, String>("cSide");
        TableColumn<Triangle, String> angle1Col = new TableColumn<Triangle, String>("Angle1");
        TableColumn<Triangle, String> angle2Col = new TableColumn<Triangle, String>("Angle2");
        TableColumn<Triangle, String> angle3Col = new TableColumn<Triangle, String>("Angle3");
        TableColumn<Triangle, String> perimeterCol = new TableColumn<Triangle, String>("Perimeter");
        TableColumn<Triangle, String> squareCol = new TableColumn<Triangle, String>("Square");

        coordinatesCol.getColumns().addAll(x1Col, y1Col, x2Col, y2Col, x3Col, y3Col);
        table.getColumns().addAll(coordinatesCol, aSideCol, bSideCol, cSideCol, angle1Col, angle2Col, angle3Col, perimeterCol, squareCol);

        x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        aSideCol.setCellValueFactory(new PropertyValueFactory<>("ASideSize"));
        bSideCol.setCellValueFactory(new PropertyValueFactory<>("BSideSize"));
        cSideCol.setCellValueFactory(new PropertyValueFactory<>("CSideSize"));
        angle1Col.setCellValueFactory(new PropertyValueFactory<>("A1Angle"));
        angle2Col.setCellValueFactory(new PropertyValueFactory<>("A2Angle"));
        angle3Col.setCellValueFactory(new PropertyValueFactory<>("A3Angle"));
        perimeterCol.setCellValueFactory(new PropertyValueFactory<>("Perimeter"));
        squareCol.setCellValueFactory(new PropertyValueFactory<>("Square"));

        x1Col.setSortType(TableColumn.SortType.DESCENDING);
        coordinatesCol.setSortable(false);
        x1Col.setSortable(false);
        x2Col.setSortable(false);
        x3Col.setSortable(false);
        y1Col.setSortable(false);
        y2Col.setSortable(false);
        y3Col.setSortable(false);

        TableView<Triangle> rTable = new TableView<Triangle>();

        TableColumn<Triangle, String> rCoordinatesCol = new TableColumn<Triangle, String>("Coordinates");
        TableColumn<Triangle, String> rX1Col = new TableColumn<Triangle, String>("x1");
        TableColumn<Triangle, String> rY1Col = new TableColumn<Triangle, String>("y1");
        TableColumn<Triangle, String> rX2Col = new TableColumn<Triangle, String>("x2");
        TableColumn<Triangle, String> rY2Col = new TableColumn<Triangle, String>("y2");
        TableColumn<Triangle, String> rX3Col = new TableColumn<Triangle, String>("x3");
        TableColumn<Triangle, String> rY3Col = new TableColumn<Triangle, String>("y3");
        TableColumn<Triangle, String> rASideCol = new TableColumn<Triangle, String>("aSide");
        TableColumn<Triangle, String> rBSideCol = new TableColumn<Triangle, String>("bSide");
        TableColumn<Triangle, String> rCSideCol = new TableColumn<Triangle, String>("cSide");
        TableColumn<Triangle, String> rAngle1Col = new TableColumn<Triangle, String>("Angle1");
        TableColumn<Triangle, String> rAngle2Col = new TableColumn<Triangle, String>("Angle2");
        TableColumn<Triangle, String> rAngle3Col = new TableColumn<Triangle, String>("Angle3");
        TableColumn<Triangle, String> rPerimeterCol = new TableColumn<Triangle, String>("Perimeter");
        TableColumn<Triangle, String> rSquareCol = new TableColumn<Triangle, String>("Square");

        rCoordinatesCol.getColumns().addAll(rX1Col, rY1Col, rX2Col, rY2Col, rX3Col, rY3Col);
        rTable.getColumns().addAll(rCoordinatesCol, rASideCol, rBSideCol, rCSideCol, rAngle1Col, rAngle2Col, rAngle3Col, rPerimeterCol, rSquareCol);

        rX1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        rY1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        rX2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        rY2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        rX3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        rY3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        rASideCol.setCellValueFactory(new PropertyValueFactory<>("ASideSize"));
        rBSideCol.setCellValueFactory(new PropertyValueFactory<>("BSideSize"));
        rCSideCol.setCellValueFactory(new PropertyValueFactory<>("CSideSize"));
        rAngle1Col.setCellValueFactory(new PropertyValueFactory<>("A1Angle"));
        rAngle2Col.setCellValueFactory(new PropertyValueFactory<>("A2Angle"));
        rAngle3Col.setCellValueFactory(new PropertyValueFactory<>("A3Angle"));
        rPerimeterCol.setCellValueFactory(new PropertyValueFactory<>("Perimeter"));
        rSquareCol.setCellValueFactory(new PropertyValueFactory<>("Square"));

        rX1Col.setSortType(TableColumn.SortType.DESCENDING);
        rCoordinatesCol.setSortable(false);
        rX1Col.setSortable(false);
        rX2Col.setSortable(false);
        rX3Col.setSortable(false);
        rY1Col.setSortable(false);
        rY2Col.setSortable(false);
        rY3Col.setSortable(false);

        ObservableList<Triangle> list = getTrianglesList();
        table.setItems(list);
        ObservableList<Triangle> rList = getRightTrianglesList();
        rTable.setItems(rList);

        Label minTriangle = new Label("Min triangle: " + usualTrianglesList.findMinSquareTriangleList());
        Label maxTriangle = new Label("Max triangle: " + usualTrianglesList.findMaxSquareTriangleList());
        Label minRTriangle = new Label("Min right triangle: " + usualRightTrianglesList.findMinSquareTriangleList());
        Label maxRTriangle = new Label("Max right triangle: " + usualRightTrianglesList.findMaxSquareTriangleList());
        Label sameRTriangle = new Label("Same right triangles: " + usualRightTrianglesList.findSameTrianglesList().replace('\n',' '));

        VBox window = new VBox();
        Label trLabel = new Label("Triangles:");
        Label rTrLabel = new Label("Right triangles:");
        window.setPadding(new Insets(15));
        trLabel.setPadding(new Insets(10));
        trLabel.setFont(Font.font(15));
        rTrLabel.setPadding(new Insets(10));
        rTrLabel.setFont(Font.font(15));
        minTriangle.setPadding(new Insets(5));
        minRTriangle.setPadding(new Insets(5));
        maxTriangle.setPadding(new Insets(5));
        maxRTriangle.setPadding(new Insets(5));
        window.getChildren().add(trLabel);
        window.getChildren().add(table);
        window.getChildren().add(minTriangle);
        window.getChildren().add(maxTriangle);
        window.getChildren().add(rTrLabel);
        window.getChildren().add(rTable);
        window.getChildren().add(minRTriangle);
        window.getChildren().add(maxRTriangle);
        window.getChildren().add(sameRTriangle);

        stage.setTitle("Triangles");
        Scene scene = new Scene(window, 1350, 900);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Triangle> getTrianglesList() {
        final int MAX_SIDE_SIZE = 100;
        final int N = 10;
        int tempX1;
        int tempY1;
        int tempX2;
        int tempY2;
        int tempX3;
        int tempY3;
        ObservableList<Triangle> trianglesList = FXCollections.observableArrayList();
        for (int i = 0; i < N; i++) {
            while (!Triangle.isExistTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
            }
            trianglesList.add(new Triangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
            usualTrianglesList.add(new Triangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
        }
        return trianglesList;
    }

    private ObservableList<Triangle> getRightTrianglesList() {
        final int MAX_SIDE_SIZE = 100;
        final int M = 14;
        int tempX1;
        int tempY1;
        int tempX2;
        int tempY2;
        int tempX3;
        int tempY3;
        ObservableList<Triangle> rightTrianglesList = FXCollections.observableArrayList();
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        usualRightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        usualRightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        usualRightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        usualRightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        for (int i = 0; i < M-4; i++) {
            while (!RightTriangle.isRightTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
            }
            rightTrianglesList.add(new RightTriangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
            usualRightTrianglesList.add(new RightTriangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
        }
        return rightTrianglesList;
    }

    public static void main(String[] args) {
        launch();
    }
}
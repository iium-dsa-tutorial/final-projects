import java.io.File;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FileSearchSystem extends Application{
	private int countD = 0;
	private int countF = 0;
	@Override
	public void start(Stage primaryStage) {

		JFileChooser fileChooser = new JFileChooser();
        GridPane grid = new GridPane();
        Text scenetitle = new Text("Welcome to File Search System");
        Label directoryLbl = new Label("Directory:");
        Label searchLbl = new Label("Search:");
        Label resultsLbl = new Label("Results: ");
        Label matchLbl = new Label();
        TextField directoryTF = new TextField();
        TextField searchTF = new TextField();
        TextArea resultsTA = new TextArea();
        Button directoryBtn = new Button("Select Path");
        Button searchBtn = new Button("Find Files");
        Button clearBtn = new Button("Clear Search");
        HBox hbBtn = new HBox(1);
        HBox hbBtn2 = new HBox(1);
        HBox hbBtn3 = new HBox(1);
        Scene scene = new Scene(grid, 1000, 700);  

        scenetitle.setId("welcome-text");
        directoryTF.setEditable(false);
        directoryTF.setPrefWidth(780);
        directoryTF.setFont(Font.font(15));
        searchTF.setPrefWidth(780);
        searchTF.setFont(Font.font(15));
        resultsTA.setEditable(false);
        resultsTA.setFont(Font.font(15));
        
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().addAll(directoryBtn);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().addAll(searchBtn);
        hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn3.getChildren().addAll(clearBtn);
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(scenetitle, 0, 0, 3, 1);
        grid.add(directoryLbl, 0, 1);
        grid.add(directoryTF, 1, 1, 2, 1);       
        grid.add(hbBtn, 3, 1);
        grid.add(searchLbl, 0, 2);
        grid.add(searchTF, 1, 2, 2, 1);
        grid.add(hbBtn2, 3, 2);
        grid.add(resultsLbl, 0, 3);
        grid.add(hbBtn3, 3, 47);
        grid.add(resultsTA, 0, 4, 4, 43);
        grid.add(matchLbl, 0, 47);
        //grid.setGridLinesVisible(true);
                
        primaryStage.setTitle("DSA Survivors - File Search System");
        primaryStage.setScene(scene);
        
        //gets the CSS file for the interface design
        scene.getStylesheets().add(FileSearchSystem.class.getResource("FileSearchSystem.css").toExternalForm());
        primaryStage.show();
        
        //opens the fileChooser to browse and choose the directory path
        directoryBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
					directoryTF.setText(fileChooser.getSelectedFile().getPath());
            }
        });
        
        //searches the folders and files in the directory path
        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
        
        	//looks for folders and files in the directory path
        	//first time calling the listDirectories method 
        	@Override
            public void handle(ActionEvent e) {
				File dir = new File(directoryTF.getText());
				String find = searchTF.getText();
				listDirectories(dir, find);

            }
        	
        	//DFS - recursion
        	private void listDirectories(File dir, String find) {
				//calls the method again when a folder is found
        		File[] dirs = dir.listFiles();				
				for (File f : dirs)
					if (f.isDirectory()) {
						listDirectories(f, find);
					}
				
				//calls the Filter class and pass the pattern for filtering
				//stores the filtered file/folder names in the dirs1 array
				File[] dirs1 = dir.listFiles(new Filter("(.*)" + find + "(.*)"));
				for (File f : dirs1) {
					//displays the array of file/folder names in the text area
					if (f.isDirectory()) {
						resultsTA.appendText("Directory -->\t" + f.getName() + "\t-->\t" + f.getParent() + "\n");
						countD++;
					}
					else {
						resultsTA.appendText("File \t\t-->\t" + f.getName() + "\t-->\t" + f.getParent() + "\n");
						countF++;
					}
				}
				matchLbl.setVisible(true);
				matchLbl.setText(countD + " folders and " + countF + " files => " + (countD+countF) + " total matches found");
        	}
		});
        
        //clears the search text field, results text area and the number of matches found
        //reinitialize the the count of file/folder to 0
        clearBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		resultsTA.clear();
        		searchTF.clear();
        		matchLbl.setVisible(false);
        		countF = 0;
        		countD = 0;
        	}
        });
    }
	
    public static void main(String[] args) {
        launch(args);
    }
}

package ch.makery.address.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.UUID;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {
	ObservableList<String> list=FXCollections.observableArrayList("15 years","30 years");
	
	 @FXML
	    private Label creditscoreLabel;
	    @FXML
	    private Label termLabel;
	    @FXML
	    private Label PMTLabel;
	    @FXML
	    private Label incomeLabel;
	    @FXML
	    private Label HouseCostLabel;
	    @FXML
	    private Label PVLabel;
	    @FXML
	    private Label FVLabel;
	    @FXML
	    private Label RateLabel;
	    @FXML
	    private Label PeriodsLabel;
	    @FXML
	    private Label ExpensesLabel;
	    @FXML
	    private Label lblMortgagePaymentLabel;
	    @FXML
	    private TextField txtIncome;
	    @FXML
	    private TextField txtExpenses;
	    @FXML
	    private TextField txtCreditScore;
	    @FXML
	    private TextField txtHouseCost;
	    @FXML
	    private TextField txtlblMortgagePayment;
	    @FXML
	    private TextField txtPV;
	    @FXML
	    private TextField txtFV;
	    @FXML
	    private TextField txtRate;
	    @FXML
	    private TextField txtPeriods;
	    @FXML
	    private TextField txtPMT;
	    @FXML
	    private ComboBox cmbTerm;
	    @FXML
	    private Button GetPayment;
	    @FXML
	    private Button GetPMT;
	    boolean t=false;


    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }

    
    private void handlePayment() {
    	
    	
    }
    
    @FXML
    private void handlePMT() {
    	
    	
    }
    
    
    
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	
    	cmbTerm.setValue("15 years");
    	cmbTerm.setItems(list);
    	
    	cmbTerm.setValue("30 years");
    	cmbTerm.setItems(list);
    	
    	

    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
   
}
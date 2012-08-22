package com.inb372.solarcalc.client;

import com.inb372.solarcalc.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SolarCalculatorProject implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final Label helloLabel = new Label("Label");
		final Button hButton = new Button("Button");
		final PushButton hPushButton = new PushButton("PushButton");
		final RadioButton hRadioButton1 = new RadioButton("RadioButton");
		final RadioButton hRadioButton2 = new RadioButton("RadioButton");
		final CheckBox hCheckBox = new CheckBox("CheckBox");
		final DatePicker hDatePicker = new DatePicker();
		final ToggleButton hToggleButton = new ToggleButton("ToggleButton");
		final TextBox hTextBox = new TextBox();
		final PasswordTextBox hPasswordTextBox = new PasswordTextBox();
		final TextArea hTextArea = new TextArea();
		final ListBox hListBox = new ListBox();
		final MenuBar hMenuBar = new MenuBar();
		final SuggestBox hSuggestBox = new SuggestBox();
		final TabPanel hTabPanel = new TabPanel();
		
		RootPanel.get("gwtContainer").add(hTabPanel);
		
		final FlowPanel p1 = new FlowPanel();
		final VerticalPanel p2 = new VerticalPanel();
		final VerticalPanel p3 = new VerticalPanel();
		
		hTabPanel.add(p1, "First");
		hTabPanel.add(p2, "Second");
		hTabPanel.add(p3, "Third");
		
		p1.add(helloLabel);
		p1.add(hButton);
		p1.add(hPushButton);
		p1.add(hRadioButton1);
		p1.add(hRadioButton2);
		p1.add(hCheckBox);
		p2.add(hDatePicker);
		p2.add(hToggleButton);
		p2.add(hTextBox);
		p3.add(hPasswordTextBox);
		p3.add(hTextArea);
		p3.add(hListBox);
		p3.add(hMenuBar);
		p3.add(hSuggestBox);
	}
}

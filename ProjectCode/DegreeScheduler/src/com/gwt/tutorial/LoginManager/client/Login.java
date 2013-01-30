package com.gwt.tutorial.LoginManager.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;


public class Login extends Composite {
	private TextBox textBoxUserName;
	private PasswordTextBox passwordTextBox;

	public Login() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-BackPanel");
		initWidget(verticalPanel);
		
		Label lblSignInTo = new Label("Sign in to your account");
		lblSignInTo.setStyleName("gwt-Label-Login");
		verticalPanel.add(lblSignInTo);
		
		FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		
		Label lblUsername = new Label("UserName:");
		lblUsername.setStyleName("gwt-Label-Login");
		flexTable.setWidget(0, 0, lblUsername);
		
		textBoxUserName = new TextBox();
		textBoxUserName.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		flexTable.setWidget(0, 1, textBoxUserName);
		textBoxUserName.setWidth("156px");
		
		Label lblPassword = new Label("Password:");
		lblPassword.setStyleName("gwt-Label-Login");
		flexTable.setWidget(1, 0, lblPassword);
		
		 passwordTextBox = new PasswordTextBox();
		flexTable.setWidget(1, 1, passwordTextBox);
		passwordTextBox.setWidth("155px");
		
		CheckBox chckbxRememberMeOn = new CheckBox("Remember me on this computer");
		chckbxRememberMeOn.setStyleName("gwt-Checkbox");
		flexTable.setWidget(2, 1, chckbxRememberMeOn);
		
		Button btnSignIn = new Button("Sign In");
		btnSignIn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (textBoxUserName.getText().length() == 0
						|| passwordTextBox.getText().length() == 0) {
						Window.alert("Username or password is empty."); 
					}
			}
		});
		flexTable.setWidget(3, 1, btnSignIn);
	}

}

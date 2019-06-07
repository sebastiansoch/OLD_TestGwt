/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Main entry point.
 *
 * @author ssoch
 */
public class MainEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of MainEntryPoint
     */
    public MainEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point
     */
    public void onModuleLoad() {
        final TextBox firstArg = new TextBox();
        final TextBox secoundArg = new TextBox();

        final Label labelOperation = new Label("+");
        final Label labelEquals = new Label("=");
        final Label labelResult = new Label();

        final Button button = new Button("CalculateServer3");
        
        

        button.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                                Integer first = Integer.parseInt(firstArg.getText());
                                Integer second = Integer.parseInt(secoundArg.getText());
                //                int cal = first + secound;
                //                labelResult.setText("" + cal);
                CalculatorServiceAsync calculator = GWT.create(CalculatorService.class);
                calculator.add(first, second, new AsyncCallback<Integer>(){

                    public void onFailure(Throwable caught) {
                        Window.alert(caught.getMessage());
                    }

                    public void onSuccess(Integer result) {
                        labelResult.setText(result.toString());
                    }

                });
            }
        });
                
        RootPanel.get().add(firstArg);
        RootPanel.get().add(labelOperation);
        RootPanel.get().add(secoundArg);
        RootPanel.get().add(labelEquals);
        RootPanel.get().add(labelResult);

        RootPanel.get().add(button);
        
        LiczydloUsageExample example = new LiczydloUsageExample();
        RootPanel.get().add(example);
        
    }
}

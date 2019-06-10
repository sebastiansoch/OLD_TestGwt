/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author ssoch
 */
public interface LiczydloAsync {

    public void myMethod(String s, AsyncCallback<String> callback);
}

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
public interface CalculatorServiceAsync {
    void add(Integer first, Integer second, AsyncCallback<Integer> callback);
}

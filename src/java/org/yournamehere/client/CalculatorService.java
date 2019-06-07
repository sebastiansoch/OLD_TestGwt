/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author ssoch
 */

@RemoteServiceRelativePath("calculator")
public interface CalculatorService extends RemoteService {

    Integer add(Integer first, Integer second);
    
}

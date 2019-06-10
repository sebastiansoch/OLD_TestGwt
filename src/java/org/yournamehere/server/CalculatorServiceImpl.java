/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.yournamehere.client.CalculatorService;

/**
 *
 * @author ssoch
 */
public class CalculatorServiceImpl extends RemoteServiceServlet implements CalculatorService {
    @Override
    public Integer add(Integer first, Integer second) {
        return first + second;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import org.yournamehere.client.Liczydlo;

/**
 *
 * @author ssoch
 */
public class LiczydloImpl extends RemoteServiceServlet implements Liczydlo {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Server says: " + s;
    }
}

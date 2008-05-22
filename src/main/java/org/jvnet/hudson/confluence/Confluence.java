package org.jvnet.hudson.confluence;

import hudson.plugins.jira.soap.ConfluenceSoapService;
import hudson.plugins.jira.soap.ConfluenceSoapServiceServiceLocator;

import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.net.URL;

/**
 * @author Kohsuke Kawaguchi
 */
public class Confluence {
    /**
     * Connects to the confluence server.
     */
    public static ConfluenceSoapService connect(URL confluenceUrl) throws ServiceException, IOException {
        ConfluenceSoapServiceServiceLocator loc = new ConfluenceSoapServiceServiceLocator();
        return loc.getConfluenceserviceV1(new URL(confluenceUrl,"rpc/soap-axis/confluenceservice-v1"));
    }
}

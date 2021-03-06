package org.marketcetera.client;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.Validate;
import org.marketcetera.util.misc.ClassVersion;


/* $License$ */
/**
 * Abstraction that manages the initialization of the Client and provides
 * an easy way to get to its singleton instance.
 *
 * @author anshul@marketcetera.com
 * @version $Id$
 * @since 1.0.0
 */
@ClassVersion("$Id$")
public final class ClientManager
{
    /**
     * Validates and starts the object.
     */
    @PostConstruct
    public void start()
    {
        Validate.isTrue(parameters != null || client != null);
        if(!isInitialized()) {
            init(parameters);
        }
    }
    /**
     * Get the parameters value.
     *
     * @return a <code>ClientParameters</code> value
     */
    public ClientParameters getParameters()
    {
        return parameters;
    }
    /**
     * Sets the parameters value.
     *
     * @param inParameters a <code>ClientParameters</code> value
     */
    public void setParameters(ClientParameters inParameters)
    {
        parameters = inParameters;
    }
    /**
     * Get the Client value.
     *
     * @return a <code>Client</code> value
     */
    public Client getClient()
    {
        return client;
    }
    /**
     * Sets the Client value.
     *
     * @param inClient a <code>Client</code> value
     */
    public void setClient(Client inClient)
    {
        client = inClient;
    }
    /**
     * Initializes the connection to the server. The handle to communicate
     * with the server can be obtained via {@link #getInstance()}.
     *
     * @param inParameter The parameters to connect the client. Cannot be null.
     *
     * @throws ConnectionException if there were errors connecting
     * to the server.
     * @throws ClientInitException if the client is already initialized.
     */
    public static synchronized void init(ClientParameters inParameter)
            throws ConnectionException, ClientInitException
    {
        if(!isInitialized()) {
            client = mClientFactory.getClient(inParameter);
        } else {
            throw new ClientInitException(Messages.CLIENT_ALREADY_INITIALIZED);
        }
    }
    /**
     * Sets the <code>ClientFactory</code> to use to create the <code>Client</code>.
     *
     * @param inFactory a <code>ClientFactory</code> value
     * @throws ClientInitException if the client is already initialized.
     */
    public static synchronized void setClientFactory(ClientFactory inFactory)
            throws ClientInitException
    {
        if(isInitialized()) {
            throw new ClientInitException(Messages.CLIENT_ALREADY_INITIALIZED);
        }
        mClientFactory = inFactory;
    }
    /**
     * Returns the Client instance after it has been initialized via
     * {@link #init(ClientParameters)}
     *
     * @return the client instance to communicate with the server.
     *
     * @throws ClientInitException if the client is not initialized.
     */
    public static Client getInstance() throws ClientInitException {
        if (isInitialized()) {
            return client;
        } else {
            throw new ClientInitException(Messages.CLIENT_NOT_INITIALIZED);
        }
    }

    /**
     * Returns true if the client is initialized, false if it's not.
     *
     * @return if the client is initialized.
     */
    public static boolean isInitialized() {
        return client != null;
    }

    /**
     * Resets the client to the uninitialized state. This method is invoked
     * by the client implementation when it's {@link Client#close() closed}.
     * This method is not meant to be used by clients. 
     */
    synchronized static void reset() {
        client = null;
    }
    /**
     * the <code>ClientFactory</code> to use to create the <code>Client</code> object 
     */
    private volatile static ClientFactory mClientFactory = new ClientFactory()
    {
        @Override
        public Client getClient(ClientParameters inParameters)
                throws ClientInitException,ConnectionException
        {
            return new ClientImpl(inParameters);
        }
    };
    /**
     * the <code>Client</code> object
     */
    private volatile static Client client;
    /**
     * 
     */
    private ClientParameters parameters;
}

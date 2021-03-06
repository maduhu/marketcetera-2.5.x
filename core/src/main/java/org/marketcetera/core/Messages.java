package org.marketcetera.core;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.log.I18NMessage2P;
import org.marketcetera.util.log.I18NMessageNP;
import org.marketcetera.util.log.I18NMessageProvider;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The internationalization constants used by this package.
 *
 * @author klim@marketcetera.com
 * @since 0.6.0
 * @version $Id$
 */
@ClassVersion("$Id$")
public interface Messages
{
    /**
     * The message provider.
     */

    static final I18NMessageProvider PROVIDER = 
        new I18NMessageProvider("core");  //$NON-NLS-1$

    /**
     * The logger.
     */

    static final I18NLoggerProxy LOGGER = 
        new I18NLoggerProxy(PROVIDER);
    /**
     * The logger category used to log messages that are more visible to the
     * user than others. Messages logged to this category may appear more
     * prominently to the user especially when using a GUI application.
     */
    public static final String USER_MSG_CATEGORY = "user.messages";  //$NON-NLS-1$

    /*
     * The messages.
     */
    static final I18NMessage0P ERROR_CANNOT_REGISTER_JMX_BEAN = 
        new I18NMessage0P(LOGGER,"error_cannot_register_jmx_bean"); //$NON-NLS-1$

    // General errors
    static final I18NMessage1P ERROR_CONFIG_REASON = 
        new I18NMessage1P(LOGGER,"error_config_reason"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_CONFIG_SESSIONID_INDIVIDUAL_PROPS_SET =
        new I18NMessage0P(LOGGER,"error_config_sessionid_individual_props_set"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_CONFIG_FILE_DNE = 
        new I18NMessage0P(LOGGER,"error_config_file_dne"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_CONFIG_FILE_OPEN = 
        new I18NMessage1P(LOGGER,"error_config_file_open"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_CLASS_DNE = 
        new I18NMessage0P(LOGGER,"error_class_dne"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_CLASS_NAME_DNE = 
        new I18NMessage1P(LOGGER,"error_class_name_dne"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_ERROR = 
        new I18NMessage0P(LOGGER,"error_error"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_ERROR_WITH_DETAILS = 
        new I18NMessage1P(LOGGER,"error_error_with_details"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_JNDI_CREATE = 
        new I18NMessage1P(LOGGER,"error_jndi_create"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_JNDI_CLOSE = 
        new I18NMessage0P(LOGGER,"error_jndi_close"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_NULL_DELAYED_ITEM = 
        new I18NMessage0P(LOGGER,"error_null_delayed_item"); //$NON-NLS-1$
    static final I18NMessage2P DELAYED_ITEM_DESC = 
        new I18NMessage2P(LOGGER,"delayed_item_desc"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_IN_MEMORY_ID_FACTORY_OVERRUN = 
        new I18NMessage0P(LOGGER,"error_in_memory_id_factory_overrun"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_NULL_ID = 
        new I18NMessage0P(LOGGER,"error_null_id"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_CURRENCY_FROM_MESSAGE = 
            new I18NMessage1P(LOGGER,"error_currency_from_message"); //$NON-NLS-1$

    // FIX errors
    static final I18NMessage1P ERROR_FIX_UNEXPECTED_MSGTYPE = 
        new I18NMessage1P(LOGGER,"error_fix_unexpected_msgtype"); //$NON-NLS-1$
    static final I18NMessage1P FIX_DICTIONARY_SET = 
        new I18NMessage1P(LOGGER,"fix_dictionary_set"); //$NON-NLS-1$
    static final I18NMessage1P FIX_DICTIONARY_ALREADY_SET = 
        new I18NMessage1P(LOGGER,"fix_dictionary_already_set"); //$NON-NLS-1$
    static final I18NMessage0P FIX_DICTIONARY_NOT_SET = 
        new I18NMessage0P(LOGGER,"fix_dictionary_not_set"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_FIX_SESSION_NOT_FOUND = 
        new I18NMessage1P(LOGGER,"error_fix_session_not_found"); //$NON-NLS-1$

    // ID factory
    static final I18NMessage1P ERROR_DB_ID_FACTORY_INIT = 
        new I18NMessage1P(LOGGER,"error_db_id_factory_init"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_DB_ID_FACTORY_DB_CONN_ERROR = 
        new I18NMessage0P(LOGGER,"error_db_id_factory_db_conn_error"); //$NON-NLS-1$

    // Resource Pool
    static final I18NMessage0P ERROR_RESOURCE_POOL_COULD_NOT_ALLOCATE_NEW_RESOURCE = 
        new I18NMessage0P(LOGGER,"error_resource_pool_could_not_allocate_new_resource"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_RESOURCE_POOL_RESOURCE_ALREADY_RETURNED = 
        new I18NMessage0P(LOGGER,"error_resource_pool_resource_already_returned"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_RESOURCE_POOL_SHUTTING_DOWN = 
        new I18NMessage0P(LOGGER,"error_resource_pool_shutting_down"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_CANNOT_CREATE_RESOURCE_FOR_POOL = 
        new I18NMessage0P(LOGGER,"error_cannot_create_resource_for_pool"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_RESOURCE_POOL_EXECUTABLE_BLOCK_ERROR = 
        new I18NMessage0P(LOGGER,"error_resource_pool_executable_block_error"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_RESOURCE_POOL_RESERVATION_CANCELLED = 
        new I18NMessage0P(LOGGER,"error_resource_pool_reservation_cancelled"); //$NON-NLS-1$

    static final I18NMessage1P INFO_WAITING_FOR_RESOURCE = 
        new I18NMessage1P(LOGGER,"info_waiting_for_resource"); //$NON-NLS-1$
    static final I18NMessage0P ERROR_FETCHING_VERSION_PROPERTIES =
            new I18NMessage0P(LOGGER, "error_fetching_version_properties");   //$NON-NLS-1$
    // core
    static final I18NMessage1P UNABLE_TO_START = new I18NMessage1P(LOGGER,"unable_to_start"); //$NON-NLS-1$
    static final I18NMessage1P ERROR_DURING_STOP = new I18NMessage1P(LOGGER,"error_during_stop"); //$NON-NLS-1$
    static final I18NMessage1P STARTED = new I18NMessage1P(LOGGER,"started"); //$NON-NLS-1$
    static final I18NMessage1P STOPPED = new I18NMessage1P(LOGGER,"stopped"); //$NON-NLS-1$
    static final I18NMessage1P IGNORING_EXCEPTION = new I18NMessage1P(LOGGER,"ignoring_exception"); //$NON-NLS-1$
    static final I18NMessage1P INTERRUPTED = new I18NMessage1P(LOGGER,"interrupted"); //$NON-NLS-1$
    static final I18NMessage1P SHUTTING_DOWN_FROM_ERROR = new I18NMessage1P(LOGGER,"shutting_down_from_error"); //$NON-NLS-1$
    static final I18NMessageNP THREAD_POOL_MONITOR = new I18NMessageNP(LOGGER,"thread_pool_monitor"); //$NON-NLS-1$
    // Application Container
    static final I18NMessage0P APP_COPYRIGHT = new I18NMessage0P(LOGGER,"app_copyright"); //$NON-NLS-1$
    static final I18NMessage2P APP_VERSION_BUILD = new I18NMessage2P(LOGGER,"app_version_build");   //$NON-NLS-1$
    static final I18NMessage0P APP_START = new I18NMessage0P(LOGGER,"app_start"); //$NON-NLS-1$
    static final I18NMessage0P APP_STARTED = new I18NMessage0P(LOGGER,"app_started"); //$NON-NLS-1$
    static final I18NMessage0P APP_STOP = new I18NMessage0P(LOGGER,"app_stop"); //$NON-NLS-1$
    static final I18NMessage0P APP_STOP_SUCCESS = new I18NMessage0P(LOGGER,"app_stop_success"); //$NON-NLS-1$
    static final I18NMessage0P APP_STOP_ERROR = new I18NMessage0P(LOGGER,"app_stop_error"); //$NON-NLS-1$
    static final I18NMessage1P APP_USAGE = new I18NMessage1P(LOGGER,"app_usage"); //$NON-NLS-1$
    static final I18NMessage0P APP_AUTH_OPTIONS = new I18NMessage0P(LOGGER,"app_auth_options"); //$NON-NLS-1$
    static final I18NMessage0P APP_MISSING_CREDENTIALS = new I18NMessage0P(LOGGER,"app_missing_credentials"); //$NON-NLS-1$
    static final I18NMessage0P APP_NO_ARGS_ALLOWED = new I18NMessage0P(LOGGER,"app_no_args_allowed"); //$NON-NLS-1$
    static final I18NMessage0P APP_NO_CONFIGURATION = new I18NMessage0P(LOGGER,"app_no_configuration"); //$NON-NLS-1$
}

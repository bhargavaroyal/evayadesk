package india.evayadesk.com.evayadesk.network;

/**
 * Created by bhargavagugamsetty on 26/05/16.
 */
public class HttpRequestConstants {
    // Production URL

    public static final String  PRODUCTION_BASEURL_API             = "https://web.com/";

    public static final String  HEADER_AUTHTOKEN                   = PRODUCTION_BASEURL_API + "oauth/token";

    public static final String  AUTHTOKEN_URL                      = PRODUCTION_BASEURL_API + "oauth/token";
    public static final String  URL             = "https://web.com/";



    // Request Codes
    public static final int LOGIN = 1;
    public static final int VERIFY = 2;
    public static final int UPDATE_USER = 3;
    public static final int MEETUP_FRIENDS = 4;
    public static final int INVITE_FRIENDS = 5;
    public static final int CREATE_GROUP = 6;
    public static final int LIST_USERGROUPS = 7;
    public static final int POST_GROUP_PICTURE = 8;
    public static final int GROUP_ACTIVITIES = 9;
    public static final int GROUP_ACTIVITY = 10;
    public static final int LOGIN_ADMIN = 11 ;



    // Web Services
// LIST TICKETS

public static final String LIST_TICKET_SERVICE = "subscriber/v1/request";

//    Create Ticket
public static final String CREATE_TICKET_SERVICE = "subscriber/v1/request";

//  Update Ticket
public static final String UPDATE_TICKET_SERVICE = "subscriber/v1/request";
// Get Ticket Information
public static final String TICKET_INFORMATION_SERVICE = "subscriber/v1/request/id=< ticketid >";

//Agent Login
public static final String AGENT_LOGIN_SERVICE = "support/v1/login";

//Agent Logout
public static final String AGENT_LOGOUT_SERVICE = "support/v1/logout";

//List Tickets
public static final String LIST_TICKETS_SERVICE = "support/v1/request";

//Get Ticket
public static final String GET_TICKET_SERVICE = "support/v1/request/id=< ticketid >";

//Update Ticket
//public static final String UPDATE_TICKET_SERVICE = "support/v1/request";

//Get Ticket Stats
public static final String GET_TICKET_STATS_ADMIN_SERVICE = "support/v1/request/stat";

//Create Company
public static final String CREATE_COMPANY_SERVICE = "admin/v1/company";

//Admin Login
public static final String ADMIN_LOGIN_SERVICE = "admin/v1/login";


//Admin Logout
public static final String ADMIN_LOGOUT_SERVICE = "admin/v1/logout";

//Create Support Staff
public static final String CREATE_SUPPORT_STAFF_SERVICE = "admin/v1/support";

//List Support Staff
public static final String LIST_SUPPORT_STAFF_SERVICE = "admin/v1/support";

//Delete Support Staff
public static final String DELETE_SUPPORT_STAFF_SERVICE = "admin/v1/support";

//List Tickets
public static final String LIST_TICKETS_ADMIN_SERVICE = "admin/v1/request";

//Get Ticket
public static final String GET_TICKET_ADMIN_SERVICE = "admin/v1/request/id=< ticketid >";
//Update Ticket
public static final String UPDATE_TICKET_ADMIN_SERVICE = "admin/v1/request";

//Get Ticket Stats
public static final String GET_TICKET_STATS_SERVICE = "admin/v1/request/stat";


//






}

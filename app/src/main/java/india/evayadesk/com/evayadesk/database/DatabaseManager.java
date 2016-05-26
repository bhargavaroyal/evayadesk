package india.evayadesk.com.evayadesk.database;

import android.content.Context;

import java.util.List;

/**
 * Created by bhargavagugamsetty on 26/05/16.
 */
public class DatabaseManager {

    /**
     * Single Instance of the class object
     */
    private static DatabaseManager sDBObj = null;

    /**
     * class constructor with private declaration so that instance are created
     * only through getInstance()
     */
    private DatabaseManager() {
    }

    /**
     * getInstance Method will return instance object of the DatabaseManager.
     *
     * @return database manager object
     */
    public static synchronized DatabaseManager getInstance() {
        if (sDBObj == null) {
            sDBObj = new DatabaseManager();
        }
        return sDBObj;
    }


//    public void insertElementsIntoTicketListTable(final Context context, final List<TicketItemEntity> sessionItemEntityList) {
//        TicketItemEntity sessionItemEntity;
//
//        if ((sessionItemEntityList != null) && (sessionItemEntityList.size() > 0)) {
//            for (int i = 0; i < sessionItemEntityList.size(); i++) {
//                sessionItemEntity = sessionItemEntityList.get(i);
//                if (sessionItemEntity != null && sessionItemEntity.getId() != null) {
//                    if (!checkTicketIdAvailable(context, sessionItemEntity.getId())) {
//                        TicketDatabaseQuery.getInstance().insertSingleElementsIntoGetSessionsTable(context, sessionItemEntity);
//                    }
//                }
//            }
//        }
//
//    }
}

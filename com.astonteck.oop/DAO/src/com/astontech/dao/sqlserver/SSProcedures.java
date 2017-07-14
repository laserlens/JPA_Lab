package com.astontech.dao.sqlserver;

/**
 * Created by Adrian.Flak on 5/31/2017.
 */
final class SSProcedures {

    //region Person Procedures

        public static final String callALLPerson = "{call usp_SelectPersonAll()}";

        public static final String callByIdPerson = "{call usp_SelectPerson(?)}";

        public static final String callInsertPerson = "{call usp_InsertPerson(?,?,?,?,?,?,?)}";

        public static final String callUpdatePerson = "{call usp_UpdatePerson(?,?,?,?,?,?,?)}";

        public static final String callDeletePerson = "{call usp_DeletePerson(?)}";

    //endregion

    //region Vehicle Procedures

        public static final String callALLVehicle = "{call usp_SelectVehicleAll()}";

        public static final String callByIdVehicle = "{call usp_SelectVehicle(?)}";

        public static final String callInsertVehicle = "{call usp_InsertVehicle(?,?,?,?,?,?,?,?,?)}";

        public static final String callUpdateVehicle = "{call usp_UpdateVehicle(?,?,?,?,?,?,?,?,?)}";

        public static final String callDeleteVehicle = "{call usp_DeleteVehicle(?)}";


    //endregion

}

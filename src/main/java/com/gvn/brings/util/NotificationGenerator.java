package com.gvn.brings.util;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gvn.brings.model.BrngOrder;

public interface NotificationGenerator {
	
	void generateNotificationForBooking(BrngOrder brngorder ,int orderId, ArrayList<String> listOfServiceMen) throws ClassNotFoundException, SQLException;

}

package com.prey.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.prey.PreyLogger;

public class PreyInstallRemoteReceiver extends BroadcastReceiver {

 

	@Override
	public void onReceive(Context context, Intent intent) {
		PreyLogger.i("Broadcast - Action received: "+intent.getAction());
	
	}

}

package com.gruita.java.designpattern.observer;

/**
 * 
 * @author cristian.gruita
 * 
 *         Simple observer prototype for the offline mode. Whenever the
 *         synchronization is due, the GET and POST WS are called, the local
 *         cache is updated and the alerts are shown (as long as they are added
 *         to the observers list)
 */
public class TestObserver {
	public static void main(String args[]) {
		SyncManager syncManager = new SyncManager();
		CallGetWS callGetWS = new CallGetWS();
		CallQueuedTasksCompletion callQueuedTasks = new CallQueuedTasksCompletion();
		UpdateLocalCache updateDb = new UpdateLocalCache();
		DisplayAlerts alerts = new DisplayAlerts();

		syncManager.registerObserver(callGetWS);
		syncManager.registerObserver(callQueuedTasks);
		syncManager.registerObserver(updateDb);
		syncManager.registerObserver(alerts);

		syncManager.sync();

		// for whatever reasons, we don't want the alerts anymore
		System.out.println("\n");
		syncManager.removeObserver(alerts);
		syncManager.sync();
	}
}

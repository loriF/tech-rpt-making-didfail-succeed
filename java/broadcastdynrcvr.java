public class MyBroadcastReceiver_Dyn 
        extends BroadcastReceiver { 
    public void onReceive(
            Context c, 
            Intent i) { 
        String file = "devicelDSinkFile.txt"; 
        Bundle extras = i.getExtras(); 
        String id = extras.get("deviceID");
        // Write id to the file...
}
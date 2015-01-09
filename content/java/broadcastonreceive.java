public void onReceive(Context context, Intent intent) { 
    Bundle extras = intent.getExtras(); 
    SmsManager smsManager = ...;
    String number = "55555555555"; 
    String id = extras.get("deviceID");
    smsManager.sendTextMessage(number, null, id, null, null); 
} 

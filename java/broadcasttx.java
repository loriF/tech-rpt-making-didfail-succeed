TelephonyManager tm = ...; 
String tmDevice = tm.getDeviceId(); // A Source 
Intent intent = new Intent(); 
intent.setAction("DeviceIDBroadcast"); 
intent.putExtra("deviceID", tmDevice); 
sendBroadcast(intent); // A Sink 


this.recvr = new MyBroadcastReceiver_Dyn(); 
registerReceiver( 
    this.recvr, 
    new IntentFilter("DeviceIDBroadcast"));
static String log = "";

private void getDataFromIntent() {
    Intent i = getIntent();
    String message = getString("message");
    log = log + message;
    Intent reply = new Intent();
    reply.putExtra("STORED_DATA", log);
    setResult(Activity.RESULT_OK, reply);
}
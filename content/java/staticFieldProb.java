public static class staticBox {
    public String holdoverFieldA = "";
}

private static staticBox holdover = new staticBox();

public class holdingBox {
    public String getStatic() {
        return holdover.holdoverFieldA;
    }
    public void setStatic(String s) {
        holdover.holdoverFieldA = s;
    }
}

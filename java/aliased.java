class Box {
    String x;
}

static Box b = new Box();
...
Box b2 = b;
b2.x = source();
sink(b2.x);
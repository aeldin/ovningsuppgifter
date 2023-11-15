package ovningsuppgifter.Week4;

    interface Tossable {
    void toss();
}

    class Rock implements Tossable {
    @Override
    public void toss() {
        System.out.println("The rock is tossed");
    }
}







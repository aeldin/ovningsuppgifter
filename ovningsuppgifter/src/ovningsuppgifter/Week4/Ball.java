package ovningsuppgifter.Week4;

abstract class Ball implements Tossable {

    private final String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public abstract void bounce();
    @Override
    public void toss() {

    }
}

class Baseball extends Ball {

    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void bounce() {
        System.out.println("The baseball bounces");
    }

    @Override
    public void toss() {
        System.out.println("Baseball is tossed");
    }
}

class Football extends Ball {

    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void bounce() {
        System.out.println("The football bounces");
    }

    @Override
    public void toss() {
        System.out.println("Football is tossed");
    }
}

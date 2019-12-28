public class Rover {

    private Area area;
    private int positionX;
    private int positionY;
    private String direction;

    public void land(Area area, int x, int y, String direction) {
        this.area = area;
        this.positionX = x;
        this.positionY = y;
        this.direction = direction;
    }

    public String getPosition() {
        return "" + this.positionX + this.positionY + this.direction;
    }

    public void forward(int stepNum) {
        String direction = this.direction;
        int newPositionX;
        int newPositionY;
        if (this.direction.equals("E")) {
            if (stepNum >= 0) {
                newPositionX = (this.positionX + stepNum) > this.area.getMaxX() ? this.area.getMaxX() : this.positionX + stepNum;
            } else {
                newPositionX = (this.positionX + stepNum) < 0 ? 0 : this.area.getMaxX();
            }

        }
    }
}

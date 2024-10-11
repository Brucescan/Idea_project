package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Color color = Color.YELLOW;
        switch(color){
            case RED:
                Color.RED.show();
                break;
            case BLUE:
                Color.BLUE.show();
                break;
            case BLACK:
                Color.BLACK.show();
                break;
            case YELLOW:
                Color.YELLOW.show();
                break;
            case GREEN:
                Color.GREEN.show();
                break;
        }
    }
}
interface IA{
    void show();
}
enum Color implements IA{
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private final int redValue;
    private final int blueValue;
    private final int greenVaule;

    Color(int redValue, int blueValue, int greenVaule) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenVaule = greenVaule;
    }

    @Override
    public void show() {
        System.out.println("red = "+redValue+"\tblue = "+blueValue+"\tgreen = "+greenVaule);
    }
}

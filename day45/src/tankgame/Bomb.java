package tankgame;

/**
 * @author bruces
 * @version 1.0
 */
public class Bomb {
    int x, y;//爆炸的坐标
    int life = 15;//爆炸的生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }

    }
}

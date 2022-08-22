package simplegame;

import java.util.Random;

public class Level {

    private int Row;
    private int Column;
    private String[][] Level = new String[Column][Row];

    public Level(String[][] Level, int Row, int Column) {
        this.Level = Level;
        this.Row = Row;
        this.Column = Column;
    }

    public Level(int Row, int Column) {
        this.Row = Row;
        this.Column = Column;
    }

    public String[][] getLevel() {
        return Level;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int Row) {
        this.Row = Row;
    }

    public int getColumn() {
        return Column;
    }

    public void setColumn(int Column) {
        this.Column = Column;
    }

    public Level() {
    }

    public static void Levels(int Row, int Column) {
        Random rnd = new Random();

        Row = rnd.nextInt(25) + 10;
        Column = rnd.nextInt(12) + 3;

        Level level = new Level();
        level.setRow(Row);
        level.setColumn(Column);

        /*if () {
            
        }*/
    }
    public static int MakeaDoor(int Door){
        Random rnd = new Random();
        Door = rnd.nextInt(25)+3;
        
        Level level = new Level();
        String[][] level = new String[level.getRow][]
        
        
    }

}

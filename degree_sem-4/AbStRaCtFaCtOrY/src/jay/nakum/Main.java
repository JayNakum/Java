package jay.nakum;
import jay.nakum.factories.PenSuggester;
import jay.nakum.pens.MyPen;

public class Main {
    public static void main(String[] args) throws Exception {
        MyPen pen = new PenSuggester().suggest().company();
        System.out.println(pen.getUse());
        System.out.println(pen.getWritingQuality());
        System.out.println(pen.getCost());
    }
}

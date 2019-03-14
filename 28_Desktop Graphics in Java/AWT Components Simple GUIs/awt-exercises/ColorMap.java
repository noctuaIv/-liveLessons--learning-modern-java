import java.util.*;
import java.awt.*;

public class ColorMap {
  private HashMap<String, Color> colorTable;

  public ColorMap() {
    colorTable = new HashMap<>();
    colorTable.put("RED", Color.RED);
    colorTable.put("GREEN", Color.GREEN);
    colorTable.put("BLUE", Color.BLUE);
    colorTable.put("YELLOW", Color.YELLOW);
    colorTable.put("WHITE", Color.WHITE);
    colorTable.put("BLACK", Color.BLACK);
  }

  public Color getColor(String colorName) {
    colorName = colorName.toUpperCase();
    Color color = colorTable.get(colorName);
    if (color == null) {
      color = Color.GRAY;
    }
    return(color);
  }
}


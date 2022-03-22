/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    public boolean equals(Object obj) { //Обеспечивает реализацию equals()
        if (obj instanceof Location) {
            Location other = (Location) obj;
            return xCoord == other.xCoord && yCoord == other.yCoord;
        }
        return false;
    }

    public int hashCode() { //Обеспечивает реализацию hashcode()
        int result = 19;
        result = 17 * result + (xCoord * 11);
        result = 23 * result + (yCoord * 13);
        return result;
    }
}

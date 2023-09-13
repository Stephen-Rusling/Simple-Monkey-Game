public class MonkeyObject
{
    private int currentPosition = 0;
    private String face = "Up";

    // Methods for reversing direction of monkey, discovering monkey state & climbing up and down.
    public String reverse()
    {
        if (face.equals("Up"))
        {
            face = "Down";
        }
        else if (face.equals("Down"))
        {
            face = "Up";
        }
        return face;
    }
    public Boolean monkeyState()
    {
        Boolean output = false;
        if (face.equals("Up"))
        {
            output = true;
        }
        if (face.equals("Down"))
        {
            output = false;
        }
        return output;
    }
    public void movingUp()
    {
        if (face.equals("Up"))
        {
            currentPosition += 1;
        }
    }
    public void movingDown()
    {
        if (face.equals("Down"))
        {
            currentPosition -= 1;
        }
    }
    // Two ToString's to print out direction faced and current position based on object status
    public String directionToString()
    {
        String direction;
        if (face.equals("Up"))
        {
            direction = "Upwards";
        }
        else
        {
            direction = "Downwards";
        }
        return (direction);
    }
    public int positionToString()
    {
        return (currentPosition);
    }
}

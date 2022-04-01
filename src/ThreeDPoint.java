import java.util.Objects;

public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z= " + z;
    }

    @Override
    public boolean equals(Object obj)
    {
       if(obj == null || !(obj instanceof ThreeDPoint))
       {
           return false;
       }
       else
       {
           ThreeDPoint temp = (ThreeDPoint) obj;
           return (super.equals(temp)) && (this.z == temp.z);
       }
    }
}

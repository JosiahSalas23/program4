
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   if (Math.hypot(center.x - other.center.x, center.y - other.center.y) <= (radius + other.radius))
      return true;
   return false;
}

}
import java.awt.*;

public class simple extends Frame
{
  public simple(String title)
  {
    super(title);
    resize(200,200);
    show();
  }
  public static void main(String args[])
  {
    new simple("hello");
  }
}

public class Rectangle {
    public int squareRectangle(int a, int b) throws MyException
    {
        if(a>0 && b>0) return (a*b);
        else throw new MyException("You have entered negative value!");
    }
}

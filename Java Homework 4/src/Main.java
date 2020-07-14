public class Main {
    public static void main(String[] args)
    {

        Month month = new Month();
        month.enterNum();
        month.daysAmount(month.monthNum);

        Numbers task2 = new Numbers();
        task2.enterTen();
        task2.sumOrProduct();

        Numbers task3 = new Numbers();
        task3.enterFive();


        Car c1 = new Car("Coupe",1800, 2018);
        Car c2 = new Car("Sedan",1500, 2002);
        Car c3 = new Car("Micro",1000, 2015);
        Car c4 = new Car("Supercar",2500, 2016);
        int years [] = {c1.enterYear(), c2.enterYear(), c3.enterYear(), c4.enterYear()};
        String info[] = {("Car type: "+c1.type+", Year of production: "+c1.yearOfProd+", Engine capacity: "+c1.engineCap), ("Car type: "+c2.type+", Year of production: "+c2.yearOfProd+", Engine capacity: "+c2.engineCap), ("Car type: "+c3.type+", Year of production: "+c3.yearOfProd+", Engine capacity: "+c3.engineCap), ("Car type: "+c4.type+", Year of production: "+c4.yearOfProd+", Engine capacity: "+c4.engineCap)};
        c1.sort(years, info);
    }
}

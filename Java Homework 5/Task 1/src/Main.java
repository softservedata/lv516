public class Main {
    public static void main(String[] args) {
      //Task1
      String birds[] = new String[4];

      Eagle eagle = new Eagle();
      eagle.feathers = "Tail";
      eagle.layEggs = 10;

      Swallow swallow = new Swallow();
      swallow.feathers = "Wing";
      swallow.layEggs = 7;

      Penguin penguin = new Penguin();
      penguin.feathers = "Semiplume";
      penguin.layEggs = 2;

      Chicken chicken = new Chicken();
      chicken.feathers = "Contour";
      chicken.layEggs = 21;

      birds[0] = "Feathers: "+eagle.feathers+"; Laid eggs: "+eagle.layEggs+". "+eagle.fly()+" "+eagle.info();
      birds[1] = "Feathers: "+swallow.feathers+"; Laid eggs: "+swallow.layEggs+". "+swallow.fly()+" "+swallow.info();
      birds[2] = "Feathers: "+penguin.feathers+"; Laid eggs: "+penguin.layEggs+". "+penguin.fly()+" "+penguin.info();
      birds[3] = "Feathers: "+chicken.feathers+"; Laid eggs: "+chicken.layEggs+". "+chicken.fly() +" "+chicken.info();

      for(int i=0;i<birds.length;i++)
      {
        System.out.println(birds[i]);
      }
    }
}

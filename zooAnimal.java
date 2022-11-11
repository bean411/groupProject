
public class zooAnimal {
private String animalName;
private int animalNum;
private String enclosure;
//food
public zooAnimal(){
  animalName = "No name inputted.";
  animalNum = 0;
  enclosure = "No enclosure specified.";
}
public zooAnimal(String name, int num, String enc){
  animalName = name;
  animalNum = num;
  enclosure = enc;
}
  
public void setAnimalName(String n){
  animalName = n;
}
//get animal num
//get enclosure
//get foodName (maybe in zooFood)
//get foodNum (maybe in zooFood)
}

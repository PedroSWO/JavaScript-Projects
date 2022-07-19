public class Droid {

    int batteryLevel;
    String name;
    
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString(){
      return "Hello, I'm the droid: " + name;
    }
  
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
  
    public int energyReport(){
      return batteryLevel;
    }
  
    public static void main(String[] args){
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("PowerLifting");
      System.out.println(codey.energyReport());
      codey.performTask("Running");
      System.out.println(codey.energyReport());
    }
  
class AlarmClock {
  protected String brand = "Alarm sound";        
  public void message() {                    
    System.out.println("It is time to...");
  }
}

class AppointmentAlarm extends AlarmClock {
  private String modelName = " ";    
  public static void main(String[] args) {

    // Create a myCar object
    AppointmentAlarm newAlarm = new AppointmentAlarm();

    // Call the honk() method (from the Vehicle class) on the myCar object
    newAlarm.message();

  }
}

//-----------------------------------------------------------------

class Worker {
  public void workerJob() {
    System.out.println("This is my job");
  }
}

class Painter extends Worker {
  public void workerJob() {
    System.out.println("Painter paints walls");
  }
}

class Builder extends Worker {
  public void workerJob() {
    System.out.println("Builder works in construction");
  }
}

//---------------------------------------------------------------

public class Main {
    public static void main(String[ ] args) {
      try {
        int x = 2
        int y = 4
        
        System.out.println(x/y);
    
        } catch (Exception y==0) {
        System.out.println("Cannot divide by zero.");
      }
    }
  }
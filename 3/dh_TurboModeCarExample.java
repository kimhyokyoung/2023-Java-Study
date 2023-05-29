public class TurboModeCarExample {

    public static void main(String[] args) {

       TurboModeCar tu = new TurboModeCar();
       tu.startCar(); //시동을 겁니다.
       tu.drive(); //일반모드로 주행합니다
       tu.driveMode = TurboModeCar.TURBO;
       tu.driveMode(); //터보모드로 주행합니다.
       tu.driveMode = TurboModeCar.NORMAl;
       tu.driveMode(); //일반모드로 주행합니다
       tu.stopCar(); //시동을 끕니다.

    }
}

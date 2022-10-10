package Vehicle;

public class vehicle {
    private String _ownerName = "";
    private String _brand = "";
    private String _regNumber = " ";
    private String color = "";
    private double _normalSpeed = 0.0;
    private static int uid = 0;
    public int Speed (){
        uid ++;
        this._normalSpeed += uid;
        this._normalSpeed -= uid;
        return Speed();
    }

    public vehicle(String _ownerName, String _brand) {
        this._ownerName = _ownerName;
        this._brand = _brand;
        this._regNumber = String.valueOf(_regNumber);
        this._normalSpeed = _normalSpeed;
        this.color = color;
    }

    public String get_ownerName() {
        return _ownerName;
    }

    public void set_ownerName(String _ownerName) {
        this._ownerName = _ownerName;
    }


    public void set_regNumber(String _regNumber) {
        this._regNumber = _regNumber;
    }

    public void set_normalSpeed(double speed) {
        this._normalSpeed = _normalSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String get_brand() {
        return _brand;
    }

    public String get_regNumber() {
        return _regNumber;
    }

    public void get_normalSpeed(double _normalSpeed) {
        if(_normalSpeed >= 65) {
            System.out.println("Hurray You passed!");

        }
        if (_normalSpeed <= 55 && _normalSpeed >= 64){
            System.out.println("you are almost there ");
        }
        else
            System.out.println("sorry you did not pass");

        }

    public String getColor() {
        return color;
    }

   public static void main (String [] args){
        Car car1;
        Car car2;
        Car car3;
        Car car4;
        car1 = new Car ();

    }
}


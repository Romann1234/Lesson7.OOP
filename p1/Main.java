package p1;

public class Main {
    public static void main(String[] args) {
     Phone Phone1 = new Phone("89095673554", "iphone15",171  );
        Phone1.receiveCall("89095673554");
        Phone1.printInfo();

        Phone Phone2 = new Phone("89125463654","iphone14",172 );
        Phone2.receiveCall("89125463654");
        Phone2.printInfo();

        Phone Phone3 = new Phone("89505674348","iphone13",174 );
        Phone3.receiveCall("89505674348");
        Phone3.printInfo();

        Phone1.getNumber("89095673554");
        Phone2.getNumber("89125463654");
        Phone3.getNumber("89505674348");





    }
}
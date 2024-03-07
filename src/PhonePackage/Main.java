package PhonePackage;

class Main {

    public static void main(String[] args){
        Phone phone = new Phone();
        iPhone iphone = new iPhone();
        Android android = new Android();

        phone.sendText();
        iphone.sendText();
        android.sendText();
    }
}

package CodeSmellFeatureEnvy;

public class Phone {
    private final String unformattedNumber;

    public Phone(String unformattedNumber){
        this.unformattedNumber = unformattedNumber;
    }

    private String getAreaCode(){
        return unformattedNumber.substring(0,3);
    }

    private String getPrefix(){
        return unformattedNumber.substring(3,6);
    }

    private String getNumber(){
        return unformattedNumber.substring(6,10);
    }

    public String toFormattedString() {
        return String.format("(%s) %s-%s", getAreaCode(), getPrefix(), getNumber());
    }

    public static class Customer {
        protected Phone mobilePhone;

        public String getMobilePhoneNumber(){
            return mobilePhone.toFormattedString();
        }
    }
}




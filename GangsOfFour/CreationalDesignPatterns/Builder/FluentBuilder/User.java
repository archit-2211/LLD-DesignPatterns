package GangsOfFour.CreationalDesignPatterns.Builder.FluentBuilder;

/*
 * 
 * Lets say in this usecase we want to make certain validations before creating the object and One more thing is that we have certain optional parameters, like aadharNumber and panNumber 
 * 
 * In order to make sure that object creation follows these validations and check for optional paramters makes logic so complex and it violates various design principles 
 * For example: If we want to perform certain validations, without creating the object, then we have to write complex lopgin in constructor; 
 * But constructor is not built to handle these complex validations and calculations, its role is to help object creation and parameter initialisation. 
 * 
 * So here we implement this pattern to acheive our goals of validations and possible optional parameter intializations. 
 * 
 * F
 
 */

public class User {
    private String name ; 
    private String address ; 
    private String email ; 
    private String phoneNumber ; 
    private String aadharNumber ; 
    private String panNumber ; 
    
    /*
     * Here we are making sure that only way to create a user object is using UserBuilder object, no other way of creating the user object. 
     * 
     */

    private User(UserBuilder userBuilder) { 
        this.name = userBuilder.name; 
        this.address = userBuilder.address; 
        this.email = userBuilder.email ; 
        this.phoneNumber =   userBuilder.phoneNumber ; 
        this.aadharNumber = userBuilder.aadharNumber ; 
        this.panNumber = userBuilder.panNumber ; 


    }

    public String toString() {
        return "Name is " + this.name  + " email is  " + this.email + " phone number is " + this.phoneNumber ; 
    }

    public static class UserBuilder {

        private String name ; 
        private String address ; 
        private String email ; 
        private String phoneNumber ; 
        private String aadharNumber = "" ; 
        private String panNumber = "" ; 



        /*
         * Pass the mandatory paramters required over here 
         */
        public UserBuilder(String name, String email, String phoneNumber) {
            this.name = name ; 
            this.email = email ; 
            this.phoneNumber = phoneNumber ;

        }

        /*
         * We provide setter methods to set the optional Argumetns 
         */

        public UserBuilder setAddress(String address) { 
            this.address = address ; 
            return this ; 
        }

        public UserBuilder setAadharNumber(String aadharNumber) {
            this.aadharNumber = aadharNumber ; 
            return this; 
        }

        public UserBuilder setPanNumber(String panNumber) {
            this.panNumber = panNumber ; 
            return this ; 
        }


        /*
         * At the end we provide build method that builds the User object 
         * Before we create any object we can do any logical processing over here like providing validations. Since the method should only be accessed by build method it is better to keep it private
         * 
         */
        private void validations () {

            /*If any invalid data ids found raise the exception else proceed */
            boolean isphoneNumberValid = this.phoneNumber.matches("^(\\+91[\\-\\s]?|91[\\-\\s]?|0)?[6-9]\\d{9}$");

            boolean isEmailValid = this.email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
               "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$") ;
            /*
             * We are validating phone number and email using above regular expressions. 
             * We can provide further validations as well . 
             */
            if (!isphoneNumberValid || !isEmailValid) {
                throw new RuntimeException("Invalid inputs") ; 
            }



        }

        

        public User build() throws RuntimeException {
            this.validations();
            return new User(this) ; 
        }

    }


    
}

/*
 * Note this is the example of Mutable objects, but we can also make objects immutable by declaring primitve objects as final and non primitive objects like list and map by not prividing setter methods and 
 * maintaining defensive copies. 
 * 
 */
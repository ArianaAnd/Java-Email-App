package emailapp;

import java.util.Scanner;

public class Email {

    //Declare variable

    private String firstName;
    private String lastName;
    private String password;
    private String departament;
    private int mailboxCapacity = 500;
    private String email;
    private int defaultPasswordLenght = 10;
    private String alternateEmail;
    private String companSuffix = "aeycompany.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created " + this.firstName + " / "+ this.lastName);
        //Write the person name, to generate the email and password
        Scanner in = new Scanner(System.in);
        firstName = in.next();
        lastName = in.next();



        //Call method asking for the departament return the departament
        this.departament = setDepartament();
        System.out.println("Departament: "  + this.departament);

        //Call a method that return the password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departament + "." + companSuffix;
        System.out.println("Your email is: " + email);



    }

    //Ask for departament

    private String setDepartament(){
            System.out.println("Hello new worker please enter your departament codes:\n1" +
                " for Sales\n2" +
                " for Departament\n3" +
                " for Accounting\n4" +
                " for more");
        Scanner in  = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {return "management";}
        else if(depChoice == 2) {return "development";}
        else if(depChoice == 3) {return "accounting";}
        else {return "";}
    }

    //Gerate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];
        for(int i = 0; i<length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String (password);


    }

    //Set the mailbox capacity

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

  /*  public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox Capacity" + mailboxCapacity + " mb " ;
    }*/
}

package com.astontech.console;

//region imports
import com.astontech.bo.*;
import com.astontech.bo.interfaces.*;

import java.sql.*;

import java.time.LocalDate;
import java.util.*;


import com.astontech.dao.*;

import com.astontech.dao.sqlserver.*;
import common.helpers.*;
import org.apache.log4j.Logger;

//endregion

public class OOP_Priciples_Main {

    final static Logger logger = Logger.getLogger(OOP_Priciples_Main.class);

    //region Parameters for Primitive data types
    //variables to get default values of data types
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bl;
    static String st;
    //variables of lottery games
    static String gameName;
    static LocalDate drawingDate;
    static List<Integer> winningNumbers;
    static List<String> ballTypes;
    static Integer jackPot;
    //endregion

    public static void main(String[] args) {

        //region Methods called on Run

        //FundamentalLab();

        //PrimitiveData();

        //MakingAList();

        //Lottery();

        //FizzBuzzLesson();

        //LessonCalculatorLab();

        //LessonInstancesNew();

        //LessonCollections();

        //LessonClassNested();

        //LessonNestedAndCollected();

        //NestedandCollectedLab();

        //LessonInstantVsStatic();

        //LessonPolyMorphisum();

        //LessonHash();

        //LessonValueVsRef();

        //OOP_Principles_Lab4();

        //InterfacesTest();

        //LessonLogging();

        //Lab5();

       //MyInterfaceTest();

        //LessonExecQuery();

        //LessonGetStoredProc();

        //TestSqlServer();

        //LessonDAO();

        // DAOLab1();

        //LessonDAOInsert();

        //LessonDAOUpdate();

        //LessonDAODelete();

        //DAOLab2();

        //endregion

    }

    private static void LessonInstancesNew() {
//        //creates a new person
//        Person myFirstPerson = new Person();
//        myFirstPerson.setFirstName("Adrian");
//        myFirstPerson.setLastName("Flak");
//        myFirstPerson.setTitle("Dr.");
//
//        System.out.print(myFirstPerson.getTitle());
//        System.out.print(" " + myFirstPerson.getFirstName());
//        System.out.print(" ");
//        System.out.println(myFirstPerson.getLastName());
////
//
//        //create a new address
//        Address myFirstAddress = new Address();
//        myFirstAddress.setAddressNumber("360B");
//        myFirstAddress.setCity("St. Paul");
//        myFirstAddress.setStreet("Lexington St");
//        myFirstAddress.setStreet02("apt 111");
//
//        System.out.println(myFirstAddress.getAddressNumber() + " "
//                + myFirstAddress.getStreet() + " " + myFirstAddress.getStreet02()
//                + ", " + myFirstAddress.getCity() + " " + myFirstAddress.getDateCreate());
//
//
//
//        //create new client
//        Client myClient = new Client();
//        myClient.setClientName("World of Wireless");
//        myClient.setId(2);
//
//        System.out.println(" ");
//        System.out.println(myClient.getId() + ": " + myClient.getClientName());
//
//        //create new entity
//        Entitytype myEntityType = new Entitytype();
//
//
//        //create new phone with person name
//        Phone myPhone = new Phone();
//        myPhone.setFirstName("Bob");
//        myPhone.setLastName("Barker");
//        myPhone.setId(5);
//        myEntityType.setEntityTypeName("cell");
//        myPhone.setAreaCode(555);
//        myPhone.setPhoneNumber(555);
//        myPhone.setPhoneNumberPost(5555);
//
//        System.out.println(myPhone.getId() + ": " + myPhone.getFirstName() + " " +
//                myPhone.getLastName() + " " + myEntityType.getEntityTypeName() +
//                ": (" + myPhone.getAreaCode() + ")" + myPhone.getPhoneNumber() +
//                "-" + myPhone.getPhoneNumberPost());
//
//        System.out.println("did this work: " + myPhone.getNameNumber());
    }

    private static void FundamentalLab(){
        //create scanner object to ask user for number input
        Scanner reader = new Scanner(System.in);
        //number input
        System.out.print("Enter First Number: ");
        //read x first input
        String x = reader.nextLine();
        //ask for 2nd number
        System.out.print("Enter Second Number: ");
        //red y second number
        String y = reader.nextLine();
        //sum the two numbers a after changing it from a string to an int
        System.out.println("The Sum of the two numbers is  = " + (Integer.parseInt(x)+Integer.parseInt(y)));
    }

    private static void PrimitiveData(){

        //default vaules of the 8 primative data types and max/min where avalable
        System.out.println("Default byte value = " + b);
        System.out.println("Min byte value   = " + Byte.MIN_VALUE);
        System.out.println("Max byte value   = " + Byte.MAX_VALUE);
        System.out.println("Default short value  = " + s);
        System.out.println("Min short value  = " + Short.MIN_VALUE);
        System.out.println("Max short value  = " + Short.MAX_VALUE);
        System.out.println("Default int value  = " + i);
        System.out.println("Min int value    = " + Integer.MIN_VALUE);
        System.out.println("Max int value    = " + Integer.MAX_VALUE);
        System.out.println("Default long value  = " + l);
        System.out.println("Min long v4alue    = " + Long.MIN_VALUE);
        System.out.println("Max long value    = " + Long.MAX_VALUE);
        System.out.println("Default float value  = " + f);
        System.out.println("Min float value  = " + Float.MIN_VALUE);
        System.out.println("Max float value  = " + Float.MAX_VALUE);
        System.out.println("Default double value  = " + d);
        System.out.println("Min double value = " + Double.MIN_VALUE);
        System.out.println("Max double value = " + Double.MAX_VALUE);
        System.out.println("Default char value  = " + c);
        System.out.println("Default boolean value  = " + bl);

        //what is String data type and what is its values
        System.out.println("STring is a " + String.class);
        System.out.println("Default string value = " + st);

    }

    private static void MakingAList(){
        //create a list and populated it
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        System.out.println("The list is :  " + messages);

        System.out.println("Below is a for loop iterating through the list messages:");
        //iterate through list using a for loop and print each index to a new line
        for(String message : messages)      // foreach message in messages
            System.out.println(message);  // print the message

        //char[] is a primitive type only
    }

    private static void Lottery(){
        //Create variables of appropriate data types, to store information regarding a lottery ticket
        //Populate these variables and output them to the console.
        gameName = "Power Ball";
        drawingDate = LocalDate.of(2017,6,1);
        winningNumbers = Arrays.asList(12,23,33,49,57);
        ballTypes = Arrays.asList("white","white","white","white","red");
        jackPot = 250000;
        System.out.println("Lottery is: " + gameName);
        System.out.println("Drawing Date: " + drawingDate + "   Jackpot $" + jackPot);
        System.out.println("Winning Numbers are: ");
        //iterate through the winning numbers and corisponding type print match.
        for(int i=0; i<winningNumbers.size(); i++ ) // foreach winningNumbers and ballTypes
            System.out.println("Ball#: " + winningNumbers.get(i) +" "+ ballTypes.get(i));  // print the winning numbers and type
    }

    private static void FizzBuzzLesson() {
        //for loop runs through 0-100 find if divisible by 15,5,3 if no remainder
        //print fizz buzz or fizzbuzz if remainder print i
        for (int i=0; i<=100; i++ ){  //for loop to run through 0-100
            if (i % 15 == 0) {
                System.out.println(i + "/15 makes a: " + " FizzBuzz"); //check to see if any remainders
            } else if (i % 5 == 0){
                System.out.println(i + "/5 makes a: " + " Buzz"); //check to see if any remainders
            } else if (i % 3 == 0) {
                System.out.println(i + "/3 makes a: " + " Fizz"); //check to see if any remainders
            } else {
                System.out.println("Number:  " + i + " Not divisible by 3, 5, or 15"); //all other numbers should have remainders
            }
        }
    }

    private static void LessonCalculatorLab(){
        //method ask for user input and sends input to
        // calculator() to check if input is valid and if valid send to correct math method

        System.out.println("Enter only 0-9 for first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        System.out.println("First Number: ");
        num1 = inp.nextInt();
        System.out.println("Second Number: ");
        num2 = inp.nextInt();
        calculator(num1, num2);




    }

    //region methods used in the Calculator
    public static int add(int x, int y) //method for addition
    {
        return x + y;
    }
    public static int sub(int x, int y) //method for subtraction
    {
        return x - y;
    }
    public static int mult(int x, int y) //method for multiplication
    {
        return x * y;
    }
    public static int div(int x, int y) //method for division
    {
        return x / y;
    }
    //method that takes user inputs makes sure its valid and then runs through corresponding math method
    public static void calculator(int x, int y){
        if (x > 9 || y > 9 || y < 0 || x < 0){
            System.out.println("INVALID");
            System.out.println("read instructions carefully and try again");
            LessonCalculatorLab(); //start again if invalid
        } else {
            Scanner mathInpput = new Scanner(System.in);
            String chooseMath;
            System.out.println("Enter your selection: + for Addition, - for subtraction, * for Multiplication, and / for division:");
            chooseMath = mathInpput.next();

            switch (chooseMath){//switch case that takes user input and if valid runs through corresponding math method
                case "+" :
                    System.out.println(add( x, y));
                    break;
                case "-":
                    System.out.println(sub( x, y));
                    break;
                case "*":
                    System.out.println(mult( x, y));
                    break;
                case "/":
                    System.out.println(div( x, y));
                    break;
                default:
                    System.out.println("INVALID");
                    LessonCalculatorLab(); //restart if Invalid

            }



        }

    }
    //endregion

    private static void LessonCollections(){

        List<Employee> employeeList = new ArrayList<Employee>();
        Employee emp1 = new Employee("Jone", "Ark");
        Employee emp2 = new Employee("Billy", "Bod");
        Employee emp3 = new Employee("Jim", "John");
        Employee emp4 = new Employee("Phill", "Smith");

        employeeList.add(emp1);employeeList.add(emp2);employeeList.add(emp3);employeeList.add(emp4);

        //or combined like this
        employeeList.add(new Employee("Jeff","Doe"));

        System.out.println(emp1.getFirstName());
        System.out.println("use get index:  " + employeeList.get(3).getFirstName());

        for (Employee employee: employeeList)
            System.out.println("for each loop:  " + employee.getFirstName() + " " + employee.getLastName());

        for (Employee employee: employeeList)
            System.out.println("for each loop that uses a full name constructor: " + employee.getFullName());

    }

    private static void LessonClassNested(){

        Entitytype emailWorkType = new Entitytype("Work");
        emailWorkType.setEntityTypeid(1);

        Email myEmail = new Email("adrian@aston.com");
        myEmail.setEmailType(emailWorkType);

        System.out.println(myEmail.getEmailAddress() + "  Type:" +  myEmail.getEmailType().getEntityTypeName());
        System.out.println(myEmail.getEmailAddress() + "  Id:" +  myEmail.getEmailType().getEntityTypeid());
        System.out.println("or");
        System.out.println("Email address and Type in one get... " + myEmail.getEmailTypeAndEmail());




    }

    private static void LessonNestedAndCollected(){
        //colletion list of complex/nested objects/properties as a properties
        Employee myEmployee = new Employee();
        myEmployee.getEmails().add(new Email("test1@test.com"));
        myEmployee.getEmails().add(new Email("test2@test.com"));
        myEmployee.getEmails().add(new Email("test3@test.com"));

        for(Email email : myEmployee.getEmails())
            System.out.println(email.getEmailAddress());

    }

    private static void LessonInstantVsStatic(){
        MathHelper InstantofMathClass = new MathHelper();

        System.out.println(InstantofMathClass.E);
        System.out.println(InstantofMathClass.PI);

        System.out.println(InstantofMathClass.square(4));
        System.out.println(" ");


    }

    private static void LessonPolyMorphisum(){

        //compile time polymorphism (overloaded)



        //run time polymorphism (override)
        BaseBo baseBo = new BaseBo();
        System.out.println("super method: " + baseBo.overRideThisMethod());

        Entitytype entitytype = new Entitytype();

        System.out.println("sub method: " + entitytype.overRideThisMethod());

    }

    private static void LessonHash(){
        //key-value pairs / value list

        //to-do:  HashTable
            /*
            1) does not allow null for either key or value
            2) synchronized, thread safe,  but performance is decreased
             */
        System.out.println("------------HASH TABLE-------------------");

        Hashtable<Integer,String> hashTable = new Hashtable<>();
        hashTable.put(1, "Inheritance");
        hashTable.put(2, "Encapsulation");
        hashTable.put(3, "Abstraction");
        hashTable.put(4, "Polymorphism");

        System.out.println("value from hastTable by index 3: " + hashTable.get(3));
        System.out.println("      --for each loop of Hash Table--");
        for (Integer key: hashTable.keySet())
            System.out.println("key: " + key + " Value: " + hashTable.get(key));

        System.out.println("----------------------");
        //to-do:   HashMap
            /*
            1) Does allow null for either key or value
            2) un-synchronized, not thread safe, better performance
            */
        System.out.println("-------------HASH MAP--------------------");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Inheritance");
        hashMap.put(2, "Encapsulation");
        hashMap.put(3, "Abstraction");
        hashMap.put(4, "Polymorphism");
        hashMap.put(5, null);

        System.out.println("value from hashMap by index 3: " + hashMap.get(3));
        System.out.println("      --for each loop of hashMap--");
        for (Integer key: hashMap.keySet())
            System.out.println("key: " + key + " Value: " + hashMap.get(key));

        System.out.println("----------------------");
        //to-do:    HashSet
            /*
            1) built in mechanism for duplication, no key no multiples
            2) used for where you want to maintain a valume list
             */
        System.out.println("--------------HASH SET--------------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Inheritance");
        hashSet.add("Encapsulation");
        hashSet.add("Abstraction");
        hashSet.add("Polymorphism");
        for (String priciples : hashSet)
            System.out.println("for each string in hash set: " + priciples);


        System.out.println("--------------");


    }

    private static void LessonValueVsRef(){

        Employee firstEmp = new Employee();

        firstEmp.setFirstName("Adrian");

        Employee secoundEmp = firstEmp;
        firstEmp.setFirstName("Adrian the 2nd");//pointer to same thing
        firstEmp.setFirstName("Adrian the 3rd");//pointer/reference to same thing
        //since firstEmp is the same instance and is a reference type
        // the value changes to the last value made before printing
        System.out.println(secoundEmp.getFirstName());

        int firtInt = 1; //value type new variable
        int secondInt = firtInt; //this value equals first value type
        int firstInt = 2; //same name but different objects and value.

        System.out.println("secondInt: " + secondInt);
        //if it was reference type and not value type you would get same number below,
        //but since it is value type the numbers are different
        System.out.println("first firstInt: " + firtInt + " second firstInt: " + firstInt);

    }

    private static void OOP_Principles_Lab4(){
        System.out.println("-------LAB4-----------");
        //1. Diference between instance and static
        //a. Instance: An instance variable is one per Object,
        // every object has its own copy of instance variable.
        // Eg: as seen in the class MathHelper we created


        MathHelper t1 = new MathHelper();
        MathHelper t2 = new MathHelper();
        System.out.println("t1: " + t1.square(4) + " t2: " + t2.square(2));
        //Both t1 and t2 will have its own copy of what math square method will return.


        //b. Static: A static variable, method, or "nested class" is one copy per Class or instance,
        // every object of that class shares the same Static variable, method, or nested class.
        //Eg: we say this when declaring the variables
        // to get the default values of the primitive types
        System.out.println("--------question 2 reference vs value type-------");
        //2. Explain the difference between Reference vs Value types. Give examples.
        //a. a reference type reference the variable while a value type will create a new variable
        //eg. this is all sean in
        LessonValueVsRef();

        System.out.println("---------question 3 HashTable, HashMap, and HashSet---------");
        //3. Create a HashTable, HashMap, and HashSet of a list of funny items (funnier the better).
        //Error sending "EXE": File "Humor.exe" not found
        System.out.println("Error sending \"EXE\": File \"Humor.exe\" not found");
        System.out.println("------------HASH TABLE-------------------");

        Hashtable<Integer,Integer> hashTable = new Hashtable<>();
        hashTable.put(1, 1);
        hashTable.put(2, 2);
        hashTable.put(3, 3);
        hashTable.put(4, 4);

        for (Integer key: hashTable.keySet())
            System.out.println("key: " + key + " Value: " + hashTable.get(key));

        System.out.println("----------------------");

        System.out.println("-------------HASH MAP--------------------");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        hashMap.put(4, 4);
        hashMap.put(5, null);

        for (Integer key: hashMap.keySet())
            System.out.println("key: " + key + " Value: " + hashMap.get(key));

        System.out.println("----------------------");

        System.out.println("--------------HASH SET--------------------");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        for (Integer numbers : hashSet)
            System.out.println("for each string in hash set: " + numbers);


        System.out.println("--------------");



    }

    private static void InterfacesTest(){
        Site MN10 = new Site();
        MN10.setSiteName("MN10");
        MN10.setCoffeeMachines(3);
        MN10.setConferenceRoooms(1);
        MN10.setCubicles(8);
        MN10.setOffices(6);
        MN10.setTrainingDesks(36);

        Home AdriansHouse = new Home();
        AdriansHouse.setAddress("360 noway st");
        AdriansHouse.setOwner(new Employee("Adrian","Flak"));

        LessonInterfaces(MN10);
        LessonInterfaces(AdriansHouse);
    }

    private static void LessonInterfaces(ILocation ILocation) {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Location Name: " + ILocation.getLocationName());
        System.out.println("Can Have Meetings: " + ILocation.canHaveMeetings());
        System.out.println("Number of Workspaces: " + ILocation.numberOfWorkSpaces());
        System.out.println("Has coffee: " + ILocation.hasCoffee());
    }

    private static void LessonLogging(){

        //region levels of logging
        logger.debug("This is a DEBUG log message");
        logger.info("This is an INFO log message");

        // level warn and below is usually production
        logger.warn("This is a WARN log message");
        logger.error("This is an ERROR log message");
        logger.fatal("This is a FATAL log message");
        //endregion

        //region log an exception
        try {
            int i = 10/0;
        } catch (ArithmeticException ex){
            System.out.println("An Error has occurred. Count down till nuke launch: 10 sec.");
            logger.error("An exception has occurred: " + ex);
        }
        //endregion

    }

    private static void Lab5(){

        //region proof helpers are working

        System.out.println(StringHelper.hasSame("Adrian", "mat", "adrian"));//will return true

        System.out.println(StringHelper.hasSame("Matt","Mat","will","Fill"));//will return false

        //will remove duplicates case insensitive and return pritty version with fist letter capitalize
        System.out.println(StringHelper.deleteSame("Adrian", "mat", "adrian", "Fill", "mat"));

        System.out.println(StringHelper.capitalizer("aDrIan"));//make pretty and capitalize the first letter

        System.out.println("Add: " + MathHelper.add(2,2,2) + " Multiply: " + MathHelper.multiply(2,2,2) +
                " Subtract: " + MathHelper.subtract(2,2,2));// will return 6, 8, -2
        //endregion

    }

    private static void MyInterfaceTest(){

        //region Parameters to test interface
        MotorCycle NNN111 = new MotorCycle();
        NNN111.setNumberOfFrontDoors(0);
        NNN111.setNumberOfRearDoors(0);
        NNN111.setNumberOfWheels(3);
        NNN111.setVehicleMakeName(new Vehiclemake("Harley-Davidson"));
        NNN111.setVehicleModelName(new Vehiclemodel("TriGlide Ultra Classic"));
        NNN111.setYear(new Vehicle(2017));
        //endregion

        //test interfaces
        UseMyInterface(NNN111);
        UseCharSequence("Is radar reversed");
    }

    private static void UseMyInterface (IVehicle IVehicle) {
        //a scenario where using interfaces would be useful
        //vehicles, come in many shape sizes, flying, floating, and wheels.
        // WE might need to find a specific one that meets all needs
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Is it made after 2000: " + IVehicle.isMadeAfter2000());
        System.out.println("How many doors: " + IVehicle.numberOfDoors());
        System.out.println("How many wheels: " + IVehicle.numberOfWheels());
        System.out.println(IVehicle.getMakeAndModel());
        System.out.println("++++++++++++++++++++++++++++++");
    }

    private static void UseCharSequence(CharSequence string) {
        System.out.println(new StringBuilder(string).reverse().toString());
    }

    private static Connection LessonConnectToDataBase() {

        //region Parameters for db connection
        String dbhost = "localhost";
        String dbName = "master";
        String dbUser = "consoleuser";
        String dbPass = "consoleuser2317";
        String useSSL = "false";
        String procBod = "true";
        //endregion


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error("MySQL Driver Not Found: " + ex);
            return null;
        }

        logger.info("MySQL Driver Found");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + dbhost + ":3306/" +dbName+ "?useSSL="+ useSSL +"&noAccessToProcedureBodies="+procBod, dbUser, dbPass);
        } catch (SQLException ex) {
            logger.error("Connection to MySQL DataBase Failed: " + ex);
            return null;
        }

        if(connection != null){
            logger.info("Success! Connected to MySQL DataBase");
            return connection;
        } else {
            logger.info("connection failed");
            return null;
        }

    }

    private static void LessonExecQuery() {

        Connection conn = LessonConnectToDataBase();
        try {

            Statement statement = conn.createStatement();
        String sql = "SELECT Personid, FirstName, LastName FROM master.person";

            ResultSet rS = statement.executeQuery(sql);
            while (rS.next()) {

                //region Parameters for person table select
                int PersonId = rS.getInt(1);
                String FirstName = rS.getString(2);
                String LastName = rS.getString(3);
                //endregion

                logger.info( PersonId + ": " + FirstName + " " + LastName);
            }
            conn.close();

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

    }

    private static void LessonGetStoredProc(){

        Connection conn = LessonConnectToDataBase();

        try {
            String sp = "{call GetPerson(?,?)}";
            CallableStatement cStmt = conn.prepareCall(sp);

            cStmt.setInt(1,10);
            cStmt.setInt(2,2);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()){//get id first name and last name
                logger.info(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(4));
            }

        } catch(SQLException sqlEx){
            logger.error("Failed to call Procedure GetPerson: " + sqlEx);
            return;
        }


    }

    private static Connection LabConnectToSqlServer(){

        //region Parameters for db connection
        String url = "jdbc:sqlserver://localhost:1433;databaseName=master;integratedSecurity=true";

        //endregion


        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            logger.error("sqlserver Driver Not Found: " + ex);
            return null;
        }

        logger.info("sqlserver Driver Found");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            logger.error("Connection to sqlserver DataBase Failed: " + ex);
            return null;
        }

        if(connection != null){
            logger.info("Success! Connected to sqlserver DataBase");
            return connection;
        } else {
            logger.info("connection failed");
            return null;
        }
    }

    private static void TestSqlServer(){
        Connection conn = LabConnectToSqlServer();

        //region test select all stored procedure
        try {
            String sp = "{call usp_SelectEmployeesAll}";
            CallableStatement cStmt = conn.prepareCall(sp);

            //cStmt.setInt(1,1);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()){//get id first name and last name
                logger.info(rs.getInt(13) + ": " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch(SQLException sqlEx){
            logger.error("Failed to call Procedure ups_GetForEmployee: " + sqlEx);
        }
        //endregion

        System.out.println("+++++++++++++Select single employee by employeeid++++++++++++++++++++++++++++++");

        //region test select a single employee by employeeid
        try {
            String sp = "{call usp_SelectEmployee(?)}";
            CallableStatement cStmt = conn.prepareCall(sp);


            cStmt.setInt(1,6);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()){//get id first name and last name
                logger.info(rs.getInt(13) + ": " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch(SQLException sqlEx){
            logger.error("Failed to call Procedure ups_GetForEmployee: " + sqlEx);
        }
        //endregion

    }

    private static void LessonDAO(){

        //region CREATE MENU
        PersonDAO personDAO = new PersonDAOImplForSQLServer();
        List<Person> personList = personDAO.selectPersonList();

        System.out.println("=================================");

        for (Person person: personList){
            System.out.println(person.getPersonid() + ") " + person.getLastName() + ", " + person.getFirstName());
        }

        System.out.println("=================================");

        //endregion

        //region PROMPT USER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Person From List: ");
        String personId = scanner.nextLine();

        //endregion

        //region selectPersonDetails

        Person personDetail = personDAO.selectPersonById(Integer.parseInt(personId));

        System.out.println("_____Person Details_______");
        System.out.println("Id: " + personDetail.getPersonid());
        System.out.println("Title: " + personDetail.getTitle());
        System.out.println("Full Name: " + personDetail.GetFullName());
        System.out.println("Birth Date: " + personDetail.getBirthDate());

        //endregion

    }

    private static void DAOLab1(){

        //region test EmployeeDAO, Phone, and Email
        //region CREATE MENU
        EmployeeDAO employeeDAO = new EmployeeDaoImplSS();
        List<Employee> employeeList = employeeDAO.selectEmployeesAll();

        PhoneDAO phoneDAO = new PhoneDaoImplSS();
        List<Phone> phoneList = phoneDAO.selectPhonesAll();

        EmailDAO emailDAO = new EmailDaoImplSS();
        List<Email> emailList = emailDAO.selectEmailsAll();

        System.out.println("=================================");

        for (Employee employee: employeeList){
            System.out.println(employee.getEmployeeid() + ") " + employee.getLastName() + ", " + employee.getFirstName());
        }

        System.out.println("=================================");

        //endregion

        //region PROMPT USER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Employee From List You Want Email Address and/or Phone Number ");
        String employeeid = scanner.nextLine();

        //endregion

        //region selectEmployeeContact info

        Employee employeeInfo = employeeDAO.selectEmployeebyId(Integer.parseInt(employeeid));

        System.out.println("_____Contact Details_______");
        System.out.println("Id: " + employeeInfo.getEmployeeid());
        System.out.println("Title: " + employeeInfo.getTitle());
        System.out.println("Full Name: " + employeeInfo.getFullName());


        //for loop and if statement looking for phone numbers then emails that match corresponding ids of select employee
        for (Phone phone: phoneList){
            if (phone.getPersonid() == employeeInfo.getPersonid() ) {
                System.out.println("Phone Number: " + "(" + phone.getAreaCode()+ ")" + phone.getPhoneNumber()+ "-" + phone.getPhoneNumberPost());
            }
        }
        for (Email email: emailList){
            if (email.getEmployeeid() == Integer.parseInt(employeeid) ) {
                System.out.println("Email : " + email.getEmailAddress() );
            }
        }


        //endregion


        //endregion


        //region test Vehicle, VehicleMake, and VehicleModel

        //region CREATE MENU
        VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDaoImplSS();
        List<Vehiclemake> vehiclemakeList = vehicleMakeDAO.selectVehicleMakesAll();

        VehicleModelDAO vehicleModelDAO = new VehicleModelDaoImplSS();
        List<Vehiclemodel> vehiclemodelList = vehicleModelDAO.selectVehicleModelsAll();

        VehicleDAO vehicleDAO = new VehicleDaoImplSS();
        List<Vehicle> vehicleList = vehicleDAO.selectVehiclesAll();

        System.out.println("=================================");

        for (Vehiclemake vehiclemake: vehiclemakeList){
            System.out.println(vehiclemake.getVehicleMakeid() + ") " + vehiclemake.getVehicleMakeName());
        }

        System.out.println("=================================");

        //endregion

        //region PROMPT USER
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Select The Make From The List That You Want To See Vehicle Details For:  ");
        String vehicleMakeid = scanner2.nextLine();

        //endregion

        //region selectEmployeeContact info

        Vehiclemake vehiclemakeDetails = vehicleMakeDAO.selectVehicleMakeId(vehicleMakeid);

        System.out.println("_____Car Details_______");
        System.out.println("Id: " + vehiclemakeDetails.getVehicleMakeid());
        System.out.println("Make: " + vehiclemakeDetails.getVehicleMakeName());



        //for loop and if statement looking for phone numbers then emails that match corresponding ids of select employee
        for (Vehiclemodel model: vehiclemodelList){
            if (Integer.parseInt(vehicleMakeid) == Integer.parseInt(model.getVehicleMakeid()) ) {
                System.out.println("--------Model: " + model.getVehicleModelName()+ "------------- ");
                for (Vehicle vehicle: vehicleList){
                    if (vehicle.getVehicleModelid() == model.getVehicleModelid() ) {
                        System.out.println("Color: " + vehicle.getColor() + ", Year: " + vehicle.getYear() + ", Plate: " + vehicle.getLicensePlate());
                    }
                }
            }
        }



        //endregion



        //endregion

    }

    private static void LessonDAOInsert(){

        Person person = new Person();
        person.setTitle("Mr");
        person.setFirstName("Jim");
        person.setLastName("Beam");
        person.setBirthDate(new java.util.Date());
        person.setDisplayFirstName("jBeam");

        PersonDAO personDAO = new PersonDAOImplForSQLServer();
        int id = personDAO.insertPerson(person);

        logger.info("New person record inserted id = " + id);

    }

    private static void LessonDAOUpdate(){
        PersonDAO personDAO = new PersonDAOImplForSQLServer();

        Person person = personDAO.selectPersonById(12);
        person.setDisplayFirstName("UPDATED!!!!");

        if(personDAO.updatePerson(person)){
            logger.info("Person has been updated");
        }else {
            logger.info("Person update failed");
        }

    }

    private static void LessonDAODelete(){

        PersonDAO personDAO = new PersonDAOImplForSQLServer();


        if(personDAO.deletePerson(12)){
            logger.info("Person has been deleted");
        }else {
            logger.info("Person delete failed");
        }



    }

    private static void DAOLab2(){
        Person person = new Person();
        person.setTitle("Mr");
        person.setFirstName("Jim");
        person.setLastName("Beam");
        person.setBirthDate(new java.util.Date());
        person.setDisplayFirstName("jBeam");

        PersonDAO personDAO = new PersonDAOImplForSQLServer();
        int id = personDAO.insertPerson(person);

        logger.info("New person record inserted id = " + id);


    }


}

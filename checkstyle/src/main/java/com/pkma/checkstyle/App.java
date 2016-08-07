package com.pkma.checkstyle;


public class App {
  /*This is the main claz
   * @Javadoc*/
  public static void main(String[] args) {
    System.out.println("Hello World!");
    // Here The checks are indentation and some consmetic changes required
    
  }
  
  public void getSomeThing(){
  // Checkstyle will check unused methods, ofcourse eclipse will also as warning 
  //but we can not get reports from eclipse:)
  }
 /* mvn checkstyle:checkstyle
  * CheckStyle Configuration
  1) Got to windows preferences
  2) Go to Check style
  3) Create New Configuraion 
  4) Select the configuration creation and click configure
  5) Add required configurations
  6) Save your own checkstyoe configuration and save....*/
}

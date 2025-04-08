package PeriodicTableAwesomeGame;

import java.util.*;

class SetGame{
  Scanner hi;
  private Element [] arr = new Element[200];
  int correct = 0;
  int wrong = 0;
  
  public void startScanner(){
    hi = new Scanner(System.in);
  }

  public void stopScanner(){
    hi.close();
  }
  
  public void readyArray(){
    setElement(0, 0, "PLACEHOLDER", "PH");
    setElement(1, 1.008, "HYDROGEN", "H");
    setElement(2, 4.00, "HELIUM", "He");
    setElement(3, 6.94, "LITHIUM", "Li");
    setElement(4, 9.01, "BERYLLIUM", "Be");
    setElement(5, 10.81, "BORON", "B");
    setElement(6, 12.01, "CARBON", "C");
    setElement(7, 14.00, "NITROGEN", "N");
    setElement(8, 16.00, "OXYGEN", "O");
    setElement(9, 19.00, "FLUORINE", "F");
    setElement(10, 20.180, "NEON", "Ne");
    setElement(11, 22.99, "SODIUM", "Na");
    setElement(12, 24.31, "MAGNESIUM", "Mg");
    setElement(13, 26.98, "ALUMINUM", "Al");
    setElement(14, 28.09, "SILICON", "Si");
    setElement(15, 30.97, "PHOSPHORUS", "P");
    setElement(16, 32.07, "SULFUR", "S");
    setElement(17, 35.45, "CHLORINE", "Cl");
    setElement(18, 39.9, "ARGON", "Ar");
    setElement(19, 39.10, "POTASSIUM", "K");
    setElement(20, 40.08, "CALCIUM", "Ca");
    setElement(21, 44.96, "SCANDIUM", "Sc");
    setElement(22, 47.87, "TITANIUM", "Ti");
    setElement(23, 50.94, "VANADIUM", "V");
    setElement(24, 52.00, "CHROMIUM", "Cr");
    setElement(25, 54.94, "MANGANESE", "Mn");
    setElement(26, 55.85, "IRON", "Fe");
    setElement(27, 58.93, "COBALT", "Co");
    setElement(28, 58.69, "NICKEL", "Ni");
    setElement(29, 63.55, "COPPER", "Cu");
    setElement(30, 65.39, "ZINC", "Zn");
    setElement(31, 69.72, "GALLIUM", "Ga");
    setElement(32, 72.61, "My favorite; GERMANIUM", "Ge");
    setElement(33, 74.92, "ARSENIC", "As");
    setElement(34, 78.96, "SELENIUM", "Se");
    setElement(35, 79.90, "BROMINE", "Br");
    setElement(36, 83.80, "KRYPTON", "Kr");
    setElement(37, 85.47, "RUBIDIUM", "Rb");
    setElement(38, 87.62, "STRONTIUM", "Sr");
    setElement(47, 107.87, "SILVER", "Ag");
    setElement(50, 118.71, "TIN", "Sn");
    setElement(53, 126.90, "IODINE", "I");
    setElement(54, 131.29, "XENON", "Xe");
    setElement(55, 132.91, "CAESIUM", "Cs");
    setElement(56, 137.323, "BARIUM", "Ba");
    setElement(78, 195.08, "PLATINUM", "Pt");
    setElement(79, 196.67, "GOLD", "Au");
    setElement(80, 200.59, "MERCURY", "Hg");
    setElement(82, 207.2, "LEAD", "Pb");
    setElement(86, 222, "RADON", "Rn");
    setElement(87, 223, "FRANCIUM", "Fr");
    setElement(88, 226, "RADIUM", "Ra");
    setElement(118, 294, "OGANESSON", "Og");
    setElement(92, 238.03, "URANIUM", "U");
    setElement(94, 244, "PLUTONIUM", "Pu");
    // Other Elements not present because these are the only ones Mrs. Mellows clearly stated that she wanted us to know.
  }
  
  public void setElement(int Num, double Mass, String Name, String Initials){
    arr[Num] = new Element();
    arr[Num].setElectronNum(Num);
    arr[Num].setAtomicMass(Mass);
    arr[Num].setAtomName(Name);
    arr[Num].setAtomInitials(Initials);
  }

  public int randomElement(){
    int y = new Random().nextInt(54) + 1;
    if(y<39){
      
    }else{
      if(y==39) y=47;
      if(y==40) y = 50;
      if(y==41) y=53;
      if(y==42) y = 54;
      if(y==43) y = 55;
      if(y==44) y = 56;
      if(y==45) y = 78;
      if(y==46) y = 79;
      if(y==47) y = 80;
      if(y==48) y = 82;
      if(y==49) y = 86;
      if(y==50) y = 87;
      if(y==51) y = 88;
      if(y==52) y = 118;
      if(y==53) y = 92;
      if(y==54) y = 94;
    }
    return y;
  }

  public void askElement(){
    int z = randomElement();
    int zed = (int) (Math.random() * 2);
    boolean turing;
    if(zed == 0) turing = false;
    else turing = true;

    if(arr[z] != null){
    if(turing ==true){
      System.out.println("What is the shortform for " + arr[z].name());
      String c = hi.nextLine();
      if(c.equals(arr[z].initials())){
          System.out.println("Correct!");
        correct++;
      }else{ 
        System.out.println("Wrong, it is actually "+ arr[z].initials());
        wrong++;
      }
    }else{System.out.println("What is the full name of " + arr[z].initials());
          String b = hi.nextLine();
      if(b.equalsIgnoreCase(arr[z].name())){
        System.out.println("Correct!");
        correct++;
      }else{ 
        System.out.println("Wrong, it is actually "+ arr[z].name());
        wrong++;
      }
    }
    }else{
      System.out.println("Element not found.");
    }
  }

  public void Game(int b){
    for(int i = 0; i<b; i++){
      askElement();
    }
    System.out.println("Rounds up! You got " + correct + " correct and " + wrong + " wrong. Please play again!");
  }
}
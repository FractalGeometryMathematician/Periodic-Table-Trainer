package PeriodicTableAwesomeGame;

class Element{
    private int atomicElectronNum;
    private double atomicMass;
    private String atomName;
    private String atomInitials;
    
    public int getElectronNum(){
      return atomicElectronNum;
    }
  
    public void setElectronNum(int a){
      atomicElectronNum = a;
    }
  
    public double getatomicMass(){
      return atomicMass;
    }
  
    public void setAtomicMass(double b){
      atomicMass = b;
    }
  
    public String name(){
      return atomName;
    }
  
    public void setAtomName(String c){
      atomName = c;
    }
  
    public String initials(){
      return atomInitials;
    }
  
    public void setAtomInitials(String c){
      atomInitials = c;
    }
  }
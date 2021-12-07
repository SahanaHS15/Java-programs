interface IVehicle {
public double tuneUpCost();
public boolean canCarry(int numPassengers);



}



class Car implements IVehicle {



int mileage, year,numDoors;



boolean builtBefore(int otherYear) {



return this.year < otherYear;
}



@Override
public double tuneUpCost() {
// TODO Auto-generated method stub
return 0;
}



@Override
public boolean canCarry(int numPassengers) {
// TODO Auto-generated method stub
return false;
}}



class Bicycle implements IVehicle {



int mileage, numGears;



@Override
public double tuneUpCost() {
// TODO Auto-generated method stub
return 0;
}



@Override
public boolean canCarry(int numPassengers) {
// TODO Auto-generated method stub
return false;
}
}
package demoOfMaven.mavendemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {


Address addr;



public Address getAdd() {
return addr;
}



@Autowired
public void setAdd(Address add) {
this.addr = add;
}

void displayStu()
{
addr.displayAddress();
}


	}


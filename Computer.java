
package com.za.ac.y213036657;

/**
 *
 * @author Yongama Bidie
 */
public class Computer {


//Members function to store IP Address and the value
String IPAddress;
float Value;
//Parameterised constructor
public Computer(String ip,float value )
{
this.IPAddress=ip;
this.Value=value;
}
@Override
public String toString()
{
String s= this.IPAddress+" $"+this.Value+"\n";
return s;
}
}


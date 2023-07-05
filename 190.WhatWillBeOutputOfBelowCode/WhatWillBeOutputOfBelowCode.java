import java.util.*;
import java.util.stream.*;

class A
{
	void m1() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("In m1 A");
	}
}
class B extends A
{
	void m1() throws IndexOutOfBoundsException
	{
		System.out.println("In m1 B");
	}
}

public class WhatWillBeOutputOfBelowCode{
    public static void main(String [] args){
        A a=new B();
		a.m1();
    }
}
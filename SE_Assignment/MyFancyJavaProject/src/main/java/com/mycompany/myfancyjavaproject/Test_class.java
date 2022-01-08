/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfancyjavaproject;

/**
 *
 * @author Hp
 */
class Test_class {
    private static Test_class instance=null;
	
	private Test_class(String name,int id){
		ClassTest Test = new ClassTest(name,id);
	}
	
	public static Test_class getTest_class(String name,int id){
		if(instance==null)
			instance= new Test_class(name,id);
		
		return instance;
	}
}


class ClassTest{
	String name;
    int id;
	
	public ClassTest(String name,int id){
		super();
		this.name= name;
		this.id= id;
	}
}

class Test
{
	public static void main(String[] args) throws Exception
	{
		String name="developerY"
	    int id="72";
	Test_class Test=Test_class.getTest_class(name,id);
	}
}
		
	
	
	
	
	
	
	
	


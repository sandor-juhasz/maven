#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyPojo {

    private final String name;
    
    private final int age; 

	public MyPojo(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name; 
	}

	public int getAge() {
		return age;
	}
    
}

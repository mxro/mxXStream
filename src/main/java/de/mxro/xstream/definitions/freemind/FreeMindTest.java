package de.mxro.xstream.definitions.freemind;



public class FreeMindTest {

	
	public void testGetXML() {
		Map myMap = new Map();
		
		myMap.addNode(new Node("Test").addNode(new Node("SubNode")).addNode(new Node("SubNode2")));
		
		FreeMindWriter writer = new FreeMindWriter();
		System.out.println(writer.getXML(myMap));
	}

}

package de.mxro.xstream.definitions.freemind;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;


/**
 * Number of classes that use XStream serialisation framework to 
 * generate Freemind mindmaps http://freemind.sourceforge.net/ 
 * 
 * @author mx
 *
 */
public class FreeMindWriter {
	
	private final XStream xstream;
	
	protected void init() {
		Annotations.configureAliases(xstream, FreeMindObject.class);
		Annotations.configureAliases(xstream, Map.class);
		Annotations.configureAliases(xstream, Node.class);
		
	}
	
	public  String getXML(Map map) {
		return xstream.toXML(map);
	}

	public FreeMindWriter() {
		super();
		this.xstream = new XStream();
		init();
	}
	
	
	
}

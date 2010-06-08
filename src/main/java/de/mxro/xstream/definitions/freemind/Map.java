package de.mxro.xstream.definitions.freemind;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("map")
public class Map extends FreeMindObject {
	
	@XStreamAsAttribute
	public String version = "0.8.1";
}

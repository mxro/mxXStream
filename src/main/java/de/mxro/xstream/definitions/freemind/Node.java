package de.mxro.xstream.definitions.freemind;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;




@XStreamAlias("node")
public class Node  extends FreeMindObject {

	@XStreamAsAttribute
	private String LINK;
	
	@XStreamAsAttribute
	public String COLOR; // hex color eg  "#00b439" 
	
	@XStreamAsAttribute
	public String CREATED; // time eg "1248521778828"
	
	@XStreamAsAttribute
	public String ID; // identifier eg "Freemind_Link_1252651042"
	
	@XStreamAsAttribute
	public String MODIFIED; // time eg MODIFIED="1248521849162"
	
	@XStreamAsAttribute
	public String POSITION; // "left" or "right"
	
	@XStreamAsAttribute
	public String TEXT; // Text of the node
	
	
	public Node linkWith(String link){
		this.LINK=link;
		return this;
	}
	
	public Node(final String text) {
		super();
		this.TEXT = text;
	}
	
	
	
}

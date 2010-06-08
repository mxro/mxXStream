package de.mxro.xstream.filesystem.v01;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import de.mxro.utils.URI;
import de.mxro.utils.URIImpl;


public class URIConverter implements Converter {

	public void marshal(Object arg0, HierarchicalStreamWriter arg1,
			MarshallingContext arg2) {
		arg1.setValue(((URI) arg0).getScheme()+"://"+((URI) arg0).getPath());

	}

	public Object unmarshal(HierarchicalStreamReader arg0,
			UnmarshallingContext arg1) {
			final String value = arg0.getValue();
			
			URI uri = URIImpl.create(value);
			
			if (uri == null) return URIImpl.create("http:///");
			
			return URIImpl.create(value);
		
	}

	public boolean canConvert(Class arg0) {
		return arg0.equals(URIImpl.class);
	}

}

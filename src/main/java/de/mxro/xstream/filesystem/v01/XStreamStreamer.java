package de.mxro.xstream.filesystem.v01;

import com.thoughtworks.xstream.XStream;

import de.mxro.filesystem.v01.IncludedFile;
import de.mxro.filesystem.v01.IncludedFileSystem;
import de.mxro.filesystem.v01.LocalFile;
import de.mxro.filesystem.v01.LocalFolder;
import de.mxro.filesystem.v01.LocalRootFolder;

public class XStreamStreamer {
	
	public static void registerAllAnnotations(XStream stream) {
		stream.registerConverter(new URIConverter());
		
		stream.alias("de.mxro.URI", de.mxro.utils.URIImpl.class);
		stream.alias("v01.uri", de.mxro.utils.URIImpl.class);
		stream.alias("v01.localfolder", LocalFolder.class);
		stream.alias("v01.localfile",  LocalFile.class);
		stream.alias("v01.localrootfolder",  LocalRootFolder.class);
		stream.alias("v01.includedfile",  IncludedFile.class);
		stream.alias("v01.includedfilesystem", IncludedFileSystem.class);
		
	}
}

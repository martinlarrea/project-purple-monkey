package ar.edu.uns.cs.vyglab.java.util;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class CustomFileFilter extends FileFilter
{
    String extensions;
    String description;
    public CustomFileFilter(String extensions, String description)
    {
	this.extensions = extensions;
	this.description = description;
    }
    public boolean accept(File f)
    {
	if (f.isDirectory())
	    return true;
	String extension = getExtension(f);
        if (extension == null)
            return false;
	if (extension.equals( new String(this.extensions)) )
		return true;
	else return false;
	
    }
    public String getDescription()
    {
	return description;
    }
    public static String getExtension(File f)
    {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
        if (i > 0 &&  i < s.length() - 1)
            ext = s.substring(i+1).toLowerCase();
        return ext;
    }
}
package ar.edu.uns.cs.vyglab.java.util;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;

import java.text.*;
 
public class IntegerTextField extends JTextField
{
 
    private long maxValue = Long.MAX_VALUE;
    private long minValue = 0;
    private int maxLength = String.valueOf(maxValue).length();
    private boolean isIPField = false;
 
    /**
    * Default constructor for IntegerTextField.
    */
    public IntegerTextField()
    {
	super();
    }
 
    protected Document createDefaultModel()
    {
	return new IntegerDocument();
    }
 
    public void setMinValue(long value)
    {
	minValue = value;
    }
 
    public long getMinValue()
    {
	return minValue;
    }
 
 
    public void setIPField(boolean value)
    {
	isIPField = value;
    }
 
    public boolean getIPField()
    {
	return isIPField;
    }
 
    public void setMaxValue(long value)
    {
	maxValue = value;
    }
 
    public long getMaxValue()
    {
	return maxValue;
    }
 
    public void setMaxLength(int value)
    {
	maxLength = value;
    }
 
    public int getMaxLength()
    {
	return maxLength;
    }
 
 
    private class IntegerDocument extends PlainDocument
    {
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
	{
	    long typedValue = -1;
 
  	    StringBuffer textBuffer = new StringBuffer(IntegerTextField.this.getText().trim());
  	    //The offset argument must be greater than or equal to 0, and less than or equal to the length of this string buffer
  	    if((offs >= 0) && (offs <= textBuffer.length()))
  	    {
  	    	    textBuffer.insert(offs,str);
	    		String textValue = textBuffer.toString();
	    		if(textBuffer.length() > maxLength)
	    		{
					JOptionPane.showMessageDialog(IntegerTextField.this, "The number of characters 	must be less than or equal to " + getMaxLength(), "Error Message",JOptionPane.ERROR_MESSAGE);
					return;
	    		}
 
				if((textValue == null) || (textValue.equals("")))
				{
					remove(0,getLength());
					super.insertString(0, "", null);
					return;
				}
 
				if(textValue.equals("-") && minValue < 0)
				{
					super.insertString(offs,new String(str), a);
					return;
				}
 
		// 	    if(maxLength == 3 && str.equals(".") && isIPField)
				if(str.equals(".") && isIPField)
				{
					super.insertString(offs,new String(str),a);
					return;
				}
				else
				{
					try
					{
						typedValue = Long.parseLong(textValue);
						//TODO cambiar la condición a "es una clave existente"
						if((typedValue > maxValue) || (typedValue < minValue))
						{
							JOptionPane.showMessageDialog(IntegerTextField.this, DataCenter.langResource.getString("nokey_error"), "Error", JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							super.insertString(offs,new String(str),a);
						}
					}
					catch(NumberFormatException ex)
					{
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showMessageDialog(IntegerTextField.this, DataCenter.langResource.getString("numeric_error"), "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
		}
    }
}
}
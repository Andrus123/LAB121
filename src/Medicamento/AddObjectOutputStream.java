package Medicamento;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AddObjectOutputStream extends ObjectOutputStream{

	public AddObjectOutputStream(OutputStream out) throws IOException{
		super(out);
		//TODO Auto-generated constructor stub
	}
	@Override
	protected void writeStreamHeader() throws IOException {
		//TODO Auto-generated method stub
		this.reset();
	}
}

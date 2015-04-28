public class Question2{
	public static void txtCopy(String src, String dest) {
		try {
			int length = 0;
			File src_file =new File(src);
			File dest_file =new File(dest);
			InputStream inStream = new FileInputStream(src_file);
			OutputStream outStream = new FileOutputStream(dest_file);;
	    	byte[] buffer = new byte[(int) src_file.length()];
	    	while ((length = inStream.read(buffer)) > 0){
	    		outStream.write(buffer, 0, length);
	 	    }
	 	    if (inStream != null)
	 	    	inStream.close();
	 	    if (outStream != null)
	 	    	outStream.close();
		} catch (Exception exception) {
		}
 	}

	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
}

package patterns;

public class Images {
	public static Image createImage(String ext)
	{
		if (ext.equals("gif")){
			return new GifImage();
				}
		else if (ext.equals("bmp")){
			return new BmpImage();
		
		}
		return null;
	}

}

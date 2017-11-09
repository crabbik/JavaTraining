package json;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.Gson;

public class JsonToJ {

	public static void main(String[] args) {

		Gson gson = new Gson();

		try (Reader reader = new FileReader("jsonTest.json")) {

			Point[] point = gson.fromJson(reader, Point[].class);
			System.out.println(Arrays.toString(point));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
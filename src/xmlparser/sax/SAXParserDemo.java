package xmlparser.sax;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserDemo {

	public static void main(String[] args) {
		List<Point> pointsList = new ArrayList<Point>();
		UserHandler userhandler = null;

		try {
			File inputFile = new File(
					"C:/Users/user/workspace/sample-gls/src/xmlparser/Task7.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			userhandler = new UserHandler(pointsList);
			saxParser.parse(inputFile, userhandler);

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Point point : pointsList) {
			System.out.println(point);

		}
	}
}

import java.util.Scanner;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.*;
import org.opencv.video.*;
import org.opencv.objdetect.*;
import org.opencv.imgproc.*;
import org.opencv.imgcodecs.*;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfDouble;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;

public class HogBody {
	
	//color of bounding box
	private static final Scalar BOUNDING_BOX_COLOR = new Scalar(0, 255, 0, 255);
	
	
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		//Need this in order to even use opencv
		 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		 
		 
		 HOGDescriptor hog = new HOGDescriptor(); 
		 System.out.println("Initializing HOG detector with defaults");
		 
		 //trains the hog with the default dataset
		 hog.setSVMDetector(HOGDescriptor.getDefaultPeopleDetector());
		 
		// System.out.println("Enter a filename");
		//I was lazy and didn't make this right so whatever, we are gonna change it anyway
		 String src = "C:\\Users\\Ian\\eclipse-workspace\\CVRift\\src\\pedestrian.png";
		 
		 //loads image
		 Mat image = Imgcodecs.imread(src);
		 
		 //these two mats store results of hog
		 MatOfRect points = new MatOfRect();
		 MatOfDouble descriptors = new MatOfDouble();
		 
		 //I did the simpler detector with all the defaults
		 hog.detectMultiScale(image, points, descriptors);
		 System.out.println("Done detecting");
		 
		 
		 //draws rectangles over people, I guess
		 Rect[] peopleArray = points.toArray();
		 for(int i = 0; i < peopleArray.length; ++i) {
			 Imgproc.rectangle(image, peopleArray[i].tl(), peopleArray[i].br(), BOUNDING_BOX_COLOR, 3);
		 }
		 
		 Imgcodecs.imwrite(src, image);
		 System.out.println("Done!!!");
		 //input.close();
	}
	
}

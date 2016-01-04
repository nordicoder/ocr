package ocr;

import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvResetImageROI;
import static com.googlecode.javacv.cpp.opencv_core.cvSetImageROI;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.CvRect;
import com.googlecode.javacv.cpp.opencv_core.CvSize;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

public class please {
	
	
	public static void main(String args[])
	{
		IplImage source = cvLoadImage("download.jpg");
		IplImage cropSource;
		int roiSize = 10;
    	CvRect cvr=new CvRect();
    	CvSize cvs=new CvSize();
    	 CanvasFrame canvas;

		for(int j = 0; j < source.width()/roiSize;j++) {
		    for(int i = 0; i < source.height()/roiSize; ++i) {  
		    	cvr.x(i*roiSize);
		    	cvr.y(j*roiSize);
		    	cvr.width(roiSize);
		    	cvr.height(roiSize);
		        cvSetImageROI(source, cvr);

		        // cropped image
		        cvs.height(source.height());
		        cvs.width(source.width());
		      cropSource = cvCreateImage(cvs, source.depth(), source.nChannels());

		        // copy

		        // ... do what you want with your cropped image ...

		     canvas = new CanvasFrame("My Image");
		        
		        // request closing of the application when the image window is closed
		        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		                
		        // show image on window
		        canvas.showImage(cropSource);
		      
		      
		        // always reset the ROI
		      
		        cvResetImageROI(source);
		    }
		}
	}

}

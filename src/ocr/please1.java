package ocr;

import java.awt.image.BufferedImage;

import org.bytedeco.javacpp.opencv_core.CvRect;
import org.bytedeco.javacpp.opencv_core.Cv_iplCreateROI;


import org.bytedeco.javacpp.opencv_core.CvSize;
import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacpp.opencv_core.IplROI;
import org.bytedeco.javacv.CanvasFrame;
import static org.bytedeco.javacpp.opencv_highgui.cvLoadImage;





public class please1 {
	
	
	public static void main(String args[])
	{
		IplImage source = cvLoadImage("download.jpg");
	
		IplImage cropSource;
		IplROI ipr;
		int roiSize = 10;
    	CvRect cvr=new CvRect();
    	CvSize cvs=new CvSize();
    	 CanvasFrame canvas;
    	 

//		for(int j = 0; j < source.width()/roiSize-3;j++) {
//		    for(int i = 0; i < source.height()/roiSize-3; ++i) {  
		    	
    	 {{		    	
		        cropSource = new IplImage();

int i,j=0;
i=0;
		    	
		   
		    	ipr=new IplROI();
		    	ipr.xOffset(0);
		    	ipr.yOffset(0);
		    	ipr.width(10);
		    	ipr.height(10);

		    	//ipr=new IplROI(cvr.position());
		   

		        // cropped image
		      
		        
//		        cropSource.height(source.height());
//		        cropSource.width(source.width());
//		        cropSource.depth(source.depth());
//		        cropSource.nChannels(source.nChannels());

		        // copy

		        // ... do what you want with your cropped image ...

		     canvas = new CanvasFrame("My Image");
		        canvas.setSize(source.width(), source.height());
		        // request closing of the application when the image window is closed
		        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		                
		        // show image on window
		       source.roi(ipr);
		        cropSource=cropSource.create(source.height(),source.width(), source.depth(), source.nChannels());

		        cropSource=source.create(source.height(),source.width(), source.depth(), source.nChannels());

		        
		        System.out.println("------"+cropSource.width());
		        System.out.println("------"+source.width()+"-----"+canvas.WIDTH);

		        
		        canvas.showImage(cropSource);
		      
		      
		        // always reset the ROI
		        cvr.x(0);
		    	cvr.y(0);
		    	cvr.width(source.width());
		    	cvr.height(source.height());
		    	ipr=new IplROI(cvr.position());
		    	source.roi(ipr);
		      
		    }
		}
	}

}

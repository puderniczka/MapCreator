
package inz.mapcreator;

import java.awt.EventQueue;

public class Main {
    
    public static void main( String[] args ){
        
        // TEST_SVG t = new TEST_SVG();
       // t.test();
        
        EventQueue.invokeLater(new Runnable(){            
                @Override
                public void run(){
                    InzFrame frame = new InzFrame();
                    frame.setVisible(true);
                    frame.setResizable(true);
                }            
            }
        );
        
        /*try{
			GtfsReaderExampleMain r = new GtfsReaderExampleMain();
			r.TEST();
		}	
        catch( Exception e ){
		
		} */   
        
    }
    
    
    
}

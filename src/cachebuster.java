import java.text.SimpleDateFormat;
import java.util.Date;



public class cachebuster {

	static String dataconfig;
    static String datacss;

	public static String fn_call(String ATST, int flg) {
		
		String resulting = null;
		dataconfig= ATST;
        
       
        
        
        if(flg==1) 
        { dataconfig= ATST;
        for (String retval: dataconfig.split(".Add")) 
        {
               if(retval.contains("ui.min.js"))
                      update(retval);
               if(retval.contains(".clickable.min.js"))
                      update(retval);
               if(retval.contains("init.js"))
                      update(retval);
              
               resulting=dataconfig;
        }
        }
        else
        { datacss = ATST;
               System.out.println(datacss);
        for (String cssvalue: datacss.split("<link rel=")) 
        {
               if(cssvalue.contains("publication.css"))
                      change(cssvalue);
               if(cssvalue.contains("business.css"))
                      change(cssvalue);
               if(cssvalue.contains("style.css"))
                      change(cssvalue);
               if(cssvalue.contains("print.css"))
                      changeprint(cssvalue);
               resulting = datacss;
        }
        }
		return resulting;
        
       
        

	}
	public static String fn_timestamp(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		 String strtimestamp  = dateFormat.format(new Date());
		 strtimestamp = strtimestamp.replace(" ", "_"); 
		 return strtimestamp;
	}
 public static void update(String retvalcpy)
 {
        
        
               //System.out.println("----------------------------------------------------------");
               //System.out.println(retvalcpy);
               String[] result =  retvalcpy.split("=");
               String part2 = result[1];
               
               part2 = part2.replace("\")", "");
               System.out.println(part2);
              // Double d = Double.parseDouble(part2);
              // d=d+0.1;
               //System.out.println(d);
               String concat = fn_timestamp()+"\")";
               String result1 = result[0]+"="+concat;
               //System.out.println(result1);
               //System.out.println("----------------------------------------------------------");
                dataconfig = dataconfig.replace(retvalcpy, result1+"\n"+"\t"+"    ");
               //System.out.println(dataconfig);
                      
        
 }
 public static void change(String retvalcpy)
 {
        
        
               System.out.println("----------------------------------------------------------");
               System.out.println(retvalcpy);
               String[] result =  retvalcpy.split("ts=");
               String part2 = result[1];
             
               part2 = part2.replace("\")%>' />", "");
               System.out.println(part2);
               //Float d = Float.parseFloat(part2);
                //d=(float) (d+0.1);
              // System.out.println(d);
               String concat = fn_timestamp()+"\")%>' />";
               String result1 = result[0]+"ts="+concat;
               System.out.println(result1);
               System.out.println("----------------------------------------------------------");
               datacss = datacss.replace(retvalcpy, result1+"\n"+"    ");
               System.out.println(datacss);
                      
        
 }
 public static void changeprint(String retvalcpy)
 {

        System.out.println("----------------------------------------------------------");
        System.out.println(retvalcpy);
        String[] res =  retvalcpy.split("@");
        String printline = res[0];
        System.out.println("****"+printline);
        
        
        String[] result =  retvalcpy.split("ts=");
        

        String concat = fn_timestamp()+"\")%>' />";
        String result1 = result[0]+"ts="+concat;
        System.out.println(result1);
        System.out.println("----------------------------------------------------------");
        datacss = datacss.replace(printline, result1+"\n"+"    ");
        System.out.println(datacss);
               
 }
}




	 



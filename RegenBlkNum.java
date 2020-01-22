// RegenBlkNum.java
// re-generate Block of a GSI file

import java.text.*;
import java.io.*;
import java.util.*;

public class RegenBlkNum {
  public static void main(String[] args)throws Exception{
    if(args.length !=1){
      System.err.println("usage: java RegenBlkNum GSI_file");
      System.exit(1);
    }

    String block_number_style = "0000";
    DecimalFormat blockNumberFormatter = new DecimalFormat(block_number_style);

    BufferedReader in = in = new BufferedReader(new FileReader(args[0]));

    int index=1;
    String aLine = null;
    while((aLine=in.readLine())!=null){
      System.out.print(aLine.substring(0, 2));
      System.out.print(blockNumberFormatter.format(index));
      System.out.println(aLine.substring(6));
      index++;
    }

  }
}

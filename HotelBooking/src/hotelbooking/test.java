/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class MapReducer {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
	StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("D:\\JOB\\June\\24.06.2021\\Test\\paper.txt"))) {
                while (strLine != null)
                {
                    if (strLine == null)
                        break;
                    str_data += strLine;
                    strLine = br.readLine();
                    
                }
                //System.out.println(str_data);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        String [] data = str_data.split("|");
        for(int i = 0; i < 10; i++){
            System.out.println(data[i]);
        }
    }
}


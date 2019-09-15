package datastructure;

import codelab.status.Trainee;
import org.testng.internal.annotations.ITest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */
// adding by Megha to read the file
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
        String line = "";
        String SplitBy = " ";
        BufferedReader br = null;
        BufferedReader objReader = null;
        // Create the list
        LinkedList<String> list = new LinkedList<String>();

        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(textFile));

            while ((strCurrentLine = objReader.readLine()) != null) {

                String[] name = strCurrentLine.split(SplitBy);
               for (int j=0;j< name.length;j++)
                {
                    list.add(name[j]);
                    //System.out.println(name[j]);
                }
            }
            //Megha iterating thourgh linked list
            ListIterator<String> iter = list.listIterator();
            while (iter.hasNext()) {

                    System.out.println(iter.next());

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
